package chap03.section1

/*
* 이 함수는 다음과 같이 간략화가 가능하다
* 1단계 : fun sum(a: Int, b:Int):Int = a + b
* 2단계 : fun sum(a: Int, b:Int) = a + b
*   - a, b 로부터 자료형이 추론되어 자료형 생략 가능한 것!
*
* */
fun sum(a: Int, b: Int = 5) = a + b

fun max(a: Int, b: Int) = if (a > b) a else b

//또한 반환값은 생략가능한데, 반환값의 자료형을 Unit으로 지정하거나 생략하는 방식으로 해야한다.
fun outfunc(name: String) = println("Name: $name")

fun main() {
    val result1 = sum(2, 3)
    val result3 = sum(2)
    val a = 3
    val b = 5

    val result2 = max(a, b)
    outfunc("Seojun")
    println(result1)
    println(result2)
    println(result3)
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
