package cn.leo.helloscala.classes

/**
 * Created by leo on 15-10-9.
 */
class Bug {

  var position: Int = 0
  var direction = true

  def move(length: Int) = {
    if (direction)
      position += length
    else
      position -= length
    this
  }

  def turn() = {
    direction = false
    this
  }

  def show() = {
    println(position)
    this
  }
}
