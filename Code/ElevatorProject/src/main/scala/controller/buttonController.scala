import scala.actors.Actor
import scala.actors.Actor._

class buttonController 
 extends Actor {

	var upButtonFloor1 = new Button1("up 1 direction")
	var upButtonFloor2 = new Button1("up 2 direction")
	var downButtonFloor3 = new Button1("down 3 direction")
  var downButtonFloor2 = new Button1("down 2 direction")
	var floor1Button = new Button1("floor 1 button")
	var floor2Button = new Button1("floor 2 button")
	var floor3Button = new Button1("floor 3 button")
  var stopButton = new Button1("stop button")
  var maintenenceOn = new Button1("maintenence on")
  var maintenenceOff = new Button1("maintenence off")
  var alarmOn = new Button1("alarm on")
  var alarmOff = new Button1("alarm off")
  var onePassenger = new Passenger()
  onePassenger.start()
  var theElevator = new Elevator()
  var elevator_controller = new elevator_controller(3)
	
	def act
	{
		while(true){
			receive{
				case "up 1 direction" => 
						onePassenger ! upButtonFloor1
						elevator_controller.start_floor_request(1)
				case "up 2 direction" =>
						onePassenger ! upButtonFloor2
						elevator_controller ! 2
				case "down 3 direction" =>
						onePassenger ! downButtonFloor3
						elevator_controller ! 3
				case "down 2 direction" => 
						onePassenger ! downButtonFloor2
						elevator_controller ! 2
				case "floor 1 button" => 
						onePassenger ! floor1Button
						elevator_controller ! 1
				case "floor 2 button" =>
						onePassenger ! floor2Button
						elevator_controller ! 2
				case "floor 3 button" =>
						onePassenger ! floor3Button
						elevator_controller ! 3
				case "stop button" => 
						onePassenger ! stopButton
						elevator_controller ! 0
				case "maintenence on" => 
						elevator_controller ! 0
				case "maintenence off" => 
						elevator_controller ! 0
				case "alarm on" => 
						elevator_controller ! 0
				case "alarm off" => 
						elevator_controller ! 0
			}
	}
	}

	}