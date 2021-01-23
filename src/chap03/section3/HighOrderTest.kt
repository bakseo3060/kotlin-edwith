package chap03.section3

fun highFuncA(sum: (Int, Int) -> Int, a: Int, b: Int): Int {
    return sum(a, b)
}

fun highFuncB(a: Int, b: Int, sum: (Int, Int) -> Int): Int {
    return sum(a, b)
}

fun main() {
    val resultA = highFuncA({ x, y -> x + y }, 1, 3)
    val resultB = highFuncB(1, 3) { x, y ->
        x + y
    }
    println(resultA)
    println(resultB)
}