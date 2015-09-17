package paperjs
package Styling

import scala.scalajs.js
import Projects._

import scala.scalajs.js.annotation.JSName

/**
 * Created by yoelusa on 25/04/15.
 */

@js.native
trait Style extends FontStyle {

  // Properties

  def view: View = js.native

  // Stroke Style

  var StrokeColor: Color = js.native
  @JSName("strokeColor")
  var StrokeColorStr: String = js.native
  var strokeWidth: Double = js.native
  var strokeCap: String = js.native
  var strokeJoin: String = js.native
  var strokeScaling: Boolean = js.native
  var dashOffset: Double = js.native
  var dashArray: js.Array[Int] = js.native
  var miterLimit: Double = js.native

  // Fill Style

  var fillColor: Color = js.native
  @JSName("fillColor")
  var fillColorStr: String = js.native


  // Shadow Style

  var shadowColor: Color = js.native
  @JSName("shadowColor")
  var shadowColorStr: String = js.native
  var shadowBlur: Double = js.native
  var shadowOffset: Double = js.native

  // Selection Style

  var selectedColor: Color = js.native
  @JSName("selectedColor")
  var selectedColorStr: String = js.native
}