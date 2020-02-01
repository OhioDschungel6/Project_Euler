fun main() {
    println((2520..Int.MAX_VALUE).filter { dividableByAll(it)  }.first())
}

val list = listOf(20,19,18,17,16,15,14,13,11)
fun dividableByAll(num: Int): Boolean {
    return list.all { num % it == 0 }
}
