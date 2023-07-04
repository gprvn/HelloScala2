package _04OOPDomainModeling._01traitsInScala

class Cat (name: String) extends Speaker with TailWagger with Runner {
    def speak(): String = "Meow"

  override def startRunning(): Unit = println("Yeah... I don't run")

  override def stopRunning(): Unit = println("No need to stop")
}

object main {
  def main(args: Array[String]) = {
    val d = new Dog("Rover")
    println(d.speak())

    val c = new Cat("Morris")
    println(c.speak())
    c.startRunning()
    c.stopRunning()
  }
}