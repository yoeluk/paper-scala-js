package paperjs
package Styling

import scala.scalajs.js
import Basic._

import scala.scalajs.js.annotation.JSName

/**
 * Created by yoelusa on 25/04/15.
 */

@js.native
@JSName("paper.GradientStops")
class GradientStops(color: String, rampPoint: Double) extends js.Object {
  def this(color: Color, rampPoint: Double) = this("",0)
  override def clone(): GradientStops = js.native
}

@js.native
trait Gradient extends js.Object {
  var stops: js.Array[Double] = js.native
  var radial: Boolean = js.native
  override def clone(): Gradient = js.native
  def equals(): Boolean = js.native
}

@js.native
@JSName("paper.Color")
class Color(red: Double, green: Double, blue: Double, alpha: Double) extends js.Object {
  def this(gray: Double, alpha: Double) = this(0,0,0,0)
  def this(gradient: Gradient, origin: Point, destination: Point,
           highlight: Point = Point(0,0)) = this(0,0,0,0)
  def this(obj: js.Dynamic) = this(0,0,0,0)
  def this(color: String) = this(0,0,0,0)
  def +(d: Double): Color = js.native
  def +(c: Color): Color = js.native
  def -(d: Double): Color = js.native
  def -(c: Color): Color = js.native
  def *(d: Double): Color = js.native
  def *(c: Color): Color = js.native
  def /(d: Double): Color = js.native
  def /(c: Color): Color = js.native
  val `type`: String = js.native
  def components: js.Array[Double] = js.native
  def hue: Double = js.native
  def saturation: Double = js.native
  def brightness: Double = js.native
  def lightness: Double = js.native
  def gradient: Gradient = js.native
  def highlight: Point = js.native
  def convert(`type`: String): Color = js.native
  def hasAlpha: Boolean = js.native
  def equals(color: Color): Boolean = js.native
  def equals(color: String): Boolean = js.native
  override def clone(): Color = js.native
  override def toString: String = js.native
  def toCSS(hex: Boolean): String = js.native
  def transform(matrix: Matrix): Unit = js.native
}

object Color {
  def apply(red: Double, green: Double, blue: Double, alpha: Double): Color =
    new Color(red,green,blue,alpha)
  def apply(gradient: Gradient, origin: Point, destination: Point,
            highlight: Point = Point(0,0)): Color =
    new Color(gradient,origin,destination,highlight)
  def apply(gray: Double, alpha: Double): Color = new Color(gray,alpha)
  def apply(obj: js.Dynamic): Color = new Color(obj)
  def apply(color: String): Color = new Color(color)
}
