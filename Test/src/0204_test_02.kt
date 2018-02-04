package tutorial
//변수 선언 방법, 읽기전용(변경불가) 변수, 변경 가능 함수
//주석의 중첩사용
fun main(args: Array<String>) {
    val a: Int = 10 // val은 읽기 전용 변수. 값을 한 번만 할당한다.
    val b = 10 // 타입 추론. Int
    val c: Int // 값을 할당하지 않고 변수 정의 시 타입 명시 필요
    c = 1 // 할당

    // var은 변경 가능한 변수
    var x = 5 // Int 타입 추론
    x += 1 // 값의 변경 가능

    /*주석의    /*중첩이    //가능하다*/    */

}