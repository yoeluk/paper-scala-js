package paperjs
package Basic

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
 * Created by yoelusa on 24/04/15.
 */

@js.native
trait RectProps extends js.Object {
  var x: Double = js.native
  var y: Double = js.native
  var width: Double = js.native
  var height: Double = js.native
  var point: Point = js.native
  var size: Size = js.native
  var left: Double = js.native
  var top: Double = js.native
  var right: Double = js.native
  var bottom: Double = js.native
  var center: Point = js.native
  var topLeft: Point = js.native
  var topRight: Point = js.native
  var bottomLeft: Point = js.native
  var bottomRight: Point = js.native
  var leftCenter: Point = js.native
  var topCenter: Point = js.native
  var rightCenter: Point = js.native
  var bottomCenter: Point = js.native
  def area: Double = js.native
  var selected: Boolean = js.native
}

object RectDims {
  def apply(x: Double, y: Double, width: Double, height: Double): RectProps =
    js.Dynamic.literal(
      "x" -> x,
      "y" -> y,
      "width" -> width,
      "height" ->height
    ).asInstanceOf[RectProps]
}

@js.native
@JSName("paper.Rectangle")
class Rect(x: Double, y: Double, width: Double, height: Double) extends RectProps {
  def this(p: Point, s: Size) = this(0,0,0,0)
  def this(props: RectProps) = this(0,0,0,0)
  def this(from: Point, to: Point) = this(0,0,0,0)
  def equals(rect: Rect): Boolean = js.native
  @JSName("equals")
  def ==(r: Rect): Boolean = js.native
  override def toString: String = js.native
  def isEmpty: Boolean = js.native
  def contains(point: Point): Boolean = js.native
  def contains(rect: Rect): Boolean = js.native
  def intersects(rect: Rect): Boolean = js.native
  def intersect(rect: Rect): Rect = js.native
  def unite(rect: Rect): Rect = js.native
  def include(point: Point): Unit = js.native
  def expand(amount: Double): Unit = js.native
  def expand(amount: Point): Unit = js.native
  def expand(amount: Size): Unit = js.native
  def expand(hor: Double, ver: Double): Unit = js.native
  def scale(amount: Double): Unit = js.native
  def scale(hor: Double, ver: Double): Unit = js.native
}

object Rect {
  def apply(x: Double, y: Double, width: Double, height: Double): Rect =
    new Rect(x, y, width, height)
  def apply(p: Point, s: Size): Rect = new Rect(p, s)
  def apply(props: RectProps): Rect = new Rect(props)
  def apply(from: Point, to: Point): Rect = new Rect(from,to)
}
