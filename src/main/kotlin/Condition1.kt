fun main(args: Array<String>) {
    val score: Int = 90;
    //score 가 90 이상이면 합격,
    //그렇지 않으면 불합격
    if (score >= 90) println("합격"); else println("불합격");

    var food: String = "짜장면";
    when (food) {
        "짜장면" -> println("중식")
        "김치찌개" -> println("한식")
        "규동" -> println("일식")
        else -> println("분식")
    }
    //값을 여러 개 나열하는 것이 가능
    food = "짬뽕"
    when (food) {
        "짜장면", "짬뽕" -> println("중식")
        "김치찌개" -> println("한식")
        "규동" -> println("일식")
        else -> println("분식")
    }

    //값에 Boolean 식을 사용하는 것도 가능
    when {
        food is String -> println("food 는 문자열")
        else -> println("food는 문자열이 아님")
    }

    var jumsu: Int = 50;
    when {
        jumsu in 60..100 -> println("합격")
        else -> println("불합격")
    }


}