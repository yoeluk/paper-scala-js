package paperjs
package Projects

import Basic._
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import org.scalajs.dom._

/**
 * Created by yoelusa on 25/04/15.
 */

@JSName("paper.View")
trait View extends EventHandling[View] {
  val element: raw.HTMLCanvasElement = js.native
  val pixelRatio: Double = js.native
  val resolution: Double = js.native
  var viewSize: Size = js.native
  def bounds: Rect = js.native
  def size: Size = js.native
  def center: Point = js.native
  def zoom: Double = js.native

  // Event Handlers

  var onFrame: js.ThisFunction1[View, dom.Event, Unit] = js.native
  var onResize: js.ThisFunction1[View, dom.Event, Unit] = js.native

  // Methods

  def remove(): Unit = js.native
  def isVisible(): Boolean = js.native
  def scrollBy(point: Point): Unit = js.native
  def play(): Unit = js.native
  def update(): Unit =js.native
  def projectToView(point: Point): Point = js.native
  def viewToProject(point: Point): Point = js.native
}
