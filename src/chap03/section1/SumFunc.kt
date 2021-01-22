package chap03.section1

fun sum(a: Int, b: Int): Int {
    return a + b
}
fun main() {
    val result1 = sum(2, 3)
    println(result1)
}

/*
sum이 아래와같이 되어있는 경우 작동하지 않는다.
이유 : Local function으로 처리되기 때문

fun main() {
    val result1 = sum(2, 3)
    println(result1)

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

}*/
