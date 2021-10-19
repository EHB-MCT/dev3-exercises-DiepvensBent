class Chatbot(override val name: String): Person(name)  {
    override fun introduce(){
        println("Hi! I'm $name")
    }
    override fun talk(){
        println("BEEP BOOP MALFUNCTION")

    }

}