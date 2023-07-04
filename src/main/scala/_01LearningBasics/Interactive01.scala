package _01LearningBasics

import scala.io.StdIn

object Interactive01 {
  def main(args: Array[String]) = {
    println("Enter your name: ")
    val name = StdIn.readLine()
    println("There are "+name.length+" chars in your name... Enjoy")
  }
}
