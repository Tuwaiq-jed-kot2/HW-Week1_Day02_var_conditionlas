fun main(){
    val playerOne = 80
    val playerTwo = 50
    val playerOneName = "Ahmed"
    val playerTwoName = "Khaled"

    if (playerOne  > 50) {
        println("The player's health is fine")
    }else{
        println("The player's health is awful")
    }
    if (playerTwo  > 50) {
        println("The player's health is fine")
    }else{
        println("The player's health is awful")
    }
//حل ثاني
    if (playerOne in 51..90) {
        println("$playerOneName's health is fine")
    }else if (playerOne <= 50){
        println("$playerOneName's health is awful")
    }
    if (playerTwo in 51..90) {
        println("$playerTwoName's health is fine")
    }else if (playerTwo <= 50){
        println("$playerTwoName's health is awful")
    }
    // حل ثالث
    println("Enter your Name:")
    val playerName = readLine()
    println("Enter your health point:")
    val playerHealthPoint = readLine()

    if (playerHealthPoint != null) {
        if(playerHealthPoint > 50.toString()){
            println("$playerName's health is fine")
        }else if (playerHealthPoint != null) {
            if(playerHealthPoint <= 50.toString()){
                println("$playerName's health is awful")
            }
        }
    }

}