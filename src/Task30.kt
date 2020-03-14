fun main() {
    var end = 1350_000;
    var set = (10..end).filter {
        it.toDouble().equals(it.toString().fold(0.0, { acc, c -> acc + Math.pow(c.toDouble()-48, 5.0) }))
    }.toSet()
    println(set)
    println(set.sum())
}