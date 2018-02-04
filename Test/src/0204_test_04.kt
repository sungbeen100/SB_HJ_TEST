package tutorial

fun main(args: Array<String>) {
    var a: Int? = null // nullable하게 선언하려면 '?'을 붙여서 사용
    var b: Int = 3
    //null을 명시하지 않으면 에러 발생
    //a = 3

    if (a != null)
        println("a is $a")
    else
        println("%a is null")

    var any1: Any = b // 모든 타입은 Any에 담을 수 있음
    var any2 : Any? = a  // nullable한 변수 선언시 any타입에도 동일하게 사용

    println("any1 is $any1")
    println("any2 is $any2")

}