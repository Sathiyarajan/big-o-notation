package com.scala.benchmark

object List extends App {

  val list = (1 to 10000).toList

  list.map(_ + 42)
  //list.foreach(println)
  println(list.size)
  list.par.map(_ + 42)
}