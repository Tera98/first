package com.example.tera_practice




open class Human(val name : String = "Anonymous"){

    constructor(name : String, age :Int) : this(name){
        println("my name is ${name}, ${age} years old")
    }

    init{
        println("New human has been born")
    }

    fun eatingCake(){
        println("This is so YUMMY")
    }

    open fun SingASong(){
        println("lalala")
    }
}

class Korean : Human(){


    override fun SingASong(){
        super.SingASong()
        println("라라라")
        println("my name is : ${name}")
    }

}



fun main(){

//    val human = Human("Minsu")
//    val stranger = Human()
//
//    human.eatingCake()

//    val mom = Human("sook", 51)

//    println("This human's name is ${stranger.name}")

    val korean = Korean()
    korean.SingASong()

}