import java.math.BigInteger
import java.nio.file.Files
import java.nio.file.Paths

fun main() {
    var l = Files.lines(Paths.get("src/names.txt"))
    l.use {
        var sum = BigInteger("0")
        var names: List<String> = mutableListOf()
        l.forEach { names = it.split(",").toList() }
        names.sorted()
            .mapIndexed { index, name -> (index + 1) * getScore(name) }
            .forEach { sum = sum.add(BigInteger(it.toString())) }
        println(sum)
    }
}

fun getScore(name: String): Int {
    return name.substring(1, name.lastIndex)
        .chars().map { it - 64 }
        .sum()
}