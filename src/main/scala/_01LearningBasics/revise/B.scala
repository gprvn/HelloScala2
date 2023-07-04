package _01LearningBasics.revise

import scala.io.StdIn

object B {
  def main(args: Array[String]) = {
    println("Enter a name: ");
    var name = StdIn.readLine();
    println("Converting your name to all uppercase: "+name.toUpperCase())
  }
}
