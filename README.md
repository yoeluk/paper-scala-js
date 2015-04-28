# Paper-Scala-js
## A Scala.js binding for Paper.js

[Paper.js](http://paperjs.org/) is best described in their own words. So this description is an extract from their website. Paper.js — The Swiss Army Knife of Vector Graphics Scripting. It is an open source vector graphics scripting framework that runs on top of the HTML5 Canvas. It offers a clean Scene Graph / Document Object Model and a lot of powerful functionality to create and work with vector graphics and bezier curves, all neatly wrapped up in a well designed, consistent and clean programming interface.

To find out more about [Paper.js](http://paperjs.org/)  please visit their webite. Paper-Scala-js aim to make available all of Paper.js functionality from within a Scala.js application, and therefore in Scala, to its users. Undoubtedly we will fall short at times, primarily because in the JavaScript everything is possible, and if you spot where we haven’t yet deliver on our promises let us know and open an issue.

## Installing Paper-Scala-js

Paper-scala-js is published as a SNAPSHOT with Sonatype snapshots repository so add the following lines to build.sbt to add it to your project.

```
resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.8.0",
  "com.github.yoeluk" %%% "paper-scala-js" % "0.1-SNAPSHOT"
)

jsDependencies += "org.webjars" % "paperjs" % "0.9.22" / "paper-full.min.js" commonJSName "paper"
```

Aditionally, you need the Scala.js plugin. Add the following line to the plugins.sbt file under the Project/ directory.

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
import Basic._,Paths._,Items._,Styling._,Tools._

@JSExport
object Sketcher {
  @JSExport
  def main(canvas: html.Canvas): Unit = {

    Paper.setup(canvas)
    val tool = Tool()

    val newColor = Color("black")

    tool.onMouseMove = (e: ToolEvent) => {
      val path = Path.Circle(e.point, radius = 15)
      path.fillColor = newColor
      path.removeOnMove()
    }

    val circle = Shape.Circle(Point(200,200), radius = 50)

    circle.fillColor = Color("red")
    circle.strokeWidth = 3

    circle.onMouseEnter = (item: Item, e: ToolEvent) =>
      item.strokeColor = Color("green")

    Paper.view.update()
  }
}
```

This example is part of a provisional demo project that you can find [here](https://github.com/yoeluk/sketch-app).

License
===
The code is available under [Apache 2](http://www.apache.org/licenses/LICENSE-2.0.txt) license. Feel free to contribute to it or to fork it.
