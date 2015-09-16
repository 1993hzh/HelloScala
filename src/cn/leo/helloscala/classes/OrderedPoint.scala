package cn.leo.helloscala.classes

import java.awt.{Point => JPoint}

/**
 * Created by Administrator.
 * 2015/9/16 22:37
 */
class OrderedPoint extends JPoint with Ordered[JPoint] {
  override def compare(that: JPoint): Int = {
    if (x <= that.x && y < that.y)
      -1
    else if (x == that.x && y == that.y)
      0
    else
      1
  }
}
