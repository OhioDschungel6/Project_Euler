fun main() {
    var digits = listOf(0, 1, 2,3,4,5,6,7,8,9)
    var perms = getRecursivePermutations(digits).map { it.toLong() }
        .sorted()
    println(perms.get(999_999))
}

fun getRecursivePermutations(list: List<Int>): List<String> {
    var rList = mutableListOf<String>()
    if (list.size == 1) {
        return list.map { it.toString() }
    }
    for (i in list) {
        var l = mutableListOf<Int>()
        l.addAll(list)
        l.remove(i)
        rList.addAll(getRecursivePermutations(l)
            .map { i.toString() + it })
    }
    return rList;
}