fun main() {
    var primes = mutableListOf<Long>()
    primes.addAll(listOf(2,3,5,7,11,13,17,19))
    while (primes.last() < 2_000_000){
        primes.add((primes.last()+2..Int.MAX_VALUE step 2).first { isPrime(it, primes) })
    }
    primes.removeAt(primes.lastIndex)
    println(primes.sum())
}
