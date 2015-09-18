package paperjs
package Basic

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
 * Created by yoelusa on 23/04/15.
 */

@js.native
trait PointProps extends js.Object {
  var angleInRadians: Double = js.native
  def quadrant: Double = js.native
  var selected: Boolean = js.native
  var x: Double = js.native
  var y: Double = js.native
}

@js.native
trait Vect extends PointProps {
  var angle: Double = js.native
  var length: Double = js.native
}

object Vect {
  def apply(angle: Double, length: Double): Vect =
    js.Dynamic.literal(
      angle = angle,
      length = length
    ).asInstanceOf[Vect]
}

@js.native
@JSName("paper.Point")
class Point(x: Double, y: Double) extends PointProps with Vect {
  def this(x: Double) = this(0,0)
  def this(props: PointProps) = this(0,0)
  def add(d: Double): Point = js.native
  def add(p: Point): Point = js.native
  def subtract(d: Double): Point = js.native
  def subtract(p: Point): Point = js.native
  def multiply(d: Double): Point = js.native
  def multiply(p: Point): Point = js.native
  def divide(d: Double): Point = js.native
  def divide(p: Point): Point = js.native
  def modulo(i: Int): Point = js.native
  def modulo(p: Point): Point = js.native
  override def toString(): String = js.native
  def equals(point: Point): Boolean = js.native
  @JSName("equals")
  def ==(point: Point): Boolean = js.native
  def getAngle(point: Point): Double = js.native
  def getAngleInRadians(point: Point): Double = js.native
  def getDistance(point: Point, squared: Boolean = false): Double = js.native
  def normalize(length: Double = 1.0): Point = js.native
  def rotate(angle: Double, center: Point = this): Point = js.native
  def transform(matrix: Matrix): Point = js.native
  def isInside(rect: Rect): Boolean = js.native
  def isClose(point: Point, tolerance: Double): Boolean = js.native
  def isColinear(point: Point): Boolean = js.native
  def isOrthogonal(point: Point): Boolean = js.native
  def isZero: Boolean = js.native
  def isNaN: Boolean = js.native
  def dot(point: Point): Double = js.native
  def cross(point: Point): Double = js.native
  def project(point: Point): Point = js.native
  def round(): Point = js.native
  def ceil(): Point = js.native
  def floor(): Point = js.native
  def abs(): Point = js.native
}

@js.native
@JSName("paper.Point")
object Point extends js.Object {
  def min(point1: Point, point2: Point): Point = js.native
  def max(point1: Point, point2: Point): Point = js.native
  def random(): Point = js.native
  def nullPoint: Point = js.native
}