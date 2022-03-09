package previous;

object FindMaxInArray {
  def main(args: Array[String]){
    println("Hello, world!")

    var myArr = Array(1.9,2.9,3.9)
    var max=myArr(0)
    for(x <- myArr) {
      if(max<x) {
        max = x
      }
      //println(x)
    }
    println("Max value in the Array: s" + max)

  }
}
