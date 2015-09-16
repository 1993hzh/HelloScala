package cn.leo.helloscala.traits

/**
 * Created by Administrator.
 * 2015/9/16 22:27
 */
trait RectangleLike {

  this: java.awt.geom.Ellipse2D.Double =>
  def translate(x: Double, y: Double): Unit = {
    this.x = x
    this.y = y
  }

  def grow(x: Double, y: Double): Unit = {
    this.x = x
    this.y = y
  }


}
