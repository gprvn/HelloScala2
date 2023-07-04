package _01LearningBasics

import scala.io.StdIn

object mathInteractive {
  def main(args: Array[String]) = {
    println("Lets add two numbers: ")
    println("Enter first number: ")
    val x = StdIn.readInt()
    println("Enter second number: ")
    val y = StdIn.readInt();
    println("Addition of two numbers is: " + (x + y));
  }
}
