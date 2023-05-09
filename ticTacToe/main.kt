fun firstMove(s: String) {
    val grid = mutableListOf(
        mutableListOf<Char>(s[0], s[1], s[2]),
        mutableListOf<Char>(s[3], s[4], s[5]),
        mutableListOf<Char>(s[6], s[7], s[8])
    )
    var cordsStr = readln()
    var x = cordsStr.split(" ").dropLast(1).joinToString().toIntOrNull()
    var y = cordsStr.split(" ").drop(1).joinToString().toIntOrNull()
    while (true) {
        if (x == null || y == null) {
            println("Must be a digit")
            cordsStr = readln()
            x = cordsStr.split(" ").dropLast(1).joinToString().toIntOrNull()
            y = cordsStr.split(" ").drop(1).joinToString().toIntOrNull()
        }
        if (x != null && y != null) {
            if (x > 3 || y > 3) {
                println("Must be from 1 to 3")
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
}


fun main() {
    val s = readln()
    val checks = listOf(0, 4, 8, 2, 4, 6, 0, 1, 2, 3, 4, 5, 6, 7, 8, 0, 3, 6, 1, 4, 7, 2, 5, 8).chunked(3)
    var checkX = 0
    var checkO = 0
    val countX = s.count { it == 'X' }
    val countO = s.count { it == 'O' }
    val countFree = s.count { it == '_' || it == ' ' }
    val countMoves = countX + countO

    for (triplePos in checks) {
        var str = ""
        for (j in triplePos) str += s[j]
        when (str) {
            "XXX" -> checkX++
            "OOO" -> checkO++
        }
    }

    println("---------\n" +
            "| ${s[0]} ${s[1]} ${s[2]} |\n" +
            "| ${s[3]} ${s[4]} ${s[5]} |\n" +
            "| ${s[6]} ${s[7]} ${s[8]} |\n" +
            "---------")

    firstMove(s)

    /*println(when {
        abs(countX - countO) > 1 -> "Impossible"
        checkX > 0 && checkO > 0 -> "Impossible"
        checkX == 0 && checkO == 0 && countFree > 0 -> "Game not finished"
        checkX == 0 && checkO == 0 && countFree == 0 -> "Draw"
        checkX == 1 && checkO == 0 -> "X wins"
        checkX == 0 && checkO == 1 -> "O wins"
        else -> ""
    })*/
}