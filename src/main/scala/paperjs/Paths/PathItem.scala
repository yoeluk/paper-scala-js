package paperjs
package Paths

import Items._,Basic._

import scala.scalajs.js

/**
 * Created by yoelusa on 27/04/15.
 */

@js.native
trait PathItem extends Item {

  //Properties

  def pathData: String = js.native

  // Methods

  def getIntersections(path: PathItem, sorted: Boolean = false): js.Array[CurveLocation] =
    js.native
  def smooth(): Unit = js.native

  // Postscript Style Drawing Commands

  def moveTo(point: Point): Unit = js.native
  def lineTo(point: Point): Unit = js.native
  def cubicCurveTo(handle1: Point, handle2: Point, to: Point): Unit = js.native
  def quadraticCurveTo(handle: Point, to: Point): Unit = js.native
  def curveTo(through: Point, to: Point, parameter: Double = 0.5): Unit = js.native
  def arcTo(through: Point, to: Point): Unit = js.native
  def closePath(join: Boolean): Unit = js.native

  // Relative Drawing Commands

  def moveBy(to: Point): Unit = js.native
  def lineBy(to: Point): Unit = js.native
  def curveBy(through: Point, to: Point, parameter: Double = 0.5): Unit = js.native
  def cubicCurveBy(handle1: Point, handle2: Point, to: Point): Unit = js.native
  def quadraticCurveBy(handle: Point, to: Point): Unit = js.native
  def arcBy(through: Point, to: Point): Unit = js.native
  def arcBy(to: Point, clockwise: Boolean = true): Unit = js.native

  // Boolean Path Operations

  def unite(path: PathItem): PathItem = js.native
  def intersect(path: PathItem): PathItem = js.native
  def subtract(path: PathItem): PathItem = js.native
  def exclude(path: PathItem): Group = js.native
  def divide(path: PathItem): Group =js.native
}
