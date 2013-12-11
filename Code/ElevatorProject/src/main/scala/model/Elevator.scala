import scala.collection.mutable.ArrayBuffer

class Elevator {
	var location: Int = 1
	var direcion: Boolean = true
	var alarmMode: Boolean = false
	var maintenenceMode: Boolean = false
	var numPassengers: Int = 0
	
	def callElevator(button:modelDirectionButton) = {
		button.upDown match {
			case true =>
				println("up")
			case false =>
				println("down")
		}
	}
}