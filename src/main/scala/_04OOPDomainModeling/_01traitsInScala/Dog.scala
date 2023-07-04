package _04OOPDomainModeling._01traitsInScala

class Dog (name: String) extends Speaker with TailWagger with Runner {
  override def speak(): String = "Woof"
}
