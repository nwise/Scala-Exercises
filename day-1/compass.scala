class Compass {
   val directions = List("North", "East", "South", "West")
   var bearing = 0
   println("Initial bearing: ")
   println(direction)

   def direction() = directions(bearing)

   def inform(turnDirection: String) {
       println("Turning " + turnDirection + ". Now Bearing " + direction)
   }

   def turnRight() {
       bearing = (bearing + 1) % directions.size
   }

   def turnLeft() {
       bearing = (bearing + (directions.size - 1)) % directions.size
       inform("left")
   }
}

val myCompass = new Compass

myCompass.turnRight
myCompass.turnLeft

myCompass.turnLeft
myCompass.turnLeft
myCompass.turnLeft

