object guiOutput {

	def Floor1Up()
	{
		var buttonController = new buttonController(new modelDirectionButton(1,true),new modelDirectionButton(2,true),
new  modelDirectionButton(3,false), new modelDirectionButton(2,false))
		buttonController.start()
		buttonController ! "up 1 direction"
		println("Floor 1 Up Button Pressed")
	}
	
	def Floor2Up()
	{
		var buttonController = new buttonController(new modelDirectionButton(1,true),new modelDirectionButton(2,true),
new  modelDirectionButton(3,false), new modelDirectionButton(2,false))
		buttonController.start()
		
		buttonController ! "up 2 direction"
		println("Floor 2 Up Button Pressed")
	}

	def Floor2Down()
	{
		var buttonController = new buttonController(new modelDirectionButton(1,true),new modelDirectionButton(2,true),
new  modelDirectionButton(3,false), new modelDirectionButton(2,false))
		buttonController.start()
		
		buttonController ! "down 2 direction"
		println("Floor 2 Down Button Pressed")
	}

	def Floor3Down()
	{
		var buttonController = new buttonController(new modelDirectionButton(1,true),new modelDirectionButton(2,true),
new  modelDirectionButton(3,false), new modelDirectionButton(2,false))
		buttonController.start()
		buttonController ! "down 3 direction"
		println("Floor 3 Down Button Pressed")
	}

	def elevFloor1()
	{
		//Place your code here for when the 1 button is pressed in the elevator.
		println("Elevator Button 1 Pressed")
	}

	def elevFloor2()
	{
		//Place your code here for when the 2 button is pressed in the elevator
		println("Elevator Button 2 Pressed")
	}

	def elevFloor3()
	{
		//Place your code here for when the 3 button is pressed in the elevator
		println("Elevator Button 3 Pressed")
	}

	def elevStop()
	{
		//Place your code here for when the stop button is pressed in the elevator
		println("Elevator Stop Button Pressed")
	}

	def MaintenanceModeOn()
	{
		//Place your code here for when the maintanence mode is switched to on.
		println("Maintenance Mode On")
	}
	def MaintenanceModeOff()
	{
		//Place your code here for when the maintanence mode is switched to off.
		println("Maintenance Mode Off")
	}

	def AlarmModeOn()
	{
		//Place your code here for when the alarm mode is switched to on.
		println("Alarm On")
	}

	def AlarmModeOff()
	{
		//Place your code here for when the alarm mode is switched to off.
		println("Alarm Off")
	}


}