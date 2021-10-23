fun main(){
 val firstPlayer = 90
 val firstPlayerHealthPoint = when(firstPlayer){
  in 91..100 -> "The player's health is excellent"
  in 50..90 -> "The player's health is fine"
  in 20..49 -> "The player's health is awful"
  in 0..19 -> "Dying"
  else -> "Exceptional case"
 }
 println(firstPlayerHealthPoint)

 val secondPlayer = 49
 val secondPlayerHealthPoint = when(secondPlayer){
  in 90..100 -> "The player's health is excellent"
  in 50..89 -> "The player's health is fine"
  in 20..49 -> "The player's health is awful"
  in 0..19 -> "Dying"
  else -> "Exceptional case"
 }
 println(secondPlayerHealthPoint)
}
