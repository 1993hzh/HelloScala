package cn.leo.helloscala.classes

/**
 * Created by Administrator.
 * 2015/9/16 23:28
 */
class Money(val dollar: Int, val cent: Int) {

  def +(other: Money): Money = {
    new Money(this.dollar + other.dollar + (this.cent + other.cent) / 100, (this.cent + other.cent) % 100)
  }

  def -(other: Money): Money = {
    new Money((this.toCent() - other.toCent()) / 100, (this.toCent() - other.toCent()) % 100)
  }

  private def toCent() = {
    this.dollar * 100 + this.cent
  }

  def ==(other: Money): Boolean = {
    other.toCent() == this.toCent()
  }

  def <(other: Money): Boolean = {
    other.toCent() > this.toCent()
  }
}

object Money {
  def apply(dollar: Int, cent: Int): Money = {
    new Money(dollar, cent)
  }
}
