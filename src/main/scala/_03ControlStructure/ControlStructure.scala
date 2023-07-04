package _03ControlStructure

import java.io.IOException

class ControlStructure {
  //if/else statements::
  def ifElse() = {
      //Scala’s if/else control structure looks similar to other languages.
      var x: Int = 2
      if(x > 0){
        println("positive")
      } else if(x == 0){
        println("zero")
      } else{
        println("negative")
      }
      x = 0
      val y = if(x > 0){"positive"}else if (x == 0){"zero"}else{"negative"}
      println(y)
  }

  //for-loop in scala::
  def forLoop() = {
    //A simple for-loop
    println("A simple for-loop")
    val list = List(1,2,3,4,5,6,7,8,9)
    for(i <- list)
      print(i)

    //guard in for-loop - 1
    println("use of guard in for-loop")
    for(i <- list if i%2 != 0) {
      print(i)
      println()
    }

    //guard in for-loop - 2
    for{
      i <- 1 to 4
      j <- 'a' to 'c'
        if i == 2
        if j == 'b'
    }{
      println(s"i = $i, j = $j")
    }

    //for loop with yield
    println("for loop with yield")
    val doubles = for (i <- list) yield i * 2
    val doubles1 = for (i <- list) yield (i*2)
    val doubles2 = for {i <- list } yield  {i * 2}

    for(i <- doubles)
      print(i)

    //capitalize first character of a String
    val names = List("praveen","rao","gujju")
    val capNames = for(name <- names) yield name.capitalize
    for(name <- capNames)
      println(name)

    /**
     * this for expression iterates over a list of strings, and returns the length of each string,
     * but only if that length is greater than 4
     */
      println("print names length only if length of the name is greater than 4")
    val lengthCalculatednames = for(name <- names if name.length > 4) yield name.length
    for(name <- lengthCalculatednames)
      println(name)

    //Scala match expression
    println("Scala match expression")
    val i = 12
    i match {
      case 1 => println("one")
      case 2 => println("two")
      case _ => println("other")
    }

    //match as an expression
    val j = 2
    val result = j match {
      case 1 => println("one")
      case 2 => println("two")
      case _ => println("other")
    }
    println(result)

    //match as an expression, with other data types
    val p = Person("praveen")
    p match {
      case Person(name) if name == "praveen" =>
        println(s"$name says, yubba dubba do")
      case Person(name) if name == "yahoo" =>
        println(s"$name says, yahooooo")
      case _ => println("Watch The Mandolerian")
    }
  }

  def getClassAsString(x: Any): String = x match {
    case s: String => s"'$s' is a String"
    case i: Int => "Integer"
    case d: Double => "Double"
    case l: List[_] => "List"
    case _ => "Unknown"
  }

  def whileLoop() = {
    //while-loop
    println("while-loop in scala")
    var x: Int = 4
    while (x > 0) {
      println(x)
      x -= 1
    }
  }

  //try/catch/finally
  try{
    getClassAsString()
  } catch {
    case ioe: IOException => println("IOException occured")
    case nfe: NumberFormatException => println("NFE occured")
  } finally {
    println("Cleanup the resources")
  }

}

object main {
  def main(args: Array[String]) = {
    var controlStructure = new ControlStructure()
    controlStructure.ifElse()
    controlStructure.forLoop()
    val res1 = controlStructure.getClassAsString(1)
    println(res1)
    val res2 = controlStructure.getClassAsString("hello")
    println(res2)
    val res3 = controlStructure.getClassAsString(List(1,2,3))
    print(res3)
    controlStructure.whileLoop()
  }
}

case class Person(str: String)
