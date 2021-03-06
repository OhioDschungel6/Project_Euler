fun main() {
    var primes = mutableListOf<Long>()
    primes.addAll(listOf(2,3,5,7,11,13,17,19))
    while (primes.size <= 10000){
        primes.add((primes.last()+2..Int.MAX_VALUE step 2).first { isPrime(it, primes) })
    }
    print(primes.last())
}

fun isPrime(num: Long, primes: MutableList<Long>): Boolean {
    return !primes.any { num % it == 0L }
}
