abstract class Room {
  def bookingPrice: Double
  def facilities: List[String]
  def availability: Int
  def book(noOfRooms: Int)
}

object Room {
  val STANDARD = 0
  val DELUXE = 1
  val SUPER_DELUXE = 2

  private class standardRoom extends Room {
    private var _availability = 20
    override def bookingPrice = 70
    override def facilities = List("Queen Bed", "TV", "Chair", "Table", "Fan")
    override def availability = _availability
    override def book(noOfRooms: Int) = {
      _availability = _availability - noOfRooms
    }
  }

  private class DeluxeRoom extends Room {
    private var _availability = 10
    override def bookingPrice = 90
    override def facilities = List("Bed", "TV", "Chair", "Table", "AC")
    override def availability = _availability
    override def book(noOfRooms: Int) = {
      _availability = _availability - noOfRooms
    }
  }

  private class superDeluxeRoom extends Room {
    private var _availability = 5
    override def bookingPrice = 120
    override def facilities =
      List("Double Bed", "Single Bed", "TV", "Sofa", "Reading Table", "AC")
    override def availability = _availability
    override def book(noOfRooms: Int) = {
      _availability = _availability - noOfRooms
    }
  }

  def apply(roomType: Int): Room = {
    roomType match {
      case SUPER_DELUXE => new superDeluxeRoom()
      case DELUXE       => new DeluxeRoom()
      case _            => new standardRoom()
    }
  }

}