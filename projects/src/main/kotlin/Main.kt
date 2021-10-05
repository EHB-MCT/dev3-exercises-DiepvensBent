fun main () {
    val arr = arrayOf("Bent", "Gijs", "Kylian")
    for(friend in arr){
        greeting(friend)
    }
}
fun greeting(friend: String){
    println("Hello $friend")
}