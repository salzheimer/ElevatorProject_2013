object guiOutput {
val buttonController = new buttonController()
buttonController.start()
def Floor1Up()
{
//Place your code here for when the up button is pressed on floor 1.
buttonController ! "up 1 direction"
println("Floor 1 Up Button Pressed")
}
def Floor2Up()
{
//Place your code here for when the up button is pressed on floor 2.
buttonController ! "up 2 direction"
println("Floor 2 Up Button Pressed")
}

def Floor2Down()
{
//Place your code here for when the down button is pressed on floor2.
buttonController ! "down 2 direction"
println("Floor 2 Down Button Pressed")
}

def Floor3Down()
{
//Place your code here for when the down button is pressed on floor3.
buttonController ! "down 3 direction"
println("Floor 3 Down Button Pressed")
}

def elevFloor1()
{
//Place your code here for when the 1 button is pressed in the elevator.
buttonController ! "floor 1 button"
println("Elevator Button 1 Pressed")
}

def elevFloor2()
{
//Place your code here for when the 2 button is pressed in the elevator
buttonController ! "floor 2 button"
println("Elevator Button 2 Pressed")
}

def elevFloor3()
{
//Place your code here for when the 3 button is pressed in the elevator
buttonController ! "floor 3 button"
println("Elevator Button 3 Pressed")
}

def elevStop()
{
//Place your code here for when the stop button is pressed in the elevator
buttonController ! "stop button"
println("Elevator Stop Button Pressed")
}

def MaintenanceModeOn()
{
buttonController ! "maintenence on"
println("Maintenance Mode On")
}
def MaintenanceModeOff()
{
buttonController ! "maintenence off"
println("Maintenance Mode Off")
}

def AlarmModeOn()
{
buttonController ! "alarm on"
println("Alarm On")
}

def AlarmModeOff()
{
buttonController ! "alarm off"
println("Alarm Off")
}


}