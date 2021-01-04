var rw : Int = 20   //변경 가능한 변수 설정
    get(){
        println("rw의 getter 호출");
        return field;   //원래의 값을 리턴

    }
    set(value : Int){
        println("rw의 setter 호출");
        field = value;
        //this.value (field) = value;
    }

//val는 setter 가 없는 것

var b  : Boolean = true;
//getter를 재정의해서 원래 의 값과 다른 값 사용이 가능
val r : String = "Hello Somang"
    get() {
        if (b == true) {
            return field.toUpperCase();
        } else {
            return field.toLowerCase();
        }
    }


//val 앞에 const를 추가하면 getter를 Overriding 할 수 없음
//초기값만 사용해야 한다.
const val constant : String = "Hi";


val i1 : Int = 30
    get() {
        if (b == true) {
            return field + 20;
        } else {
            return field;
        }

    }


fun main(args: Array<String>) {
    rw = 100;   //rw의 setter를 호출
//    println(rw);    //rw의 getter를 호출

    //r에 값을 대입하는 것은 안됨
    b = false;
    println(r);
    println(i1);
    b = true;
    println(r);
    println(i1);
}