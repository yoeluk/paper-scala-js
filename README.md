# Paper-scala-js
## A Scala.js port for Paper.js

[Paper.js](http://paperjs.org/) is best described in their own words. So this description is a extract of their website. Paper.js — The Swiss Army Knife of Vector Graphics Scripting. It is an open source vector graphics scripting framework that runs on top of the HTML5 Canvas. It offers a clean Scene Graph / Document Object Model and a lot of powerful functionality to create and work with vector graphics and bezier curves, all neatly wrapped up in a well designed, consistent and clean programming interface.

To find out more about [Paper.js](http://paperjs.org/)  please visit their webite. Paper-scala-js aim to make available all of Paper.js functionality from within a Scala.js application, and therefore in Scala, to its users. Undoubtedly we will fall short at times, primarily because in the JavaScript everything is possible, and if you spot where we haven’t yet deliver on our promises let us and open an issue.

Repository
===
Paper-scala-js is not yet available from a repository - we are working on getting that set up - but you may clone it and add it as a subproject. If you are wondering how to do that please see an example project [here](https://github.com/yoeluk/sketch-app).

Skecher App
===

The example entry method below ilustrates what it feels like drawing and adding mouse events with Paper-scala-js

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

License
===
The code is available under [Apache 2](http://www.apache.org/licenses/LICENSE-2.0.txt) license. Feel free to contribute or fork.
