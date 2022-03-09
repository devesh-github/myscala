package playground

//package dev.scala

class ClassExp(name:String,id:Int) {
    var empName:String = name
    var empId:Int = id
    
    def printNameId(name:String,id:Int) {
      //var derivedEmpId:String = empId + id //why not
      empId = empId + id
      println(name + empId)
    }
}

object ClassVsObject {
  def main(args: Array[String]): Unit = {
    val exp1 = new ClassExp("Dev",10)
    exp1.printNameId("Dev->", 1000)
  }
  
}