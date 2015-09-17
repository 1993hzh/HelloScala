package cn.leo.helloscala.traits

/**
 * Created by Administrator.
 * 2015/9/17 23:22
 */
trait MyMkString {

  this: collection.mutable.Iterable[String] =>

  def myMkString = if (this != Nil) this.reduceLeft(_ + _)
}
