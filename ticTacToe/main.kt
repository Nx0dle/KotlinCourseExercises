package tictactoe

fun main() {
    val str = readln().trimMargin()
    val charArray = str.toCharArray()
    println("---------")
    println("| ${charArray[0]} ${charArray[1]} ${charArray[2]} |")
    println("| ${charArray[3]} ${charArray[4]} ${charArray[5]} |")
    println("| ${charArray[6]} ${charArray[7]} ${charArray[8]} |")
    println("---------")
}