object guiOutput {
	def Floor1Up()
	{
		var buttonController = new buttonController()
		buttonController.start()
		buttonController ! "up 1 direction"
		println("Floor 1 Up Button Pressed")
	}
	
	def Floor2Up()
	{
		var buttonController = new buttonController()
		buttonController.start()
		
		buttonController ! "up 2 direction"
		println("Floor 2 Up Button Pressed")
	}

	def Floor2Down()
	{
		var buttonController = new buttonController()
		buttonController.start()
		
		buttonController ! "down 2 direction"
		println("Floor 2 Down Button Pressed")
	}

	def Floor3Down()
	{
		var buttonController = new buttonController()
		buttonController.start()
		buttonController ! "down 3 direction"
		println("Floor 3 Down Button Pressed")
	}

	def elevFloor1()
	{
		var buttonController = new buttonController()
		buttonController.start()
		buttonController ! "floor 1 button"
		println("Elevator Button 1 Pressed")
	}

	def elevFloor2()
	{
		var buttonController = new buttonController()
		buttonController.start()
		buttonController ! "floor 2 button"
		println("Elevator Button 2 Pressed")
	}

	def elevFloor3()
	{
		var buttonController = new buttonController()
		buttonController.start()
		buttonController ! "floor 3 button"
		println("Elevator Button 3 Pressed")
	}

	def elevStop()
	{
		var buttonController = new buttonController()
		buttonController.start()
		buttonController ! "stop button"
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