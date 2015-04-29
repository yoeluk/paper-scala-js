# Paper-Scala-js
## A Scala.js binding for Paper.js

[Paper.js](http://paperjs.org/) is best described in their own words. So this description is an extract from their website. Paper.js — The Swiss Army Knife of Vector Graphics Scripting. It is an open source vector graphics scripting framework that runs on top of the HTML5 Canvas. It offers a clean Scene Graph / Document Object Model and a lot of powerful functionality to create and work with vector graphics and bezier curves, all neatly wrapped up in a well designed, consistent and clean programming interface.

To find out more about [Paper.js](http://paperjs.org/)  please visit their webite. Paper-Scala-js aim to make available all of Paper.js functionality from within a Scala.js application, and therefore in Scala, to its users. Undoubtedly we will fall short at times, primarily because in the JavaScript everything is possible, and if you spot where we haven’t yet deliver on our promises let us know and open an issue.

## Installing Paper-Scala-js

Paper-scala-js is published as a SNAPSHOT with Sonatype snapshots repository so add the following lines to build.sbt to add it to your project. Note that you don't need to add the Scala.js dom dependency, Paper-Scala-js will do that for you.

```
enablePlugins(ScalaJSPlugin)

resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

libraryDependencies ++= Seq(
  "com.github.yoeluk" %%% "paper-scala-js" % "0.1.2-SNAPSHOT"
)

jsDependencies += "org.webjars" % "paperjs" % "0.9.22" / "paper-full.min.js" commonJSName "paper"

persistLauncher in Compile := false

persistLauncher in Test := false

skip in packageJSDependencies := false
```

Add the following line to the plugins.sbt file under the Project/ directory to get the Scala.js plugin.

```
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.2")
```

Please note that Paper.js requieres setup and you can do that from withing Paper-Scala-js. See an example of an entry method below.

## Sketcher App

The example entry method below ilustrates what it feels like drawing and adding mouse events with Paper-Scala-js.

```scala
package sketcher

import org.scalajs.dom.html
import scala.scalajs.js.annotation.JSExport
import paperjs._
import Basic._,Paths._,Styling._,Tools._

@JSExport
object Sketcher {
  @JSExport
  def main(canvas: html.Canvas): Unit = {

    Paper.setup(canvas)
    val tool = Tool()

    val width, height = Var(0.0)
    val center = Paper.view.center
    val points = 10
    val smooth = Var(true)
    val path = Path()

    val mousePos = Var(Paper.view.center / 2)
    val heightBuff = Var(center.y)
    val pathHeight = Rx {
      heightBuff() + (center.y - mousePos().y - heightBuff()) / 10
    }
    val eventCount = Var(0)

    path.fillColor = Color("black")

    initializePath()

    def initializePath() = {
      width() = Paper.view.size.width
      height() = Paper.view.size.height / 2
      path.segments = js.Array[Segment]()
      path.addPoint(Paper.view.bounds.bottomLeft)
      for (i <- 1 to points - 1) {
        val point = Point(width() / points * i, center.y)
        path.addPoint(point)
      }
      path.addPoint(Paper.view.bounds.bottomRight)
      path.fullySelected = true
    }

    Obs(eventCount) {
      val pH = pathHeight()
      heightBuff() = pH
      for (i <- 1 to points - 1) {
        val sinSeed = eventCount() + i * 200
        val sinHeight = js.Math.sin(sinSeed / 200) * pathHeight()
        val yPos = js.Math.sin(sinSeed / 100) * sinHeight + height()
        path.segments(i).point.y = yPos
      }
      if (smooth()) path.smooth()
    }

    Obs(smooth) {
      if (!smooth()) {
        for (i <- 0 to path.segments.length - 1) {
          val segment = path.segments(i)
          segment.handleIn = Point.nullPoint
          segment.handleOut = Point.nullPoint
        }
      }
    }

    Paper.view.onFrame = (event: FrameEvent) => {
      eventCount() = event.count
    }

    tool.onMouseMove = (event: ToolEvent) => {
      mousePos() = event.point
    }

    tool.onMouseDown = (event: ToolEvent) => {
      val sm = smooth()
      smooth() = !sm
    }

    Paper.view.onResize = (event: FrameEvent) => {
      initializePath()
    }
  }
```

This example is part of a provisional demo project that you can find [here](https://github.com/yoeluk/sketch-app).

License
===
The code is available under [Apache 2](http://www.apache.org/licenses/LICENSE-2.0.txt) license. Feel free to contribute to it or to fork it.
