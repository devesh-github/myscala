import java.util._
import java.io._
object appConfig {
  private val prop = new Properties();
  prop.load(new FileInputStream("C:\\Users\\Devesh\\ProofOfConcepts\\ScalaCoreConcepts\\src\\config.properties"));
  def config = prop

  def main(args:Array[String]): Unit = {
    //How to use it
    println(appConfig.config.getProperty("dbuser"))
    appConfig.config.getProperty("database")
  }

}

