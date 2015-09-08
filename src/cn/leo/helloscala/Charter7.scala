package cn.leo.helloscala


import cn.leo.{helloscala => random}

import scala.io.StdIn

/**
 * Created by Administrator.
 * 2015/9/8 21:35
 */
object Charter7 extends App {


  random.seed = 4
  println(random.nextDouble())
  println(random.nextDouble())
  println(random.nextInt())
  println(random.nextInt())

  val password = StdIn.readLine()
  if (password.contains("secret"))
    println("Hello " + System.getProperty("user.name"))
  else
    System.err.println("Password error!")
}