package paperjs
package Paths

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

import Basic._,Items._

/**
 * Created by yoelusa on 25/04/15.
 */

@js.native
@JSName("paper.Path")
class Path(var segments: js.Array[Segment] = js.Array[Segment]()) extends Item with PathItem {
  def this(obj: js.Dynamic) = this()
  def this(pathData: String) = this()

  // Properties

  def firstSegment: Segment = js.native
  def lastSegment: Segment = js.native
  def curves: Curve = js.native
  def firstCurve: Curve = js.native
  def lastCurve: Curve = js.native
  var closed: Boolean = js.native
  var length: Double = js.native
  def area: Double = js.native
  var fullySelected: Boolean = js.native
  var clockwise: Boolean = js.native
  def interiorPoint: Point = js.native

  // Methods

  def add(segment: Segment): Segment = js.native
  def add(point: Point): Point = js.native
  def insert(index: Int, segment: Segment): Segment = js.native
  def addSegments(segments: js.Array[Segment]): js.Array[Segment] = js.native
  def insertSegments(index: Int, segments: js.Array[Segment]): js.Array[Segment] = js.native
  def removeSegment(index: Int): Segment = js.native
  def removeSegments(from: Int, to: Int = 0): js.Array[Segment] = js.native
  def flatten(maxDistance: Double): Unit = js.native
  override def reduce(): Unit = js.native
  def simplify(tolerance: Double = 2.5): Unit = js.native
  def split(offset: Double): Path = js.native
  def split(location: CurveLocation): Path = js.native
  def split(index: Int, parameter: Double): Path = js.native
  def reverse(): Unit = js.native
  def join(path: Path): Path = js.native

  // Positions on Paths and Curves

  def getLocationOf(point: Point): CurveLocation = js.native
  def getOffsetOf(point: Point): Double = js.native
  def getLocationAt(offset: Double, isParameter: Boolean = false): CurveLocation = js.native
  def getPointAt(offset: Double, isParameter: Boolean): Point = js.native
  def getTangentAt(offset: Double, isParameter: Boolean): Point = js.native
  def getNormalAt(offset: Double, isParameter: Boolean): Point = js.native
  def getCurvatureAt(offset: Double, point: Point): Double = js.native
  def getNearestPoint(point: Point): Point = js.native
}

@js.native
@JSName("paper.Path")
object Path extends js.Object {
  def Line(from: Point, to: Point): Path = js.native
  def Line(obj: js.Dynamic): Path = js.native
  def Circle(center: Point, radius: Double): Path = js.native
  def Circle(obj: js.Dynamic): Path = js.native
  def Rectangle(rectangle: Rect, radius: Double = 1.0): Path = js.native
  def Rectangle(point: Point, size: Size): Path = js.native
  def Rectangle(obj: js.Dynamic): Path = js.native
  def Ellipse(rectangle: Rect): Path = js.native
  def Ellipse(obj: js.Dynamic): Path = js.native
  def Arc(from: Point, through: Point, to: Point): Path = js.native
  def Arc(obj: js.Dynamic): Path = js.native
  def RegularPolygon(center: Point, sides: Int, radius: Double): Path = js.native
  def RegularPolygon(obj: js.Dynamic): Path = js.native
  def Star(center: Point, points: Int, radius1: Double, radius2: Double): Path = js.native
  def Star(obj: js.Dynamic): Path = js.native
}