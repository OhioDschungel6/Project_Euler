import java.math.BigInteger

fun main() {
    var int = 2;
    for (i in FibonacciBig()) {
        int++
        if (i.toString().length >= 1000) {
            println(int)
            return
        }
    }
}

class FibonacciBig(): Iterable<BigInteger>{
    var lastFibonacci = BigInteger("1")
    var currentFibonacci = BigInteger("1")

    override fun iterator(): Iterator<BigInteger> {
        return object : Iterator<BigInteger>{
            override fun hasNext(): Boolean {
                return true
            }

            override fun next(): BigInteger {
                val tmp = currentFibonacci
                currentFibonacci += lastFibonacci
                lastFibonacci = tmp
                return currentFibonacci
            }
        }
    }

}