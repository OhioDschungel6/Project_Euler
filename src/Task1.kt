fun main() {
    var answer =0
    var i=1
    while (i*3<1000) {
        answer+=i*3
        i++
    }
    i=1
    while (i*5<1000) {
        answer+=i*5
        i++
    }
    i=1
    while (i*15<1000) {
        answer-=i*15
        i++
    }
    print(answer)
}