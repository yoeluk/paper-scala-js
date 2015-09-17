package paperjs
package Paths

import Items._

import scala.scalajs.js

/**
 * Created by yoelusa on 27/04/15.
 */

@js.native
class CompoundPath(pathData: String) extends Item with PathItem{
  def this(obj: js.Dynamic) = this("")

  // Properties

  var clockwise: Boolean = js.native
  def firstSegment: Segment = js.native
  def lastSegment: Segment = js.native
  def curves: js.Array[Curve] = js.native
  def firstCurve: Curve = js.native
  def lastCurve: Curve = js.native
  def area: Double = js.native

  // Methods

  def reverse(): Unit = js.native
}
