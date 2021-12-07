class EnglishWord(
    override val original: String,
    override val translated: String,
    override var difficultyNumber: Int):Word(original, translated, "English", difficultyNumber) {
}