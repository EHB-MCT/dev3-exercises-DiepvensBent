class Chatbot(val name: String): ChatPartner  {
    override fun introduce(){
        println("Hi! I'm $name")
    }

    override fun talk(){
        println("BEEP BOOP MALFUNCTION")
    }
}