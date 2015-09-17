package paperjs
package Typography

import scala.scalajs.js

import Items._

/**
 * Created by yoelusa on 27/04/15.
 */

@js.native
trait TextItem extends Item with FontStyle {
  var content: String = js.native
}
