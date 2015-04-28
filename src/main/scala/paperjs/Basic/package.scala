package paperjs

/**
 * Created by yoelusa on 24/04/15.
 */

package object Basic {
  implicit class PointCompanionOps(val self: Point.type) extends AnyVal {
    def apply(x: Double, y: Double): Point = new Point(x, y)
    def apply(x: Double): Point = new Point(x)
    def apply(props: PointProps): Point = new Point(props)
  }
  implicit class SizeCompanionOps(val self: Size.type) extends AnyVal {
    def apply(width: Double, height: Double): Size = new Size(width, height)
    def apply(p: Point): Size = new Size(p)
    def apply(props: SizeProps): Size = new Size(props)
  }
  implicit def toPointOps(p: Point): PointOps = new PointOps(p)
  class PointOps(p: Point) {
    def *(p1: Point): Point = p multiply p1
    def *(d: Double): Point = p multiply d
    def /(p1: Point): Point = p divide p1
    def /(d: Double): Point = p divide d
    def +(p1: Point): Point = p add p1
    def +(d: Double): Point = p add d
    def -(p1: Point): Point = p subtract p1
    def -(d: Double): Point = p subtract d
    def %(i: Int): Point = p modulo i
    def %(i: Point): Point = p modulo i
  }
  implicit def toSizeOps(s: Size): SizeOps = new SizeOps(s)
  class SizeOps(s: Size) {
    def *(s1: Size): Size = s multiply s1
    def *(d: Double): Size = s multiply d
    def /(s1: Size): Size = s divide s1
    def /(d: Double): Size = s divide d
    def +(s1: Size): Size = s add s1
    def +(d: Double): Size = s add d
    def -(s1: Size): Size = s subtract s1
    def -(d: Double): Size = s subtract d
    def %(i: Int): Size = s modulo i
    def %(i: Size): Size = s modulo i
  }
}
