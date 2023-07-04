package _02Variables

class Variables {
  def method() = {
    var b = "yahoo" //Mutable

    //  a = "new", not allowed as a is declared as Immutable

    //  val c = 12
    val c: Int = 12
    val s: String = "Praveen"

    //  val nums = List(1,2,3)
    val nums: List[Int] = List(1, 2, 3, 4)

    //String interpolation
    val firstname = "Praveen"
    val middlename = "Rao"
    val lastname = "Gujju"

    println(s"Name: $firstname $middlename $lastname")
    println(s" 2 + 2 = ${2+2}") //2 + 2 = 4

    val x = -1
    println(s"x.abs = ${x.abs}") // 1

    //Multiline strings:

    val quote =
      """The essence of Scala:
         Fusion of functional and object-oriented
         programming in a typed setting."""
    println(quote)
  }


}

object main {
  def main(args: Array[String]) = {
    val variables = new Variables();
    variables.method
  }
}

