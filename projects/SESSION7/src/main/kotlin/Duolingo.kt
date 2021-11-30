class Duolingo {
    val words = mutableSetOf<Word>(
        Word("Hallo","Hello","English"),
        Word("Dag","Day","English"),
        Word("Maan","Moon","English"),
        Word("Vis","Fish","English"),
        Word("Roos","Rose","English"),
        Word("Kaas","Cheese","English"),
        Word("Muis","Mouse","English"),
        Word("Vos","Fox","English"),
        Word("Kat","Cat","English"),
        Word("Hond","Dog","English"),
        Word("Hallo","Koe","Koe"),
        Word("Dag","Koe","Koe"),
        Word("Maan","Koe","Koe"),
        Word("Vis","Koe","Koe"),
        Word("Roos","Koe","Koe"),
        Word("Kaas","Koe","Koe"),
        Word("Muis","Koe","Koe"),
        Word("Vos","Koe","Koe"),
        Word("Kat","Koe","Koe"),
        Word("Hond","Koe","Koe")
    )

    var roundSize: Int = 5
    var language: String = "English"
    constructor(roundSize: Int, language: String) {
        this.roundSize = roundSize
        this.language = language

    }

    fun play() {
        words = words.filter { it.language == language }.toSet()
        val selectedWords = words.shuffled().take(5).toMutableSet()
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
            println(""+remainingWords+" words remaining")
        }
        println("Good Job!")
        }
}


