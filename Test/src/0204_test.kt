//package Tutorial
// 기본적인 함수(?) 사용법
fun sum(a: Int, b: Int): Int{
    return a+b
}

fun sum2(a: Int, b: Int) = a + b

fun sum3(a: Int, b: Int): Unit{ //void와 같은 의미
    println(a+b)
}

fun sum4(a: Int, b: Int){
    println(a+b)
}

fun main(args: Array<String>) {
    println("Hello world!")

    print("sum: ")
    println(sum(2,3))

    print("sum2: ")
    println(sum2(3,3))

    print("sum3: ")
    sum3(4,3)

    print("sum4: ")
    sum4(5,3)

    /*주석은 /*중첩 가능*/*/

}
