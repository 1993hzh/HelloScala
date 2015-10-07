package cn.leo.helloscala.classes

import scala.actors.Actor


/**
 * Created by leo on 15-10-7.
 */
class ThreadFlag1(flag: Flag) extends Actor {
  override def act(): Unit = {
    println("T1 is waiting...")
    Thread.sleep(3000)
    flag.flag = true
    println("T1 has changed the flag into true")
  }
}
