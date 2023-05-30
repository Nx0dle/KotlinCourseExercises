import kotlin.math.abs
import kotlin.system.exitProcess

fun Moves(s: String) {
    val grid = mutableListOf(
        mutableListOf<Char>(s[0], s[1], s[2]),
        mutableListOf<Char>(s[3], s[4], s[5]),
        mutableListOf<Char>(s[6], s[7], s[8])
    )
    while (true) {
        var cordsStr = readln()
        var x = cordsStr.split(" ").dropLast(1).joinToString().toIntOrNull()
        var y = cordsStr.split(" ").drop(1).joinToString().toIntOrNull()
            while (true) {
            if (x == null || y == null) {
                println("You should enter numbers!")
                cordsStr = readln()
                x = cordsStr.split(" ").dropLast(1).joinToString().toIntOrNull()
                y = cordsStr.split(" ").drop(1).joinToString().toIntOrNull()
            }
            if (x != null && y != null) {
                if (x > 3 || y > 3) {
                    println("Coordinates should be from 1 to 3!")
                    cordsStr = readln()
                    x = cordsStr.split(" ").dropLast(1).joinToString().toIntOrNull()
                    y = cordsStr.split(" ").drop(1).joinToString().toIntOrNull()
                }
            }
            if (x != null && y != null) {
                if (grid[x - 1][y - 1] == 'X' || grid[x - 1][y - 1] == 'O') {
                    println("This cell is occupied! Choose another one!")
                    cordsStr = readln()
                    x = cordsStr.split(" ").dropLast(1).joinToString().toIntOrNull()
                    y = cordsStr.split(" ").drop(1).joinToString().toIntOrNull()
                }
            }
            if (x != null && y != null) {
                if (!(grid[x - 1][y - 1] == 'X' || grid[x - 1][y - 1] == 'O') && !(x > 3 || y > 3)) {
                    break
                }
            }
        }
    if (x != null && y != null) {
        grid[x - 1][y - 1] = 'X'
    }
    println(
                "---------\n" +
                "| ${grid[0][0]} ${grid[0][1]} ${grid[0][2]} |\n" +
                "| ${grid[1][0]} ${grid[1][1]} ${grid[1][2]} |\n" +
                "| ${grid[2][0]} ${grid[2][1]} ${grid[2][2]} |\n" +
                "---------"
    )
    check(grid)

cordsStr = readln()
x = cordsStr.split(" ").dropLast(1).joinToString().toIntOrNull()
y = cordsStr.split(" ").drop(1).joinToString().toIntOrNull()
    while(true){
            if (x == null || y == null) {
                println("You should enter numbers!")
                cordsStr = readln()
                x = cordsStr.split(" ").dropLast(1).joinToString().toIntOrNull()
                y = cordsStr.split(" ").drop(1).joinToString().toIntOrNull()
            }
            if (x != null && y != null) {
                if (x > 3 || y > 3) {
                    println("Coordinates should be from 1 to 3!")
                    cordsStr = readln()
                    x = cordsStr.split(" ").dropLast(1).joinToString().toIntOrNull()
                    y = cordsStr.split(" ").drop(1).joinToString().toIntOrNull()
                }
            }
            if (x != null && y != null) {
                if (grid[x - 1][y - 1] == 'X' || grid[x - 1][y - 1] == 'O') {
                    println("This cell is occupied! Choose another one!")
                    cordsStr = readln()
                    x = cordsStr.split(" ").dropLast(1).joinToString().toIntOrNull()
                    y = cordsStr.split(" ").drop(1).joinToString().toIntOrNull()
                }
            }
            if (x != null && y != null) {
                if (!(grid[x - 1][y - 1] == 'X' || grid[x - 1][y - 1] == 'O') && !(x > 3 || y > 3)) {
                    break
                }
            }
        }
    if (x != null && y != null) {
        grid[x - 1][y - 1] = 'O'
    }
    println(
                "---------\n" +
                "| ${grid[0][0]} ${grid[0][1]} ${grid[0][2]} |\n" +
                "| ${grid[1][0]} ${grid[1][1]} ${grid[1][2]} |\n" +
                "| ${grid[2][0]} ${grid[2][1]} ${grid[2][2]} |\n" +
                "---------"
    )
    check(grid)
}

}

fun check(grid: MutableList<MutableList<Char>>){
    var winX = false
    if (((grid[0][0] == 'X') && (grid[0][1] == 'X') && (grid[0][2] == 'X')) ||
     ((grid[1][0] == 'X') && (grid[1][1] == 'X') && (grid[1][2] == 'X')) ||
     ((grid[2][0] == 'X') && (grid[2][1] == 'X') && (grid[2][2] == 'X')) ||
     ((grid[0][0] == 'X') && (grid[1][0] == 'X') && (grid[2][0] == 'X')) ||
     ((grid[0][1] == 'X') && (grid[1][1] == 'X') && (grid[2][1] == 'X')) ||
     ((grid[0][2] == 'X') && (grid[1][2] == 'X') && (grid[2][2] == 'X')) ||
     ((grid[0][0] == 'X') && (grid[1][1] == 'X') && (grid[2][2] == 'X')) ||
     ((grid[2][2] == 'X') && (grid[1][1] == 'X') && (grid[0][0] == 'X'))) winX = true

    var winO = false
    if (((grid[0][0] == 'O') && (grid[0][1] == 'O') && (grid[0][2] == 'O')) ||
     ((grid[1][0] == 'O') && (grid[1][1] == 'O') && (grid[1][2] == 'O')) ||
     ((grid[2][0] == 'O') && (grid[2][1] == 'O') && (grid[2][2] == 'O')) ||
     ((grid[0][0] == 'O') && (grid[1][0] == 'O') && (grid[2][0] == 'O')) ||
     ((grid[0][1] == 'O') && (grid[1][1] == 'O') && (grid[2][1] == 'O')) ||
     ((grid[0][2] == 'O') && (grid[1][2] == 'O') && (grid[2][2] == 'O')) ||
     ((grid[0][0] == 'O') && (grid[1][1] == 'O') && (grid[2][2] == 'O')) ||
     ((grid[2][2] == 'O') && (grid[1][1] == 'O') && (grid[0][0] == 'O'))) winO = true

    var draw = false
    if ((grid[0][0] != ' ') && (grid[0][1] != ' ') && (grid[0][2] != ' ') &&
     (grid[1][0] != ' ') && (grid[1][1] != ' ') && (grid[1][2] != ' ') &&
     (grid[2][0] != ' ') && (grid[2][1] != ' ') && (grid[2][2] != ' ')) draw = true

    if (winO) { println("O wins")
    exitProcess(0)}
    else if (winX) { println("X wins")
    exitProcess(0)}
    else if (draw) { println("Draw")
    exitProcess(0)}
}

fun main() {

    val s = "          "
    println("---------\n" +
            "| ${s[0]} ${s[1]} ${s[2]} |\n" +
            "| ${s[3]} ${s[4]} ${s[5]} |\n" +
            "| ${s[6]} ${s[7]} ${s[8]} |\n" +
            "---------")

        Moves(s)
}
