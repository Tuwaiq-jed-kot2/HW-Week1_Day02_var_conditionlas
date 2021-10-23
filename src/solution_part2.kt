fun main() {
    val Player1HealthPoints = 90
    val Player2HealthPoints = 40

/*------------------------------------------------------------------------------*/
    when (Player1HealthPoints) {
        in 90..100 -> println("the player's 1 health is perfect")
        in 50..89 -> println("the player's 1 health is fine")
        in 0..49 -> println("the player's 1 health is awful")
        else -> println("Score not valid")
    }
/*------------------------------------------------------------------------------*/
    when (Player2HealthPoints) {
        in 90..100 -> println("the player's 2 health is perfect")
        in 50..89 -> println("the player's 2 health is fine")
        in 0..49 -> println("the player's 2 health is awful")
        else -> println("wrong input")
    }
}