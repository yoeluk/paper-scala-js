package paperjs
package Basic

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
 * Created by yoelusa on 24/04/15.
 */

@js.native
trait SizeProps extends js.Object {
  var width: Double = js.native
  var height: Double = js.native
}

@js.native
@JSName("paper.Size")
class Size(width: Double, height: Double) extends SizeProps {
  def this(width: Double) = this(0,0)
  def this(point: Point) = this(0,0)
  def this(size: Size) = this(0,0)
  def this(props: SizeProps) = this(0,0)
  def add(d: Double): Size = js.native
  def add(s: Size): Size = js.native
  def subtract(d: Double): Size = js.native
  def subtract(s: Size): Size = js.native
  def multiply(d: Double): Size = js.native
  def multiply(s: Size): Size = js.native
  def divide(d: Double): Size = js.native
  def divide(s: Size): Size = js.native
  def modulo(i: Int): Size = js.native
  def modulo(s: Size): Size = js.native
  def equals(s: Size): Boolean = js.native
  @JSName("equals")
  def ==(s: Size): Boolean = js.native
  def isZero: Boolean = js.native
  def isNaN: Boolean = js.native
  def round(): Size = js.native
  def ceil(): Size = js.native
  def floor(): Size = js.native
  def abs(): Size = js.native
}

@js.native
@JSName("paper.Point")
object Size extends js.Object {
  def min(size1: Size, size2: Size): Size = js.native
  def max(size1: Size, size2: Size): Size = js.native
  def random(): Size = js.native
}
