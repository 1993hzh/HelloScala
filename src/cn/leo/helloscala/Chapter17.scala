package cn.leo.helloscala

/**
 * Created by leo on 15-10-9.
 */
object Chapter17 extends App {

  val pair: Pair[Int, String] = new Pair(1 -> "s")
  println(pair + " swap: " + pair.swap())
  println(pair + " swap: " + swap(pair))

  val pair1 = new Pair1(97 -> 'a')
  println(pair1.swap)
  pair1.p = 98 -> 'b'
  println(pair1.swap)

  println(middle("World"))

  val pp1 = new Pair2(1, "s")
  println(pp1)
  //  pp1.swap  //Error
  println(pp1)
  val pp2 = new Pair2(1, 3)
  println(pp2)
  pp2.swap
  println(pp2)

  class Pair[T, S](val p: (T, S)) {
    def swap() = {
      (p._2, p._1)
    }
  }

  class Pair1[T](var p: (T, T)) {
    def swap() = {
      (p._2, p._1)
    }
  }

  def swap[S, T](pair: Pair[S, T]) = {
    (pair.p._2, pair.p._1)
  }

  def middle[T](value: Iterable[T]): T = {
    def list = value.toList
    list(list.size / 2)
  }

  class Pair2[T, S](var first: T, var second: S) {
    def swap(implicit ev1: T =:= S, ev2: S =:= T) {
      val temp = first
      first = second
      second = temp
    }

    override def toString = "(" + first + ", " + second + ")"
  }

}
