package _02Variables

class A {
    def testMethod() = {
        var name: String = "Praveen"
        println(name)

        var fname = "praveen"
        var mname = "rao"
        var lname = "gujju"

        //String interpolation
        println(s"${fname} ${mname} ${lname}")

        println(s"5 + 5 = ${5 + 5}")
    }
}
object ATest {
    def main(args: Array[String]) = {
        var test = new A()
        test.testMethod()
    }
}
