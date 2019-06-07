/**
  * @author <Borislav Milijic>
  * Matrikelnummer: 01249658
  */

case class Euro (var value:Double = 0) extends Currency with Converter with Printer {
  override def convert(to: Currency) = to match {
    case Dollar(i) => value * 1.14
    case Bitcoin(i) => value / 5600
  }

  var name = "Euro"

  override def print():Unit = {
    println(name + ": " + value)
  }
}
