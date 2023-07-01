fun main(){
    val border = "`-._,-'"
    val timesToRepeat = 4
    printBorder(border, timesToRepeat)
    println("  Happy Birthday, Jhansi!")
    printBorder(border, timesToRepeat)
}
fun printBorder(border: String, timesToRepeat: Int) {
    repeat(4) {
        print(border)
    }
    println()
}
