fun main(){
 val healthPoints_player1 = 85
 val healthPoints_player2 = 49
  print("The first player has health points = $healthPoints_player1 so, ")
     when (healthPoints_player1) {
         in 90..100 -> println ("the player's health is normal")
         in 50..89 -> println ("the player's health is fine")
         in 0..49 -> println ("the player's health is awful")
         else -> println ("Error: the health point must be in the range of 0 to 100")
     }

    print("the second player has health points = $healthPoints_player2 so, ")
    when (healthPoints_player2) {
        in 90..100 -> println ("the player's health is normal")
        in 50..89 -> println ("the player's health is fine")
        in 0..49 -> println ("the player's health is awful")
        else -> println ("Error: the health point must be in the range of 0 to 100")
    }



}