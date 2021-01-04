fun main(args: Array<String>) {
    for (idx in 1..9 step 2){
        println(idx)
    }
    //image1.png ~ image.png 까지 출력
    for (idx in 1..9) {
        println("image${idx}.png")

    }


    //배열과 List 생성
    var ar = arrayOf<String>("소망", "예송", "찬송")


    //index와 값을 idx에 대
    for (idx in ar.withIndex()) {
        println(idx)
    }

    //index를 idx에 대
    var list = listOf<String>("기본문법", "SDK에 대한 이해", "프레임워크")

    for (idx in list.withIndex()) {
        println(idx)
    }




    for (x in 2..9) {
        for (y in 1..9) {
            println("${x} X ${y} = ${x * y}")
        }
        println()
    }

}