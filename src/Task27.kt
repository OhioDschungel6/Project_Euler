import kotlin.math.absoluteValue

fun main() {
    var max = 0;
    for (a in -999..999) {
        for (b in -1000..1000) {
            var n = 0
            while (isPrime((n * n + a * n + b).toLong().absoluteValue)) {
                n++
            }
            if (max < n) {
                max = n
                println(a*b)
                println("N: ${n}")
            }
        }
    }
}
fun isPrime(num: Long): Boolean {
    if (num % 2 == 0L) {
        return false
    }
    return !(3..Math.sqrt(num.toDouble()).toInt() step 2).any { num % it == 0L }
}