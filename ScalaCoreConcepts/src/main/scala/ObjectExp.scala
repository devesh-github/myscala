import java.util.Calendar
import java.text.SimpleDateFormat
object StaticDateTime {
  private val dateFormat = "EEEE, d-MMM-yyyy"
  private val timeFormat = "K:m aa z(ZZ)"
  def currentDate: String = getCurrentDateTime(dateFormat)
  def currentTime: String = getCurrentDateTime(timeFormat)
  def dateAdd(date: String, days: Int): String = {
    val df = new SimpleDateFormat(dateFormat)
    val dt = df.parse(date)
    val cal = Calendar.getInstance()
    cal.setTime(dt)
    cal.add(Calendar.DATE, days)
    df.format(cal.getTime())
  }
  private def getCurrentDateTime(format: String): String = {
    val df = new SimpleDateFormat(format)
    val cal = Calendar.getInstance()
    df.format(cal.getTime())
  }
}