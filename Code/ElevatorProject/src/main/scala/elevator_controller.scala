import scala.actors.Actor

class elevator_queue(number_of_floors:Int) {
  //hold our floor records in an array of arrays
  private var e_queue = new Array[Array[Boolean]](number_of_floors + 1)

  for (index <- 0 until e_queue.length) {
    // each floor record in our queue holds two values
    // i1 - up request
    // i0 - down request
    e_queue(index) = new Array[Boolean](2)
  }

  def floor_request_set(floor_num:Int, direction:Boolean) = {
    // first convert the direction bool to an index
    val direction_index:Int = convert_direction(direction)
    // then set the queue
    e_queue(floor_num)(direction_index) = true
  }

  def floor_request_clear(floor_num:Int, direction:Boolean) = {
    // first convert the direction bool to an index
    val direction_index:Int = convert_direction(direction)
    // then set the queue
    e_queue(floor_num)(direction_index) = false
  }

  // converts the up/down bool to an index
  private def convert_direction(direction_bool:Boolean):Int = {
    direction_bool match {
      // if true, we're going up
      case true => return 1
      // if false, we're going down
      case false => return 0
    }

  }

}

class elevator_controller(top_floor:Int) extends Actor {
  // the elevator controller knows:
  // how tall the building is
  // which floor it is on
  // which direction it is moving

  // val top_floor = top_floor
  var location:Int = 1
  var direction:Boolean = false
  val e_queue = new elevator_queue(top_floor)

  def act = {
    while(true) {
      receive {

      }
    }
  }

  def start_floor_request(floor:Int) = {
    require(floor <= top_floor)

    var required_direction:Boolean = false
    // check for required direction
    // true  - up
    // false - down
    (floor > location) match {
      case true => {required_direction = true}
      case false => {
        (floor < location) match {
          case true => {required_direction = false}
          case false => {
            required_direction = false
            //
            //
            // special case - elevator is on the current floor
            // call to open doors, drop passengers, etc.
            //
            //
          }
        }
      }
    }

    // queue a floor request
    e_queue.floor_request_set(floor, required_direction)

  }

  def end_floor_request(floor_number:Int, c_direction:Boolean) = {
    // send e_queue floor number and current direction
    e_queue.floor_request_clear(floor_number, c_direction)
  }

}
