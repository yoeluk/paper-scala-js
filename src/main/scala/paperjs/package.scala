import org.scalajs.dom
import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
 * Created by yoelusa on 27/04/15.
 */

package object paperjs {
  import Items._,Basic._,Paths._,Styling.Color,Projects._,Tools._
  @js.native
  trait HitResult extends js.Object {
    @JSName("type")
    val hitType: String = js.native
    val name: String = js.native
    val item: Item = js.native
    val location: CurveLocation = js.native
    val color: Color = js.native
    val segment: Segment = js.native
    val point: Point = js.native
  }
  @js.native
  @JSName("paper.CurveLocation")
  class CurveLocation(curve: Curve, parameter: Double, point: Point)
    extends js.Object {
    val segment: Segment = js.native
    val intersection: CurveLocation = js.native
    val path: Item = js.native
    val index: Int = js.native
    val offset: Double = js.native
    val curveOffset: Double = js.native
    val distance: Double = js.native
    def equals(location: CurveLocation): Boolean = js.native
    override def toString: String = js.native
  }
  @js.native
  trait FontStyle extends js.Object {

    // Character Style

    var fontFamily: String = js.native
    var fontWeight: Int = js.native
    @JSName("fontWeight")
    var fontWeightStr: String = js.native
    var fontSize: Double = js.native
    var leading: Double = js.native
    @JSName("leading")
    var leadingStr: String = js.native

    // Paragraph Style

    var justification: String = js.native
  }
  @js.native
  trait EventHandling[T] extends js.Object {
    def on(event: String, function: js.ThisFunction1[View, dom.Event, Unit]): T = js.native
    @JSName("on")
    def bind(param: js.Dynamic): Unit = js.native
    def off(event: String, function: js.ThisFunction1[View, dom.Event, Unit]): T = js.native
    @JSName("off")
    def unbind(param: js.Dynamic): Unit = js.native
    def emit(event: String, eventProps: js.Dynamic): Boolean = js.native
    def responds(event: String): Boolean = js.native
  }
  @js.native
  trait MouseHandler extends js.Object {
    var onMouseDown: js.ThisFunction1[Item, ToolEvent, Unit] = js.native
    var onMouseUp: js.ThisFunction1[Item, ToolEvent, Unit] = js.native
    var onMouseMove: js.ThisFunction1[Item, ToolEvent, Unit] = js.native
  }
  implicit class PaperCompanionOps(val self: PaperScope.type) extends AnyVal {
    def apply(): PaperScope = new PaperScope()
  }
  @js.native
  @JSName("PaperScope")
  class PaperScope extends js.Object {
    def setup(canvas: html.Canvas): Unit = js.native
    def activate(): Unit = js.native
    def view: View = js.native
    def version: String = js.native
    var settings: js.Dynamic = js.native
    def project: Project = js.native
    def projects: js.Array[Project] = js.native
    def tool: Tool = js.native
    def tools: js.Array[Tool] = js.native
  }
  @js.native
  @JSName("PaperScope")
  object PaperScope extends js.Object {
    def get(id: Int): PaperScope = js.native
  }
  @js.native
  @JSName("paper")
  object Paper extends PaperScope
}