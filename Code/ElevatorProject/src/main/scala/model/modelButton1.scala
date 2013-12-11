import scala.actors.Actor
import scala.actors.Actor._

class Button1(var buttonText: String) extends Actor
{
	var isLit = false
	def act(){
	while (true)
	receive{
		case _ => println("2")
	}
	}
	def lightUp() =
	{
		println(buttonText)
		isLit = true;
		buttonText match {
			case "up 1 direction" => SystemStatus.floor1UpButtonLit = true
			case "up 2 direction" => SystemStatus.floor2UpButtonLit = true
			case "down 2 direction" => SystemStatus.floor2DownButtonLit = true
			case "down 3 direction" => SystemStatus.floor3DownButtonLit = true
			case "floor 1 button" => SystemStatus.elevator1ButtonLit = true
			case "floor 2 button" => SystemStatus.elevator2ButtonLit = true
			case "floor 3 button" => SystemStatus.elevator3ButtonLit = true
			case "stop button" => SystemStatus.elevatorStopButtonLit = true
		}
	}


	def cancelLight()
	{
		isLit = false;
	}
	
}