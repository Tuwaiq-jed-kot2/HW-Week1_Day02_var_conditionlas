fun main() {
 val player1 = "Me"
 val healthPointPlayer1 = 77
 val player2 = "you"
 val healthPointPlayer2 = 96
 if(healthPointPlayer1 in 91..100){
  println("the $player1 health is good")
 }else if (healthPointPlayer1 in 51..90 ){
  println("the $player1 health is fine")
 }else if (healthPointPlayer1 in 1..50){
  println("the $player1 health is awful")
 }else{
  println("GAME OVER")
 }
 if(healthPointPlayer2 in 91..100){
  println("the $player2 health is good")
 }else if (healthPointPlayer2 in 51..90 ){
  println("the $player2 health is fine")
 }else if (healthPointPlayer2 in 1..50){
  println("the $player2 health is awful")
 }else{
  println("GAME OVER")
 }
}