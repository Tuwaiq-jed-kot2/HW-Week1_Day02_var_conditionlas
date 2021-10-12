fun main() {
 val player1 = "Ahmed"
 val player2 = "Mohamed"
 val healthPointsP1 = 79
 val healthPointsP2 = 22

 if (healthPointsP1 in 50..89){
  println("$player1 health's is fine")
 } else if (healthPointsP1 < 50){
  println("$player1 health's is awful")
 }
 if (healthPointsP2 in 50..89){
  println("$player2 health's is fine")
 } else if (healthPointsP2 < 50){
  println("$player2 health's is awful")
 }

}
