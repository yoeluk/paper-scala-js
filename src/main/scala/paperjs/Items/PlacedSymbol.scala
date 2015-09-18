package paperjs
package Items

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import Basic._

/**
 * Created by yoelusa on 26/04/15.
 */

@js.native
@JSName("paper.PlacedSymbol")
class PlacedSymbol(symbol: Symbol, var point: Point = Point(0,0)) extends Item
