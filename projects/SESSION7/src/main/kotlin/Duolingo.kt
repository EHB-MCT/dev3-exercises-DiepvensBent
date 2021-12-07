class Duolingo(val roundSize: Int,val language: String){
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


