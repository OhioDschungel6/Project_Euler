fun main() {
    var abundantList = (1..28123).filter { getProperDivisorsSum(it)>it }.toHashSet()
    println((1..28123).filter { !canBeWrittenAsAbundantSum(it, abundantList) }.map { it.toLong() }.sum())

}

fun canBeWrittenAsAbundantSum(num: Int, abundantList: HashSet<Int>): Boolean {
    for (i in abundantList) {
        if (abundantList.contains(num - i)) {
            return true
        }
    }
    return false
}
