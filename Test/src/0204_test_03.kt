package tutorial
// if문의 사용
// 함수의 식에도 사용 가능.
fun max1(a: Int, b: Int): Int {
    if (a > b)
        return a
    else
        return b
}

fun max2(a: Int, b: Int)  = if (a > b) a else b // 식에 if문 사용 가능

fun main(args: Array<String>) {

    println(max1(10,20))
    print(max2(100,200))
}
