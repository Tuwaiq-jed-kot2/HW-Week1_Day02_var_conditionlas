fun main(){
 val healthPoint1 : Int = 40
 val healthPoint2 : Int = 90

 if (healthPoint1 in 51..90) {
     println("Player 1 Health is Fine")
 } else{
    println("Player 1 Health is Awful")
 }

 if (healthPoint2 in 51..90) {
     println("Player 2 Health is Fine")
 } else{
    println("Player 2 Heath is Awful")
 }
}