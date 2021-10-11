fun main(){
 val firstPlayerHealthPoints = 79
 val secondPlayerHealthPoints = 45

 if (firstPlayerHealthPoints in 51..90) println("the player's health is fine")
 else if (firstPlayerHealthPoints < 50) println("the player's health is awful")

 when(secondPlayerHealthPoints){
  in 90..100 -> println("the player's health is fine")
  in 0..50 -> println("the player's health is awful")
  else -> println("Score not valid")
 }
}