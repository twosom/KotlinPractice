import kotlin.math.truncate

fun main(arg: Array<String>) {
    //1부터 10까지 합계 구하기
    var tot : Int = 0;
    var idx : Int = 1;
    while (idx <= 1000) {
        tot += idx;
        idx+=1;
    }
    println("total = ${tot}")


    //0.1을 1000번 더하기
    var sum : Double = 0.0;
    idx = 0;

    do {

        idx += 1;
        sum += 0.1
    } while (idx < 1000);
    //실수를 가지고 연산을 수행하면 올바른 결과가 나오지 않을 수 있음.
    println("sum : ${sum}")

    idx = 0;
    while (idx < 10) {
        idx += 1
        //idx가 3의 배수면 종료
        //break대신에 continue를 사용하면 3의 배수인 경우만
        //출력에서 제외됨~^_^
        if (idx % 3 == 0) {
            continue
        }
        println("idx : ${idx} ")
    }

    outer@for (i in 1..3) {
        for (j in 1..3) {
            if (j > 1) {
                //outer라는 레이블을 가진 반복문을 종료
                break@outer
            }
            println("i : ${i} j : ${j}");

        }
    }



}