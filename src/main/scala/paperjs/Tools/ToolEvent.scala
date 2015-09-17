package paperjs
package Tools

import scala.scalajs.js
import Basic._,Items._

/**
 * Created by yoelusa on 27/04/15.
 */

@js.native
trait ToolEvent extends js.Object {
  val `type`: String = js.native
  val point: Point = js.native
  val lastPoint: Point = js.native
  val downPoint: Point = js.native
  val middlePoint: Point = js.native
  val delta: Point = js.native
  val count: Int = js.native
  val item: Item = js.native
  override def toString(): String = js.native
  val modifiers: js.Dynamic = js.native
}
