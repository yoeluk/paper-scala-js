package paperjs
package Items

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import Basic._

/**
 * Created by yoelusa on 26/04/15.
 */

@js.native
@JSName("paper.Shape")
trait Shape extends Item {
  @JSName("type")
  def typeName: String =js.native
  def size: Size = js.native
  def radius: Double = js.native
}

@js.native
@JSName("paper.Shape")
object Shape extends js.Object {
  def Circle(center: Point, radius: Double): Shape = js.native
  def Circle(obj: js.Dynamic): Shape = js.native
  def Rectangle(rectangle: Rect, radius: Double = 1.0): Shape = js.native
  def Rectangle(point: Point, size: Size): Shape = js.native
  def Rectangle(obj: js.Dynamic): Shape = js.native
  def Ellipse(rectangle: Rect): Shape = js.native
  def Ellipse(obj: js.Dynamic): Shape = js.native
}
