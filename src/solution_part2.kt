fun main(){
 val player1 = "Me"
 val healthPointPlayer1 = 12
 val player2 = "you"
 val healthPointPlayer2 = 96
 if(healthPointPlayer1 >= 90){
  println("the player $player1 health is awful")
 }else{
  println("the $player1 health is fine")
  if(healthPointPlayer2 <=90){
   println("the $player2 health is fine")
  }else{
   println("the $player2 health is awful")
  }
 }

}