fun main() {
    var set = mutableSetOf<Double>()
    var size = 100
    (2..size).forEach { i -> (2..size).forEach{ set.add(Math.pow(i.toDouble(), it.toDouble()))} }
    println(set.size)
}