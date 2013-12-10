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

	def processRequests(direction:Boolean, elevator:Elevator) = 
	{
		while (!(elevator.Requests.isEmpty()))
		{
			for(i <- elevator.Requests)
			{	
				if (elevator.location == i.desiredFloor){
					elevatorDoor.open()
				}
			}
		}
	}
		def moveMotorUpOneFloor(elevator:Elevator)
		{
				//Handle Model Side
				elevator.location += 1
				for (i <- elevator.upRequests)
				{
					//if the up request is on the floor equal to elevators current location
					if ( )
						{
							//open elevator doors on this floor and accept up floor request
						}
				}
				for (i <- elevator.downRequests)
				{
					//if the down request is on the floor equal to the elevators current location
					if ( )
						{
							//open elevator doors on this floor and accept down floor requests
						}
				}

				//handle gui
				guiElevLocationController ! 1
		}
		
		def moveMotorDownOneFloor(elevator:Elevator)
		{
				//Handle Model Side
				elevator.location -= 1
				for (i <- elevator.upRequests)
				{
					//if the up request is on the floor equal to elevators current location
					if ( )
						{
							//open elevator doors on this floor and accept up floor request
							//remove any request from the queues that are on this floor
						}
				}
				for (i <- elevator.downRequests)
				{
					//if the down request is on the floor equal to the elevators current location
					if ( )
						{
							//open elevator doors on this floor and accept down floor requests
							//remove any request from the queue that are on this floor
						}
				}
		}
		}