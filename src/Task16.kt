import java.math.BigInteger

fun main() {
    println(BigInteger("2").pow(1000)
        .toString().chars()
        .map { it - 48 }.sum()
    )
}