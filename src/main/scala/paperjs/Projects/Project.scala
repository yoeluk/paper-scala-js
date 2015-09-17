package paperjs
package Projects

import org.scalajs.dom.raw.HTMLCanvasElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import Styling._,Items._,Basic._

/**
 * Created by yoelusa on 25/04/15.
 */

@js.native
@JSName("paper.Project")
class Project(element: String) extends js.Object {
  def this(elem: HTMLCanvasElement) = this("")
  def view: View = js.native
  var currentStyle: Style = js.native
  def index: Int = js.native
  var layers: js.Array[Layer] = js.native
  def activeLayer: Layer = js.native
  def symbols: Symbol = js.native
  def selectedItems: js.Array[Item] = js.native
  def activate(): Unit = js.native
  def clear(): Unit = js.native
  def isEmpty: Boolean = js.native
  def remove(): Unit = js.native
  def selectAll(): Unit = js.native
  def deselectAll(): Unit = js.native
  def hitTest(point: Point, options: js.Dynamic =
    js.Dynamic.literal()): HitResult = js.native
  def getItems(matching: js.Dynamic = js.Dynamic.literal()): js.Array[Item] =
    js.native
  def getItem(matching: js.Dynamic = js.Dynamic.literal()): Item = js.native
  def exportJSON(options: js.Dynamic = js.Dynamic.literal()): String =
    js.native
  def importJSON(json: String): Unit = js.native
  def exportSVG(options: js.Dynamic = js.Dynamic.literal()): String =
    js.native
  def importSVG(svg: String, options: js.Dynamic = js.Dynamic.literal()): Item =
    js.native
}

object Project {
  def apply(element: String): Project = new Project(element)
  def apply(element: HTMLCanvasElement): Project = new Project(element)
}
