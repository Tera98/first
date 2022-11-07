package com.example.tera_practice


//Singleton Pattern

object CarFactory{
    val cars = mutableListOf<Car>()
    fun makeCar(horsePower: Int) : Car{
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}


data class Car(val horsePower : Int)

fun main(){
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(20)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())

}


