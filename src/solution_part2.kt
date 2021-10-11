fun main(){
 val player1= 80
var healthPointP1= if (player1 in 50..90) {
  "Player1 you have $player1 health points so your health point is fine!!"
}else{
 " Player1 you have $player1 health points so your health point is awful!!"
}
 println(healthPointP1)

    val player2= 30
    var healthPointP2= if (player2 in 50..90) {
        "Player2 you have $player2 health points so your health point is fine!!"
    }else{
        "Player2 you have $player2 health points so your health point is awful!!"
    }
    println(healthPointP2)

}