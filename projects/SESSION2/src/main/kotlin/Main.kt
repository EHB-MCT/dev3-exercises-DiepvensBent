fun main () {
    println("You are a student of the Erasmus Hogeschool Brussel and follow the subject DEV2 which 'definitely' is your favorite.")
    println("Bert your teacher, has hidden the answers to the practical exam in the school.")
    println("Thus starts your quest to steal the exam answers.")
    println("The great Erasmus Break-In begins!")
    challenge1()
}
fun challenge1() {
    println("First you need to choose when you will try to break in.")
    println("Will you: ")
    println("1: Break in at day.")
    println("2: Break in at night.")
    val options1 = setOf("1","2")
    val userChoice = getUserChoice(options1)
    if (userChoice == "1"){
        println("You decide to break-in during the day.")
        println("You're standing in front of the school near the entrance.")
        println("While getting ready to break in you sneak closer.")
        println("Until...")
        println("The door opens automatically...")
        println("Who would've thought a school being open during the day.....")
        println("Well, I guess everyone but you........")
        println("The school is bustling with activity.")
        println("No idea how you are going to steal when there are so many people here.")
        println("But you do you I guess...")
        println("You enter the building and proceed further down the hall.")
        println("Suddenly someone taps your shoulder")
        println("It's Bert!")
        println("Bert: Oh, hi there! What are you doing here? You shouldn't have any lessons.")
        println("You struggle to find an answer")
        println("Bert: Oh! I know! You're here to follow an extra lesson of your favorite subject DEV2!")
        println("Without being able to answer he takes you with him to the classroom")
        println("*4 HOURS LATER*")
        println("You leave the classroom mentally exhausted. He kept on talking about some weird island called 'Kotlin?' ")
        println("You are too tired to do any stealing so you go back home.")
        println("GAME OVER")
    } else if (userChoice == "2"){
        println("You decide to break-in during the night.")
        challenge2()
    }
}
fun challenge2() {

}



fun getUserChoice(options: Set<String>): String? {
    var userChoice: String?
    do {
        println("Type a number to make a choice")
        userChoice = readLine()
    } while (!options.contains(userChoice))
    return userChoice
}