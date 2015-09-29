package cn.leo.helloscala


/**
 * Created by Administrator.
 * 2015/9/29 23:32
 */
object Charter14 extends App {

  def swap[S, T](pair: (S, T)) = {
    pair match {
      case (a, b) => (b, a)
    }
  }

  def swap(array: Array[Any]) = {
    array match {
      case Array(first, second, rest@_*) => Array(second, first) ++ rest
      case _ => array
    }
  }

  def leafSum(list: List[Any]): Int = {
    var total = 0
    list.foreach(e => e match {
      case i: Int => total += i
      case l: List[Any] => total += leafSum(l)
    })
    total
  }

  def getListSum(list: List[Option[Int]]): Int = {
    var total = 0
    list.foreach(e => {
      total += e.getOrElse(0)
    })
    total
  }

  def compose(f: Double => Option[Double], g: Double => Option[Double]) = {
    (x: Double) => {
      if (f(x) == None || g(x) == None) None
      else g(x)
    }
  }

  val l: List[Any] = List(List(3, 8), 2, List(5))
  println(leafSum(l))


  def f(x: Double) = if (x >= 0) Some(Math.sqrt(x)) else None

  def g(x: Double) = if (x != 1) Some(1 / (x - 1)) else None

  val h = compose(f, g)
  println(h(2))
}
