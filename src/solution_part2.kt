fun main(){

 val player1 = "Rajwa"
 val player2 = "Sara"

 val player1HealthPoint = 101
 val player2HealthPoint = 103

 if(player1HealthPoint <= 100) {

  when (player1HealthPoint) {
   in 90..100 -> println("$player1's health is excellent")
   in 50..89 -> println("$player1's health is fine")
   else -> println("$player1's health is awful")
  }

 } else {
  println("Player's health points can't exceed 100")
 }

 if(player2HealthPoint <= 100) {

  when (player2HealthPoint) {
   in 90..100 -> println("$player2's health is excellent")
   in 50..89 -> println("$player2's health is fine")
   else -> println("$player2's health is awful")
  }

 } else {
  println("Player's health points can't exceed 100")
 }

}