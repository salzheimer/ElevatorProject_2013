import scala.actors.Actor
import scala.actors.Actor._

class buttonController(var upButtonFloor1:modelDirectionButton, var upButtonFloor2:modelDirectionButton, 
var downButtonFloor3:modelDirectionButton, var downButtonFloor2:modelDirectionButton) 
 extends Actor{

	upButtonFloor1 = new modelDirectionButton(1,true)
	upButtonFloor2 = new modelDirectionButton(2,true)
	downButtonFloor3 = new modelDirectionButton(3,false)
  downButtonFloor2 = new modelDirectionButton(2,false)
	
	def act
	{
		while(true){
			receive{
				case "up 1 direction" => 
						upButtonFloor1.lightUp("up 1 direction")
				case "up 2 direction" =>
						upButtonFloor2.lightUp("up 2 direction")
				case "down 3 direction" =>
						downButtonFloor3.lightUp("down 3 direction")
				case "down 2 direction" => 
						downButtonFloor2.lightUp("down 2 direction")
			}
	}
	}
	def upDownPressed(flooorNumber: Int)
	{
		
	}
	

	}