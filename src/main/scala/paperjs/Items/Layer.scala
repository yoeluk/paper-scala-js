package paperjs
package Items

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
 * Created by yoelusa on 25/04/15.
 */

@js.native
@JSName("paper.Layer")
class Layer(children: js.Array[Item]) extends Item with GroupNative {
  def this(obj: js.Dynamic) = this(js.Array[Item]())
  def activate(): Unit = js.native
}

object Layer {
  def apply(children: js.Array[Item]): Layer = new Layer(children)
}
