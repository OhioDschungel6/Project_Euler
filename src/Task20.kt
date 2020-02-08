import java.math.BigInteger

fun main() {
    var i = BigInteger("1")
    (1..100).forEach { i = i.multiply(BigInteger(it.toString())) }
    println(i.toString().chars().map { it - 48 }.sum())
}