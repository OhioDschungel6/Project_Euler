fun main() {
    val fibs = Fibonacci(4_000_000)
    var answer = 0
    for (fib in fibs.iterator()) {
        answer += if(fib%2==0) fib else 0
    }
    print(answer)

}
class Fibonacci(limit: Int): Iterable<Int>{
    var lastFibonacci = 1
    var currentFibonacci =1
    val limit = limit

    override fun iterator(): Iterator<Int> {
        return object : Iterator<Int>{
            override fun hasNext(): Boolean {
                return currentFibonacci+lastFibonacci <limit
            }

            override fun next(): Int {
                val tmp = currentFibonacci
                currentFibonacci= currentFibonacci+ lastFibonacci
                lastFibonacci = tmp
                return currentFibonacci
            }
        }
    }

}