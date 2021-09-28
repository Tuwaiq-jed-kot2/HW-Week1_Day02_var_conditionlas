fun main(){
    val player1 = 43
    val player2 = 76
    if (player1 in 90..100) {
        println ("player1 health is full")
    }
    else if (player1 in 50..89){
        println ("player1 health is fine")
    }
    else if (player1 in 0..49){
        println ("player1 health is awful")
    }
    else println ("wrong input")

    if (player2 in 90..100) {
        println ("player2 health is full")
    }
    else if (player2 in 50..89){
        println ("player2 health is fine")
    }
    else if (player2 in 0..49){
        println ("player2 health is awful")
    }
    else println ("wrong input")

}


/* side note
the home work could've been done using while as shown below

when (player1) {
        in 90..100 -> {
            println ("player1 health is full")
        }
        in 50..89 -> {
            println ("player1 health is fine")
        }
        in 0..49 -> {
            println ("player1 health is awful")
        }
        else -> println ("wrong input")
    }

    when (player2) {
        in 90..100 -> {
            println ("player2 health is full")
        }
        in 50..89 -> {
            println ("player2 health is fine")
        }
        in 0..49 -> {
            println ("player2 health is awful")
        }
        else -> println ("wrong input")
    }

 */