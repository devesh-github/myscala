object HelloWorld extends App {
  println("Hello World")
}

object Geeks {
  def main(args: Array[String]): Unit = {
    val result = "Devesh Kumar Chaubey ABC 0 0".replace("ABC","")
    println(result)
    println(removeZeros("Devesh Kumar Chaubey ABC 0 0"))
  }

  def removeZeros(s: String): Unit = s.map(c=> if(c=='0') '*' else c)

}