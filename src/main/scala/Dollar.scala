/**
  * @author <Borislav Milijic>
  * Matrikelnummer: 01249658
  */

case class Dollar (var value:Double = 0) extends Currency with Converter with Printer {
  override def convert(to: Currency) = to match {
    case Euro(i) => value * 0.88
    case Bitcoin(i) => value / 6400
  }

  var name = "Dollar"

  override def print(): Unit = {
    println(name + ": " + value)
  }
}
