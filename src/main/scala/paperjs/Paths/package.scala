package paperjs

import scala.scalajs.js

/**
 * Created by yoelusa on 27/04/15.
 */
package object Paths {
  implicit class PathCompanionOps(val self: Path.type) extends AnyVal {
    def apply(segments: js.Array[Segment] = js.Array[Segment]()): Path = new Path(segments)
    def apply(obj: js.Dynamic): Path = new Path(obj)
    def apply(pathData: String): Path = new Path(pathData)
  }
}
