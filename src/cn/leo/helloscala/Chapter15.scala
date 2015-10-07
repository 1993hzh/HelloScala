package cn.leo.helloscala

import cn.leo.helloscala.classes.{ThreadFlag2, ThreadFlag1, Flag}

import scala.annotation.varargs

/**
 * Created by leo on 15-10-7.
 */
object Chapter15 extends App {

  @varargs
  def sum(args: Int*): Int = {
    var total: Int = 0
    for (e <- args)
      total += e
    total
  }

  val flag: Flag = new Flag()
  new ThreadFlag1(flag).start()
  new ThreadFlag2(flag).start()
}
