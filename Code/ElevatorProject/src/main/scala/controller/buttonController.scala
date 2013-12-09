import scala.actors.Actor
import scala.actors.Actor._

class buttonController 
 extends Actor {

	var upButtonFloor1 = new modelDirectionButton(1,true,"up 1 direction")
	var upButtonFloor2 = new modelDirectionButton(2,true, "up 2 direction")
	var downButtonFloor3 = new modelDirectionButton(3,false, "down 3 direction")
  var downButtonFloor2 = new modelDirectionButton(2,false, "down 2 direction")
 	var floor1Button = new FloorButton(1,"floor 1 button")
	var floor2Button = new FloorButton(2, "floor 2 button")
	var floor3Button = new FloorButton(3,"floor 3 button")
  var stopButton = new stopButton(2,"stop button")
  var onePassenger = new Passenger()
	
	def act
	{
		while(true){
			receive{
				case "up 1 direction" => 
						onePassenger.pressButton(upButtonFloor1)
				case "up 2 direction" =>
						onePassenger.pressButton(upButtonFloor2)
				case "down 3 direction" =>
						onePassenger.pressButton(downButtonFloor3)
				case "down 2 direction" => 
						onePassenger.pressButton(downButtonFloor2)
				case "floor 1 button" => 
						onePassenger.pressButton(floor1Button)
				case "floor 2 button" =>
						onePassenger.pressButton(floor2Button)
				case "floor 3 button" =>
						onePassenger.pressButton(floor3Button)
				case "stop button" => 
						onePassenger.pressButton(stopButton)
			}
	}
	}
	def upDownPressed(flooorNumber: Int)
	{
		
	}
	

	}