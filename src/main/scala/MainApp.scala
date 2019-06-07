import javax.swing.plaf.BorderUIResource.EmptyBorderUIResource

/**
  * @author <Borislav Milijic>
  * Matrikelnummer: 01249658
  */

object MainApp {
   def main(args:Array[String]) = {

     val bitcoin = new Bitcoin(1);
     val dollar = new Dollar(100);
     val euro = new Euro(300);

     println("Bitcoin in Dollar: " + bitcoin.convert(Dollar()))
     println("Bitcoin in Euro: " + bitcoin.convert(Euro()))
     println("Dollar in Bitcoin: " + dollar.convert(Bitcoin()))
     println("Dollar in Euro: " + dollar.convert(Euro()))
     println("Euro in Dollar: " + euro.convert(Dollar()))
     println("Euro in Bitcoin: " + euro.convert(Bitcoin()))



     val list = List(1,2,3,4,5,6,7,8,9,10)
     list.filter(item => item > 5).map(item => print(item))



   }
}