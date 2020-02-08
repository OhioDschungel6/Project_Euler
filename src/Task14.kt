fun main() {
    println((1..1_000_000).map { collatz(it) }.maxBy { it.second })

}
val map = hashMapOf <Long,Long>()

fun collatz(it: Int): Pair<Int, Long> {
    var num = it.toLong();
    var chain = 0L
    while (num != 1L) {
        var c = map.get(num)
        if (c != null) {
            map.put(it.toLong(), chain+c)
            return Pair(it, chain+ c)
        }
        if (num.and(1L) == 0L) {
            num = num.shr(1)
        } else {
            num = num * 3 + 1
        }
        chain++
    }
    map.put(it.toLong(), chain)
    return Pair(it, chain)
}
