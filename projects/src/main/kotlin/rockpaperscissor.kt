fun main(){
    val options = arrayOf("rock","paper","scissors","lizard","spock")
    val computerChoice = options.random()
    val userChoice = getUserChoice(options)

    println("Computer picked $computerChoice")
    println("User picked $userChoice")
    determineWinner(computerChoice, userChoice)
}

fun getUserChoice(options: Array<String>): String? {
    var userChoice: String?
    do {
        println("Make your choice: rock - paper - scissors - lizard - spock")
        userChoice = readLine()
    } while(!options.contains(userChoice))

    return userChoice
}

fun determineWinner(computerChoice: String, userChoice: String?){
    if (computerChoice == userChoice){
        println("draw")
        return
    }
    val winMessage ="WINNER WINNER CHICKEN DINNER WOOOOOOOHOOOOOOOOOO"
    val loseMessage = "loser!"

    when(computerChoice){
        "rock" -> if (userChoice == "paper" || userChoice == "spock") println(winMessage) else println(loseMessage)
        "paper" -> if (userChoice == "scissors" || userChoice == "lizard") println(winMessage) else println(loseMessage)
        "scissors" -> if(userChoice == "rock" || userChoice == "spock") println(winMessage) else println(loseMessage)
    }
}