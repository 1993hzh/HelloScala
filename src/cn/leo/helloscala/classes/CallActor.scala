package cn.leo.helloscala.classes

import scala.actors.Actor

/**
 * Created by Administrator.
 * 2015/10/11 22:03
 */
class CallActor {}

class ReceiveActor extends Actor {

  override def act(): Unit = {
    while (true) {
      receive {
        case "Hello" =>
          println("Receive: " + Thread.currentThread)
          sender ! Thread.currentThread.getId
          exit()
      }
    }
  }
}

class ReactActor extends Actor {

  override def act(): Unit = {
    loop {
      react {
        case "Hello" =>
          println("Reactor: " + Thread.currentThread)
          sender ! Thread.currentThread.getId
          exit()
      }
    }
  }
}