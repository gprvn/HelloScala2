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
  }
}

object main {
  def main(args: Array[String]) = {
    val variables = new Variables();
    variables.method
  }
}

