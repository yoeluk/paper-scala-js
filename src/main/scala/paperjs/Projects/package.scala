package paperjs

import scala.scalajs.js

/**
 * Created by yoelusa on 17/09/2015.
 */
package object Projects {
  @js.native
  trait FrameEvent extends js.Object {
    val delta: Double = js.native
    val time: Double = js.native
    val count: Int = js.native
  }
}
