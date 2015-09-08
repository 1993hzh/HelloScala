package cn.leo.helloscala.objects

/**
 * Created by Administrator.
 * 2015/9/8 20:46
 */

class Point(x: Int, y: Int) {
  override def toString: String = "x=" + x + ", y=" + y
}

object Point extends App {

  def apply(x: Int, y: Int) = {
    new Point(x, y)
  }

  val p = Point(3, 4)
  print(p)

}
