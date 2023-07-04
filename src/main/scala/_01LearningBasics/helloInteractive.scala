package _01LearningBasics

import scala.io.StdIn

object helloInteractive {
  def main(args: Array[String]) = {
    println("Please enter your name: ")
    val name = StdIn.readLine();
    println("Hello, " + name)
  }
}
