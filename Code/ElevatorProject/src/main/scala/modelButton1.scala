import scala.actors.Actor
import scala.actors.Actor._

class Button1(var currentFloor: Int)
{
	var isLit = false
	
	def lightUp(toLight: String)
	{
		println(toLight)
		println("hi")
		isLit = true;
		toLight match {
			case "up 1 direction" => SystemStatus.floor1UpButtonLit = true
			case "up 2 direction" => SystemStatus.floor2UpButtonLit = true
			case "down 2 direction" => SystemStatus.floor2DownButtonLit = true
			case "down 3 direction" => SystemStatus.floor3DownButtonLit = true
		//	case "up 1 number" => SystemStatus.floor1UpButtonLit = true
		//	case "up 1 number" => SystemStatus.floor1UpButtonLit = true
		//	case "up 1 number" => SystemStatus.floor1UpButtonLit = true
		//	case "up 1 number" => SystemStatus.floor1UpButtonLit = true
		}
	}

	def cancelLight()
	{
		isLit = false;
	}
	
}