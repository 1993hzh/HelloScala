package cn.leo.helloscala.classes

/**
 * Created bcol Administrator.
 * 2015/9/16 23:51
 */
class Matrirx(val row: Int, val col: Int) {

  private val array = Array.ofDim[Int](row, col)

  for (i <- 0 until this.row)
    for (j <- 0 until this.col)
      array(i)(j) = 0

  def +(other: Matrirx): Matrirx = {
    Matrirx(this.row + other.row, this.col + other.col)
  }

  def +(other: Int): Matrirx = {
    Matrirx(this.row + other, this.col + other)
  }

  def *(other: Matrirx): Matrirx = {
    Matrirx(this.row * other.row, this.col * other.col)
  }

  def *(other: Int): Matrirx = {
    Matrirx(this.row * other, this.col * other)
  }

  def mat(row: Int, col: Int): Int = {
    array(row)(col)
  }

  override def toString: String = {
    var str: String = "Matrix(" + row + ", " + col + "):\n"
    for (i <- 0 until this.row) {
      for (j <- 0 until this.col) {
        str += mat(i, j) + ", "
      }
      str += "\n"
    }
    str
  }

  def like(other: Matrirx): Boolean = {
    other.row == this.row && other.col == this.col
  }
}

object Matrirx {

  def apply(row: Int, col: Int): Matrirx = {
    new Matrirx(row, col)
  }
}
