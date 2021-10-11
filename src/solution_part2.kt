fun main(){

 val player1HealthPoints= 40
 val player2HealthPoints= 60

 if (player1HealthPoints < 50) {
  println("the player's health is awful")
 }
 else if (player1HealthPoints < 90){
  println("the player's health is fine")
 }

 if (player2HealthPoints  < 50) {
  println("the player's health is awful")
 }
 else if (player2HealthPoints < 90) {
  println("the player's health is fine")
 }

// I thought writing this code with function will be better, so I gave it a try . I hope  both of them are correct

 /*
 val player1HealthPoints= 40
 val player2HealthPoints= 60


 fun healthCondition(healthPoints: Int){
     if (healthPoints < 50) {
         println("the player's health is awful")
     }
     else if (healthPoints < 90){
         println("the player's health is fine")
     }
 }

 healthCondition(player1HealthPoints)
 healthCondition(player2HealthPoints)
*/
}