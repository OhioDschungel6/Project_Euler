fun main() {
    print((999 downTo 100).flatMap {i-> (999 downTo 100).map { it*i  } }.filter { isPalindrome(it) }.sortedDescending().first())
}
fun isPalindrome(num:Int): Boolean {
    val s =num.toString()
    val first = s.subSequence(0, s.length/2)
    val second = s.subSequence((s.length+1)/2, s.length).reversed().toString()
    return first.equals(second)
}