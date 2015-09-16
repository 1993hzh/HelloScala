package cn.leo.helloscala.traits

/**
 * Created by Administrator.
 * 2015/9/16 22:43
 */
trait Logger {

  def log(msg: String, key: Int = 3): Unit
}
