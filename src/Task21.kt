fun main() {
    var sum=0
    (1..9_999).forEach{
        var ds = getProperDivisorsSum(it)
        if (ds != it && getProperDivisorsSum(ds) == it ) {
            sum+= it
            println(it)
        }
    }
    println(sum)
}

fun getProperDivisorsSum(num: Int): Int {
    var list = mutableListOf<Int>(1)
    (2..Math.sqrt(num.toDouble()).toInt())
        .filter { num % it == 0 }
        .forEach {
            var other = num / it;
            if (other != it) {
                list.add(other)
            }
            list.add(it)
        }
    return list.sum()
}