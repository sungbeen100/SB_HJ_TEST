package tutorial
// is 연산자는 대상이 지정한 타입의 인스턴스(객체)인지 검사. 불변 로컬변수(val?)나 프로퍼티에 대해 특정 타입인지 검사하면, 명시적으로 타입을 변환할 필요가 없다.
fun getStringLength1(obj: Any): Int? {
    if (obj is String){ // 해당 구역에서의 obj는 자동으로 String로 변환
        return obj.length
    } // 해당 구역 밖에서의 obj는 여전히 Any 타입

    return null
}

fun getStringLength2(obj: Any): Int? {
    if (obj is String && obj.length > 0){ // &&의 우측에서 자동으로 변환.
        return obj.length
    } // 해당 구역 밖에서의 obj는 여전히 Any 타입

    return null
}

fun main(args: Array<String>) {
    var string1: String = "Hello World"
    var string2: String = "" // String은 nullable('?') ????

    println("---getStringLength1---")
    println(getStringLength1(string1))
    println(getStringLength1(string2))
    println("")

    println("---getStringLength2---")
    println(getStringLength2(string1))
    println(getStringLength2(string2))
    println("")

    print("월요일 너무 싫다")
}