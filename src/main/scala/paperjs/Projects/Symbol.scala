package paperjs
package Projects

import scala.scalajs.js
import Items._,Basic._

import scala.scalajs.js.annotation.JSName

/**
 * Created by yoelusa on 25/04/15.
 */

@js.native
@JSName("paper.Symbol")
class Symbol(item: Item, dontCenter: Boolean = false) extends js.Object {
  val project: Project = js.native
  var definition: Item = js.native
  def place(position: Point = Point(0,0)): PlacedSymbol = js.native
  override def clone(): Symbol = js.native
  def equals(symbol: Symbol): Boolean = js.native
}

object Symbol {
  def apply(item: Item, dontCenter: Boolean = false) = new Symbol(item,dontCenter)
}
