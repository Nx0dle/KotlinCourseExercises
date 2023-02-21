const val PI = 3.14

fun main() {
	val list = mutableListOf<Int>()
	val n = readln().toInt()

	repeat(n) {
		val h = readln().toInt()
		list.add(h)
	}

	println("${list.maxOrNull()} ${list.indexOf(list.maxOrNull()+1)}")
}