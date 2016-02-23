package paperjs
package Items

import org.scalajs.dom
import org.scalajs.dom.raw.SVGElement

import scala.scalajs.js
import Basic._, Styling._,Projects._,Tools.ToolEvent

import scala.scalajs.js.annotation.JSName

/**
 * Created by yoelusa on 25/04/15.
 */

@js.native
trait Item extends EventHandling[Item] with MouseHandler {

  // Properties

  var tangent: Point = js.native
  var normal: Point = js.native
  var curvature: Double = js.native
  val id: Int = js.native
  val className: String = js.native
  var name: String = js.native
  var style: Style = js.native
  var visible: Boolean = js.native
  var blendMode: String = js.native
  var opacity: Double = js.native
  var selected: Boolean = js.native
  var clipMask: Boolean = js.native
  var data: js.Dynamic = js.native

  // Position and Bounding Boxes

  var position: Point = js.native
  var pivot: Point = js.native
  var bounds: Rect = js.native
  var strokeBounds: Rect = js.native
  var handleBounds: Rect = js.native
  var rotation: Double = js.native
  var scaling: Double = js.native
  var matrix: Matrix = js.native
  var globalMatrix: Matrix = js.native
  var applyMatrix: Matrix = js.native

  // Project Hierarchy

  val project: Project = js.native
  val view: View = js.native
  val layer: Layer = js.native
  val parent: Item = js.native
  def children: js.Array[Item] = js.native
  def firstChild: Item = js.native
  def lastChild: Item = js.native
  def nextSibling: Item = js.native
  def previousSibling: Item = js.native
  def index: Int = js.native

  // Stroke Style

  var strokeColor: Color = js.native
  var strokeWidth: Double = js.native
  var strokeCap: String = js.native
  var strokeJoin: String = js.native
  var dashOffset: Double = js.native
  var strokeScaling: Boolean = js.native
  var dashArray: js.Array[Double] = js.native
  var miterLimit: Double = js.native
  var windingRule: String = js.native

  // Fill Style

  var fillColor: Color = js.native
  var selectedColor: Color = js.native
  var onFrame: js.Function1[dom.Event, Unit] => Unit = js.native
  var onClick: js.ThisFunction1[Item, ToolEvent, Unit] = js.native
  var onDoubleClick: js.ThisFunction1[Item, ToolEvent, Unit] = js.native
  var onMouseEnter: js.ThisFunction1[Item, ToolEvent, Unit] = js.native
  var onMouseLeave: js.ThisFunction1[Item, ToolEvent, Unit] = js.native

  // Methods

  def set(props: js.Dynamic): Item = js.native
  def clone(insert: Boolean = true): Item = js.native
  @JSName("copyTo")
  def copyToProj(proj: Project): Item = js.native
  @JSName("copyTo")
  def copyToLayer(layer: Layer): Item = js.native
  //def copyToGroup(group: Project): Item = js.native
  //def copyToCompPath(compPath: Project): Item = js.native
  def rasterize(resolution: Double = 1.0): Raster = js.native
  def contains(point: Point): Boolean = js.native
  def isInside(rect: Rect): Boolean = js.native
  def intersects(item: Item): Boolean = js.native
  def hitTest(point: Point, options: js.Dynamic): HitResult = js.native

  // Fetching and matching items

  def matches(matching: js.Dynamic): Boolean = js.native
  def matches(name: String, compare: js.Any): Boolean = js.native
  def getItems(matching: js.Dynamic = js.Dynamic.literal()): js.Array[Item] =
    js.native
  def getItem(matching: js.Dynamic = js.Dynamic.literal()): Item = js.native

  // Import / Export JSON and SVG

  def exportJSON(options: js.Dynamic = js.Dynamic.literal()): String =
    js.native
  def importJSON(json: String): Unit = js.native

  @JSName("exportSVG")
  def exportSVGAsString(options: js.Dynamic = js.Dynamic.literal(asString = true)): String =
    js.native
  @JSName("exportSVG")
  def exportSVG(options: js.Dynamic = js.Dynamic.literal()): SVGElement =
    js.native
  def importSVG(svg: String, options: js.Dynamic = js.Dynamic.literal()): Item =
    js.native

  // Hierarchy Operations

  def addChild(item: Item): Item = js.native
  def insertChildren(index: Int, item: Item): Item = js.native
  def addChildren(items: js.Array[Item]): js.Array[Item] = js.native
  def insertChildren(index: Int, items: js.Array[Item]): js.Array[Item] = js.native
  def insertAbove(item: Item): Item = js.native
  def insertBelow(item: Item): Item = js.native
  def sendToBack(): Unit = js.native
  def reduce(): Unit = js.native
  def replaceWith(item: Item): Boolean = js.native
  def remove(): Unit = js.native
  def removeChildren(): js.Array[Item] =js.native
  def removeChildren(from: Int, to: Int = 0): js.Array[Item] = js.native
  def reverseChildren(): Unit = js.native

  // Tests

  def isEmpty(): Boolean = js.native

  // Style Tests

  def hasFill(): Boolean = js.native
  def hasStroke(): Boolean = js.native
  def hasShadow(): Boolean = js.native

  // Hierarchy Tests

  def hasChildren(): Boolean = js.native
  def isInserted(): Boolean = js.native
  def isAbove(): Boolean = js.native
  def isBelow(item: Item): Boolean = js.native
  def isParent(item: Item): Boolean = js.native
  def isChild(item: Item): Boolean = js.native
  def isDescendant(item: Item): Boolean = js.native
  def isAncestor(item: Item): Boolean = js.native
  def isGroupedWith(item: Item): Boolean = js.native

  // Transform Functions

  def bringToFront(): Unit = js.native
  def translate(delta: Point): Unit = js.native
  def rotate(angle: Double, center: Point = Point(0,0)): Unit = js.native
  @JSName("scale")
  def scaleAll(scale: Double, center: Point = Point(0,0)): Unit = js.native
  def scale(hor: Double, ver: Double, center: Point = Point(0,0)): Unit = js.native
  @JSName("shear")
  def shearAll(shear: Double, center: Point = Point(0,0)): Unit = js.native
  def shear(hor: Double, ver: Double, center: Point = Point(0,0)): Unit = js.native
  @JSName("skew")
  def skewAll(skew: Double, center: Point = Point(0,0)): Unit = js.native
  def skew(hor: Double, ver: Double, center: Point = Point(0,0)): Unit = js.native
  def transform(matrix: Matrix): Unit = js.native
  def globalToLocal(point: Point): Point = js.native
  def localToGlobal(point: Point): Point = js.native
  def parentToLocal(point: Point): Point = js.native
  def localToParent(point: Point): Point = js.native
  def fitBounds(rectangle: Rect, fill: Boolean = false): Unit = js.native

  // Remove On Event

  def removeOn(params: js.Dynamic): Unit = js.native
  def removeOnMove(): Unit = js.native
  def removeOnDown(): Unit = js.native
  def removeOnDrag(): Unit = js.native
  def removeOnUp(): Unit = js.native
}