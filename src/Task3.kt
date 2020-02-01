fun main() {
    var num = 600851475143

    while (num %2 ==0L) {
        num /= 2
    }
    for (i in 3.. Int.MAX_VALUE step 2) {
        while (num % i.toLong() == 0L) {
            num /= i
            if(num == 1L) return print(i)
        }
    }
}

