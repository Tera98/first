package com.example.tera_practice

fun main(){
//    helloWorld()
//
//    println(add(4,5))
//
//    //3. String template
//
//    val name = "Tera"
//    val lastname = "An"
//
//    println("My name is ${name+lastname} I'm 25")
//    println("is this true? ${1==0}")
//    println("this is 2\$a")

//    checkNum(1)

//    forAndWhile()

//nullcheck()

    ignoreNulls("atr")
}


// 1. 함수
// 회색 글씨 생략가능 Unit == void
fun helloWorld() :  Unit{
    println("Hello World!")
}

// return 값이 있으면 형식 필수
// 변수 명이 형식보다 앞에 위치
fun add(a : Int, b : Int) : Int{
    return a+b
}

//2 val vs var
// val = value  var = variable

fun hi(){
    val a : Int = 10
    var b : Int = 9
    var e : String
    b = 100

    // 형식 지정 불필요 val,var 지정은 필수

    val c = 100
    var d = 100
    var name = "Tera"

}

// 4. 조건식

fun maxBy(a : Int,b: Int) : Int{

    if(a>b){
        return  a
    }
    else {
        return b
    }
}

fun maxBy1(a: Int, b: Int) = if(a>b) a else b

fun checkNum(score : Int){
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2,3")
        else -> println("I don't know")
    }

    var b: Int = when(score){
        1->1
        2->2
        else -> 3
    }

    println("b : ${b}")

    when(score){
        in 90..100 -> println("you are genius")
        in 10..80 -> println("Not bad")
        else -> println("okay")
    }
}

// Expression vs Statement

// 값을 만드면 expression(모든 함수)

// 5. Array and List

// Array 메모리 할당되어있음
// 1. List 2. MutableList

fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1,"d",3.4f)
    val list2 = listOf(1,"d",11L)

    array[0] = 3
    var result = list.get(0)

    val arraylist = arrayListOf<Int>()
    arraylist.add(10)
    arraylist.add(20)
    arraylist[0] = 20

}

// 6. 반복문 For / While

fun forAndWhile(){

    val student = arrayListOf("Joyce","james","jenny","jennifer")

    for (name in student) {
        println("${name}")
    }
    var sum : Int = 0
    for ( i in 1 until 100){  // 1..100 100번
            sum+= i
    }
    println(sum)

    var index = 0
    while(index < 10){
        println("current index : ${index++}")
    }

    for ((index, name) in student.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }

}

// 7. Nullable / NonNull

fun nullcheck(){
    // NPE : NULL pointer exception

    var name : String = "Tera"
    var nullname : String? = null

    var nameInUppercase = name.uppercase()
    var nullnameinuppercase = nullname?.uppercase()

    // ?:

    val lastName : String? = null

    val fullname = name +" "+ (lastName ?: "NO Lastname")

    println(fullname)


    //!!

}

fun ignoreNulls(str : String?){

    val mNotNull : String = str!! // 확실하지 않으면 지양하자
    val upper = mNotNull.uppercase()



    val email : String? =  "shyragon@naver.com"
    email?.let{
        println("my email is ${email}")
    }

}

// 8. class












