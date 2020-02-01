fun main() {
    val num1= (1..100).map { it*it }.sum()
    val num2 = (1..100).sum()

    print(num2*num2-num1)
}