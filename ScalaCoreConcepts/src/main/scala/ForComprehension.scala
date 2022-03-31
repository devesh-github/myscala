class ForComprehension {

}

object Fors {

  def main(args: Array[String]): Unit = {
    val n = 1 to 10
    for(i <- n)
      print(i +"--")

    for(i <- 1 to 5) print(i +" ")

    //Syntactic sugar
    for(country <- List("India","USA","China","Japan")) {
      country match {
        case "India" => println("Delhi")
        case "USA" => println("Washington DC")
        case _ => println("Unknown")
      }
    }

    // HOF
    val countries = List("India","USA","China","Japan")
    countries.foreach{ country =>
      country match {
        case "India" => println("Delhi")
        case "USA" => println("Washington DC")
        case _ => println("Unknown")
      }
    }

    //For expression
    println(
      for(country <- List("India","USA","China","Japan")) yield {
        country match {
          case "India" => "Delhi"
          case "USA" => "Washington DC"
          case _ => "Unknown"
        }
      }
    )

  }

}
