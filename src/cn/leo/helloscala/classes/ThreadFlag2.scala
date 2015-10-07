package cn.leo.helloscala.classes

import scala.actors.Actor

/**
 * Created by leo on 15-10-7.
 */
class ThreadFlag2(flag: Flag) extends Actor {
  override def act(): Unit = {
    var f = true
    while (f) {
      if (flag.flag) {
        println("T2: flag is true now, exit")
        f = false
      } else {
        println("T2 is waiting")
        Thread.sleep(1000)
      }
    }
  }
}
