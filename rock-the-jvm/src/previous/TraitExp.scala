package playground

trait SampleTrait {
  def isEvenNo(inpNum:Integer): Boolean
}

class ExtendTrait(inpNum:Integer) extends SampleTrait{
  var x:Integer = inpNum
  def isEvenNo(inp:Integer):Boolean = {
    if(inp%2==0) 
      return true
    else 
      return false
  }
}

object ExtendTrait {
  def main(args: Array[String]): Unit = {
    val p1 = new ExtendTrait(20)
    println(p1.isEvenNo(40))
  }
}