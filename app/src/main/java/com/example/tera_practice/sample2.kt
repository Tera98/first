package com.example.tera_practice

// 1. Lamda
// 람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수이다.
// 1) 메소드의 파라미터로 넘겨줄수가 있다. fun maxBy(a:Int)
// 2) 리턴 값으로 사용할 수가 있다.

// 1. 람다의 기본정의
// val lamdaName : Type = {argumentList -> codeBody}

val square : (Int) -> (Int) = {number -> number*number}
val nameAge = {name : String, age : Int ->
    "my name is ${name} I'm ${age}"
}


fun main(){
//
//    println(square(12))
//    println(nameAge("Tera",25))
//    val a = "tera said"
//    val b = "ads said"
//
//    println(a.pizzaIsGreat())
//    println(b.pizzaIsGreat())
//
//    println(extendStirng("Tera",25))
//    println(calculateGrade(97))
//    println(calculateGrade(971))

      val lamda = {number : Double ->
          number == 4.3213
      }

    println(invokelambda(lamda))
    println(invokelambda({ it > 3.22}))
    println(invokelambda { it > 3.22 })

}

// 확장함수

val pizzaIsGreat : String.() -> String = {
    this + " Pizza is the best!"
}

fun extendStirng(name : String,age : Int) : String{

    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it} years old."}
    return name.introduceMyself(age)
}

//  lambda 의 리턴

val calculateGrade : (Int) -> String ={
    when(it){
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

// 람다를 표현하는 여러가지 방법

fun invokelambda(lambda : (Double) -> Boolean) : Boolean{
    return lambda(5.2343)
}

// 익명 내부 함수
// 1. Kotlin interface 가 아닌 Java interface 여야한다.
// 2. 그 인터페이스는 딱 하나의 메소드만 가져야 합니다.








