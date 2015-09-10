package cn.leo.helloscala.classes


import java.awt.{Point => JavaPoint, Rectangle => JavaRectangle}

/**
 * Created by Administrator.
 * 2015/9/10 21:31
 */
class Square(point: JavaPoint, width: Int) extends JavaRectangle(point.x, point.y, width, width) {

  def this(width: Int) {
    this(new JavaPoint(0, 0), width)
  }

  def this() {
    this(new JavaPoint(0, 0), 0)
  }


  override def toString = "(" + point.x + ", " + point.y + "): " + width
}
