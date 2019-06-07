/**
  * @author <Borislav Milijic>
  * Matrikelnummer: 01249658
  */

case class Bitcoin (var value:Double = 0) extends Currency with Converter with Printer {
  override def convert(to: Currency) = to match {
    case Dollar(i) => value * 6400
    case Euro(i) => value * 5600
  }

  var name = "Bitcoin"

  override def print(): Unit = {
    println(name + ": " + value)
  }
}