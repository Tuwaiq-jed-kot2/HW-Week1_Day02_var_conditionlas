fun main() {


    val Player1HealthPoints = 90
    val Player2HealthPoints = 50

    when (Player1HealthPoints) {

        in 90..100 -> println("the player1 health is fine")
        in 49..50 -> println("the player1 health is awful")
        else -> println("Score not valid")

    }


    when (Player2HealthPoints) {

        in 90..100 -> println("the player2 health is fine")
        in 49..50 -> println("the player2 health is awful")
        else -> println("Score not valid")

    }

}
