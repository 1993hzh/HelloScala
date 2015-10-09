package cn.leo.helloscala.classes

/**
 * Created by leo on 15-10-9.
 */
object then

object show

object around

class BugWithFluent(var pos: Int = 0) {

  var forward: Int = 1

  def move(num: Int): this.type = {
    pos += num * forward
    this
  }

  def and(obj: then.type): this.type = this

  def and(obj: show.type): this.type = {
    print(pos + " ")
    this
  }

  def turn(obj: around.type): this.type = {
    forward = -1
    this
  }
}
