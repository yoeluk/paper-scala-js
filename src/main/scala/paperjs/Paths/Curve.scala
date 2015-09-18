package paperjs
package Paths

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import Basic._

/**
 * Created by yoelusa on 25/04/15.
 */

@js.native
@JSName("paper.Curve")
class Curve(var segment1: Segment, var segment2: Segment) extends js.Object {
  def this(point1: Point, handle1: Point, handle2: Point, point2: Point) =
    this(Segment(Point(0,0)),Segment(Point(0,0)))

  // Properties

  def path: Path = js.native
  def index: Int = js.native
  def next: Curve = js.native
  def previous: Curve = js.native
  var selected: Boolean = js.native
  def length: Double = js.native
  var bounds: Rect = js.native
  var strokeBounds: Rect = js.native
  var handleBounds: Rect = js.native

  // Methods

  def isLinear: Boolean = js.native
  def divide(offset: Double = 0.5, isParameter: Boolean): Curve = js.native
  def split(offset: Double, isParameter: Boolean = false): Path = js.native
  def reverse(): Curve = js.native
  def remove(): Boolean = js.native
  override def clone(): Curve = js.native
  override def toString: String = js.native
  def getParameterAt(offset: Double, start: Double = 1.0): Double = js.native
  def getParameterOf(point: Point): Double = js.native
  def getLocationAt(offset: Double, isParameter: Boolean = false): CurveLocation = js.native
  def getLocationOf(point: Point): CurveLocation = js.native
  def getPointAt(offset: Double, isParameter: Boolean = false): Point = js.native
  def getTangentAt(offset: Double, isParameter: Boolean = false): Point = js.native
  def getNormalAt(offset: Double, isParameter: Boolean = false): Point = js.native
  def getCurvatureAt(offset: Double, isParameter: Boolean = false): Point = js.native
}
