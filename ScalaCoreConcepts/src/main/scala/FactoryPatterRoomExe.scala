import Room.STANDARD

object RoomExe {

  def main(args: Array[String]): Unit = {
    val room = Room(STANDARD)
    println(room.availability)
    println(room.bookingPrice)
  }

}
