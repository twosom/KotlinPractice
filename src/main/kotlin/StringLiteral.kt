//String  대신에  str을 사용하는 것이 가능.
typealias str= String;

fun main(args: Array<String>) {
    var temp: str = "Somang Good";
    println(temp)
    println(str)



    //raw String
    var msg = "Hello\nKotlin"
    println(msg)

    msg = """Hello 
        |Kotlin
    """.trimMargin()

    println(msg)

    var msg1: String = "Hi Somang";
    println(msg1)
    //이런 형태를 raw string이라고 함.
    msg1 = """Hi
        |Somang
    """.trimMargin()
    println(msg1)


    var n1 = 10;
    var n2 = 20;

    //n1 + n2 = 30이런 형태로 출력
    //이렇게 문자열 안에 수식이나 변수를 출력하는 것을
    //문자열 템플릿이라고 한다.
    msg = "${n1} + ${n2} = ${n1 + n2}";
    println(msg)


    //숫자를 이용해서 문자 생성
    var ch : Char = 65.toChar();
    println(ch)
    ch  = '\uD55C'
    println(ch)
    ch = '\\'
    println(ch)

    var x : Int = 20;
    var y : Int = 3;

    x %= y

    println("결과는 ${x}");



}