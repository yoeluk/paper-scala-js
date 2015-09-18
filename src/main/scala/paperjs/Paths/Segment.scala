package paperjs
package Paths

import scala.scalajs.js
import Basic._

import scala.scalajs.js.annotation.JSName

/**
 * Created by yoelusa on 25/04/15.
 */

@js.native
@JSName("paper.Segment")
class Segment(var point: Point, var handleIn: Point = Point(0,0),
              var handleOut: Point = Point(0,0)) extends js.Object {
  def this(obj: js.Dynamic) = this(Point(0,0))

  // Properties

  var linear: Boolean = js.native
  var selected: Boolean = js.native

  // Hierarchy

  def index: Int = js.native
  def path: Path = js.native
  def curve: Curve = js.native
  def location: CurveLocation = js.native

  // Sibling Segments

  def next: Segment = js.native
  def previous: Segment = js.native

  // Methods

  def isColinear(segment: Segment): Boolean = js.native
  def isArc: Boolean = js.native
  def reverse(): Segment = js.native
  def remove(): Boolean = js.native
  override def toString: String = js.native
  def transform(matrix: Matrix): Unit = js.native
}

object Segment {
  def apply(point: Point, handleIn: Point = Point(0,0), handleOut: Point = Point(0,0)): Segment =
    new Segment(point, handleIn, handleOut)
}
