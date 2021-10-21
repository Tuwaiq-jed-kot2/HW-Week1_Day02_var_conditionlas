fun main(){
 val y = listOf<String>()
 val firstPlayerHealthPoints = 79
 val secondPlayerHealthPoints = 45

 if (firstPlayerHealthPoints in 51..90) println("the player's health is fine")
 else if (firstPlayerHealthPoints < 50) println("the player's health is awful")

 when(secondPlayerHealthPoints){
  in 50..89 -> println("the player's health is fine")
  in 0..49 -> println("the player's health is awful")
  else -> println("Score not valid")
 }
}