fun main(){
    //val design1 = Course("Design1",5, "Fenna with last name","a meh course",1,"test",2022)


    val personArray = arrayOf(Comedian("Dave",),Teacher("John"),Student("Joe"),Chatbot("Clippy"))

    val chatPartner = personArray.random()
    chatPartner.introduce()
    chatPartner.talk()
    
}
