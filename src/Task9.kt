fun main() {
    for (i in 1..1000) {
        for (j in i + 1..1000) {
            for (k in j + 1..1000) {
                if (i + j + k == 1000) {
                    if (i * i + j * j == k * k) {
                        println(i*j*k)
                    }
                }
            }
        }
    }
}