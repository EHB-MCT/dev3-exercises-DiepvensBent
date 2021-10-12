fun main () {
    println("You are a student of the Erasmus Hogeschool Brussel and follow the subject DEV3 which 'definitely' is your favorite.")
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
        println("Bert: Oh! I know! You're here to follow an extra lesson of your favorite subject DEV3!")
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
    println("door closed pick lock")
    println("dodge alarm choose red or blue")
    val diceResult=(1..6).random()
    val userAnswer = readLine()
    if (userAnswer == "red" && (1..3).contains(diceResult)){
        println("door unlocked gj")
        challenge3()
    } else if (userAnswer == "blue" && (4..6).contains(diceResult)){
        println("door unlocked gj")
        challenge3()
    } else {
        println("you accidentaly trigger alarm and get caught")
        println("GAME OVER")
    }

}

fun challenge3(){
    println("oh no there is guard")
    println("will you  1sneak around, 2fight guard, 3take the mop to fight guard")
    val options2 = setOf("1","2","3")
    val userChoice = getUserChoice(options2)
    if (userChoice == "1") {
        println("you succesfully evade guard as he was sleeping")
        challenge4()
    } else if (userChoice == "2"){
        println("you try to fight but you weak af so now you got caught")
        println("GAME OVER")
    } else if (userChoice =="3") {
        println("you try to take mop but floor slippery and you fall out of window but dw you only first floor and fall on bush")
        println("but now you need to open door again")
        challenge2()
    }
}

fun challenge4(){
    println("you found a safe exam must be in there now guess the code")


}

fun getUserChoice(options: Set<String>): String? {
    var userChoice: String?
    do {
        println("Type a number to make a choice")
        userChoice = readLine()
    } while (!options.contains(userChoice))
    return userChoice
}

fun guessCode(options: ){

}