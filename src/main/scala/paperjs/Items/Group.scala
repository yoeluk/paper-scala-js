package paperjs
package Items

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
 * Created by yoelusa on 26/04/15.
 */

@js.native
trait GroupNative extends Item {
  var clipped: Boolean = js.native
}

@js.native
@JSName("paper.Group")
class Group(children: js.Array[Item]) extends GroupNative {
  def this(obj: js.Dynamic) = this(js.Array[Item]())
}

object Group {
  def apply(children: js.Array[Item]): Group = new Group(children)
}
