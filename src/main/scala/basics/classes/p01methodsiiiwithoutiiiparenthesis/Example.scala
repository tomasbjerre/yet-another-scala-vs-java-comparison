package basics.classes.p01methodsiiiwithoutiiiparenthesis

class Example(real: Double, imaginary: Double) {
  def re() = real
  def im() = imaginary
}

object ExampleUsage {
  def main(args: Array[String]) {
    val c = new Example(1.2, 3.4)
    println("imaginary part: " + c.im())
  }
}

class ExampleWithoutParenthesis(real: Double, imaginary: Double) {
  def re = real
  def im = imaginary
}

object ExampleWithoutParenthesisUsage {
  def main(args: Array[String]) {
    val c = new ExampleWithoutParenthesis(1.2, 3.4)
    println("imaginary part: " + c.im)
  }
}