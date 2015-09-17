package paperjs
package Basic

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
 * Created by yoelusa on 25/04/15.
 */

@js.native
trait MatrixProps extends js.Object {
  var a: Double = js.native
  var b: Double = js.native
  var c: Double = js.native
  var d: Double = js.native
  var tx: Double = js.native
  var ty: Double = js.native
  def values: js.Array[Double] = js.native
  def translation: Point = js.native
  def scaling: Point = js.native
  def rotation: Double = js.native
}

@js.native
@JSName("paper.Matrix")
class Matrix(a: Double, b: Double, c: Double, d: Double,
             tx: Double, ty: Double) extends MatrixProps {
  def set(a1: Double, b1: Double, c1: Double, d1: Double,
          tx1: Double, ty1: Double): Matrix = js.native
  def equals(matrix: Matrix): Boolean = js.native
  @JSName("equals")
  def ==(matrix: Matrix): Boolean = js.native
  override def toString: String = js.native
  def reset(): Unit = js.native
  def apply(recursively: Boolean): Boolean = js.native
  def translate(point: Point): Matrix = js.native
  def translate(dx: Double, dy: Double): Matrix = js.native
  //def scale(scale: Double, center: Point = Point(0,0)): Matrix = js.native
  def scale(hor: Double, ver: Double, center: Point = Point(0,0)): Matrix =
    js.native
  def rotate(angle: Double, center: Point): Matrix = js.native
  def rotate(angle: Double, x: Double, y: Double): Matrix = js.native
  def shear(hor: Double, ver: Double, center: Point = Point(0,0)): Matrix =
    js.native
  def skew(hor: Double, ver: Double, center: Point = Point(0,0)): Matrix =
    js.native
  def concatenate(mx: Matrix): Matrix = js.native
  def preConcatenate(mx: Matrix): Matrix = js.native
  def chain(mx: Matrix): Matrix = js.native
  def isIdentity: Boolean = js.native
  def isInvertible: Boolean = js.native
  def isSingular: Boolean = js.native
  def transform(point: Point): Point = js.native
  def transform(src: Double, dst: Double, count: Double): Double = js.native
  def inverseTransform(point: Point): Point = js.native
  //def decompose(): Dynamic = js.native
  def inverted(): Matrix = js.native
  //def applyToContext(ctx: dom.CanvasRenderingContext2D)
}
