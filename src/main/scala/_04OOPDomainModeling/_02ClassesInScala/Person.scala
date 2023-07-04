package _04OOPDomainModeling._02ClassesInScala

class Person(var firstName: String, var lastName: String) {
  def printFullName()={
    println(s"$firstName, $lastName")
  }
}

object main {
  def main(args: Array[String]) = {
    val p = new Person("Praveen", "Rao")
    p.printFullName()
  }
}
