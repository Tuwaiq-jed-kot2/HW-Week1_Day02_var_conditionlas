fun main(){

// I used (if) for player 1 and (when) for player 2
 val player1 = 49
 val player2 = 101

 println("Player 1 health :")
 if(player1 <90){
  if (player1>=50){
   println("the player's health is fine")
   }else if(player1>=1) {
   println("the player's health is awful")
   }else if(player1==0){
   println("the player's is DEAD")
   }else{
   println("the health value is incorrect")
   }
 }else if(player1 <=100){
  println("the player's health is Graet")
 }else{
  println("the health value is incorrect")
 }



 println("\nPlayer 2 health :")
 when (player2) {
  in 90..100 -> println("the player's health is Graet")
  in 50..89 -> println("the player's health is fine")
  in 1..49 ->println("the player's health is awful")
         0 -> println("the player's is DEAD")
  else -> println("the health value is incorrect")



 }

}