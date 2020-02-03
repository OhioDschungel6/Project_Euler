fun main() {
    var sum = 0L;
    println((1..Long.MAX_VALUE step 1).first { i ->
        sum += i
        var c = (1..Math.sqrt(sum.toDouble()).toInt()).count { sum % it == 0L } *2
        c > 500
    })
}