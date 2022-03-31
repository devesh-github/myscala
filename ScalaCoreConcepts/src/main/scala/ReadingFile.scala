import scala.io.Source

class ReadingFile {}

object Files {

  def main(args: Array[String]): Unit = {

    for(lines <- Source.fromFile("C:\\Users\\Devesh\\ProofOfConcepts\\Myscala\\src\\emp.txt").getLines().toList) {
      val fields = lines.split(",")
      fields.foreach(print)
    }


  }

}
