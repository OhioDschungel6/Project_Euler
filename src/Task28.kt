fun main() {

    var arr = Array<Array<Int>>(size) { i -> Array<Int>(size, { i -> 0 }) }
    (1..size * size).reversed()
}

const val size = 5
var posX = size
var posY = 1
var dir = Direction.East

fun isDiagonal(num: Int): Boolean {
    var ret = false
    if (posY + posX == size + 1) {
        ret = true
    }
    if (dir == Direction.East) {
        if (posX > 1) {
            posX--
        }else{
            dir = Direction.South
            posY++
        }
    } else if (dir == Direction.South) {
        if (posY <= size) {
            posY++
        }else{
            dir = Direction.West
        }
    } else if (dir == Direction.West) {
        if (posX <= size) {
            posX++
        }else{
            dir = Direction.North
        }
    } else if (dir == Direction.North) {
        if (posY > 1) {
            posY--
        }else{
            dir = Direction.East
        }
    }
    return ret
}

enum class Direction{
    North,
    South,
    West,
    East
}