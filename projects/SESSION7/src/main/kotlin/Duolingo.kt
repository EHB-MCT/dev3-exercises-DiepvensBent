class Duolingo(var roundSize: Int,var language: String, var difficulty: String?){
    var words = mutableSetOf(
        EnglishWord("Hallo","Hello"),
        EnglishWord("Dag","Day"),
        EnglishWord("Maan","Moon"),
        EnglishWord("Vis","Fish"),
        EnglishWord("Roos","Rose"),
        EnglishWord("Kaas","Cheese"),
        EnglishWord("Muis","Mouse"),
        EnglishWord("Vos","Fox"),
        EnglishWord("Kat","Cat"),
        EnglishWord("Hond","Dog"),
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
            this.language = "all"
            println("Round size = 6, all languages")
        } else if (difficulty == "GameJournalist"){
            this.roundSize = 1
            this.language = "Koe"
            println("Round size = 1, Moo")
        }
        words = words.filter { it.language == language }.toMutableSet()
        val selectedWords = words.shuffled().take(roundSize).toMutableSet()
        while (selectedWords.isNotEmpty()){
            val selectedWord = selectedWords.random()
            println(selectedWord.original)
            println("Translate word to "+selectedWord.language)
            val userAnswer = readLine()
            if (userAnswer == selectedWord.translated){
                selectedWords.remove(selectedWord)
                println("Correct!")
            }else{
                println("WRONG!")
                println("The correct word was "+selectedWord.translated)
            }
            val remainingWords = selectedWords.count()
            println("$remainingWords words remaining")
        }
        println("Good Job!")
        }
}


