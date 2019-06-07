class Main {
  public static void
  def main(args: Array[String]): Unit
  =
  {
    val list = List(1,2,3,4,5,6,7,8,9,10)
    list.filter(item => item > 5).map(item => print(item))
  }
}
