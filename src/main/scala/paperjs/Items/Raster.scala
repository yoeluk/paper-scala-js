package paperjs.Items

import scala.scalajs.js
import paperjs._
import Basic._,Styling._

import scala.scalajs.js.annotation.JSName
import org.scalajs.dom._

/**
 * Created by yoelusa on 26/04/15.
 */

@js.native
@JSName("paper.Raster")
class Raster(var source: String, position: Point = Point(0,0)) extends Item {
  def this(source: raw.HTMLImageElement, position: Point) = this("", position)
  def this(source: raw.HTMLCanvasElement, position: Point) = this("", position)
  def this(obj: js.Dynamic) = this("", Point(0,0))
  var size: Size = js.native
  var width: Double = js.native
  var height: Double = js.native
  def resolution: Size = js.native
  def image: raw.HTMLImageElement = js.native
  @JSName("image")
  def imageCanvas: html.Canvas = js.native
  def canvas: html.Canvas = js.native
  def context: CanvasRenderingContext2D = js.native

  // Methods

  def getSubCanvas(rect: Rect): html.Canvas = js.native
  def getSubRaster(rect: Rect): Raster = js.native
  def toDataURL: String = js.native
  def drawImage(image: raw.HTMLImageElement, point: Point): Unit = js.native
  @JSName("drawImage")
  def drawCanvas(canvas: html.Canvas, point: Point): Unit = js.native
  def getAverageColor(obj: js.Dynamic): Color = js.native

  // Pixel

  def getPixel(x: Double, y: Double): Color = js.native
  @JSName("getPixel")
  def getPointWithPoint(point: Point): Color = js.native
  def setPixel(x: Double, y: Double, color: Color): Unit =js.native
  @JSName("setPoint")
  def setPixelWithPoint(x: Double, y: Double, color: Color): Unit =js.native

  // Image Data

  def createImageData(size: Size): Unit = js.native
  def getImageData(rect: Rect): raw.ImageData = js.native
  def setImageData(data: raw.ImageData, point: Point): Unit = js.native
}
