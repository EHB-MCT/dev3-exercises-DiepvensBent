
fun main(){
    println("What difficulty do you wish to use?")
    println("Easy or Hard")
    val options = setOf("Easy","Hard","GameJournalist")
    val userChoice = getUserChoice(options)
    val duolingo = Duolingo(5,arrayOf("English", "Koe").random(), userChoice)
    duolingo.play()
}
fun getUserChoice(options: Set<String>): String? {
    var userChoice: String?
    do {
        println("Please type a viable term")
        userChoice = readLine()
    } while (!options.contains(userChoice))
    return userChoice
}