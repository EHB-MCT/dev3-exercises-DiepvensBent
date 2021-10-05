fun main () {
    println("Hello World!")
    greeting()
}
fun greeting(){
    val arr = arrayOf("Bent", "Gijs", "Kylian")
    arr.forEach { println("Hello $it!") }
    for (element in arr){
        println("Hello $element")
    }
}