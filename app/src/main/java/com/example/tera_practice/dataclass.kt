package com.example.tera_practice

// 2. data class

// pojo class 모델이 되는 클래스

data class Ticket(val companyName : String, val name :String, var date : String, var seatNumber : Int)

// toString(), hashcode(), equals(), copy() 자동

fun main(){
    val ticketA = Ticket("koreanAir","awy","2022-01-01",14)
}

