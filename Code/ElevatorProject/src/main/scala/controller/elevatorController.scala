import scala.actors.Actor
import scala.actors.Actor._
scala.collection.mutable.ArrayBuffer

class elevatorController 
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
  var elevatorController = new elevatorController()
	
	def act
	{
		while(true){
			receive{
				case "upRequest" => 
						println("1")
			}
	}
	}

	def processRequests(elevator:Elevator) = 
	{
		while (!(elevator.Requests.isEmpty()))
		{
			for(i <- elevator.Requests)
				{	
					processFloor(elevator)
				}
				else if (direction){
					moveMotorUpOneFloor(elevator)
					processFloor(elevator)					
				}
				else{
					moveMotorDownOneFloor(elevator)
					processFloor(elevator)
				}
			}
		}

	def processFloor(elevator:Elevator) = {
		for (i <- elevator.requests) {
			if ((i.requestedFloor == elevator.location) && checkDirection(elevator,i)){
				elevatorDoors.open()
				takeRequests()
				elevatorDoors.close()
			}
		}
	}

	def checkDirection(elevator:Elevator, request:Request) = {
		if (elevator.direction && request.requestedFloor > elevator.location){
			true
		}
		else if (!(elevator.direction) && request.requestedFloor < elevator.location){
			true
		}
		else false
	}
	
		def moveMotorUpOneFloor(elevator:Elevator)
		{

		}
		
		def moveMotorDownOneFloor(elevator:Elevator)
		{

		}