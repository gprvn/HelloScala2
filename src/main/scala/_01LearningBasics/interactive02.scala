package _01LearningBasics

import scala.io.StdIn

object interactive02 {
  def main(args: Array[String]) = {
    println("Enter your name: ")
    val name = StdIn.readLine();
    println("Your name sounds weird, just read it again: "+name.reverse)
  }
}
