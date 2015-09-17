package paperjs
package Typography

import Basic._,Items._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
 * Created by yoelusa on 27/04/15.
 */

@js.native
@JSName("paper.PointText")
class PointText(point: Point) extends Item with TextItem {
  def this(obj: js.Dynamic) = this(Point(0,0))
}
