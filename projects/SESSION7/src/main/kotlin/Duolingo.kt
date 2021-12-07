class Duolingo(var roundSize: Int,var language: String, var difficulty: String?){
    var words = mutableSetOf(
        EnglishWord("Hallo","Hello",2),
        EnglishWord("Dag","Day",1),
        EnglishWord("Maan","Moon",1),
        EnglishWord("Vis","Fish",1),
        EnglishWord("Roos","Rose",1),
        EnglishWord("Kaas","Cheese",2),
        EnglishWord("Muis","Mouse",2),
        EnglishWord("Vos","Fox",1),
        EnglishWord("Kat","Cat",1),
        EnglishWord("Hond","Dog",1),
        KoeWord("Hallo"),
        KoeWord("Dag",),
        KoeWord("Maan"),
        KoeWord("Vis"),
        KoeWord("Roos"),
        KoeWord("Kaas"),
        KoeWord("Muis"),
        KoeWord("Vos"),
        KoeWord("Kat"),
        KoeWord("Hond")
    )
    init{
        words = words.filter { it.language == language }.toMutableSet()
    }


    fun play() {
        if (difficulty == "Easy") {
            this.roundSize = 3
            this.language = arrayOf("English", "Koe").random()
            println("Round size = 3 , 1 language")
        } else if (difficulty == "Hard"){
            this.roundSize = 6
            this.language = arrayOf("English", "Koe").random()
            println("Round size = 6, all languages")
        } else if (difficulty == "GameJournalist"){
            this.roundSize = 1
            this.language = "Koe"
            println("Round size = 1, Moo")
        }
        //words = words.filter { it.language == language }.toMutableSet()

        val selectedWords = words.shuffled().take(roundSize).toMutableSet()
        while (selectedWords.isNotEmpty()){
            var selectedWord = selectedWords.random()
            println(selectedWord.original)
            println("Translate word to "+selectedWord.language)
            val userAnswer = readLine()
            if (userAnswer == selectedWord.translated){
                selectedWords.remove(selectedWord)
                if (selectedWord.difficultyNumber>1){
                selectedWord.difficultyNumber-- }
                println("Correct!")

            }else{
                println("WRONG!")
                selectedWord.difficultyNumber += 2
                println("The correct word was "+selectedWord.translated)
                println("Word difficulty = ${selectedWord.difficultyNumber}")
            }
            val remainingWords = selectedWords.count()
            println("$remainingWords words remaining")
        }
        println("Good Job!")
        }
}


