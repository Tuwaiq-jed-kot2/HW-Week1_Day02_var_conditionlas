fun main(){


    val player1healthPoints = 72
    val player2healthPoints = 22

    if(player1healthPoints in 50..89) {
        println("The player's health is fine")
    }else if(player1healthPoints in 0..49){
        println("The player's health is awful")
    }
    if(player2healthPoints in 50..89) {
        println("The player's health is fine")
    }else if(player2healthPoints in 0..49){
        println("The player's health is awful")
    }


}