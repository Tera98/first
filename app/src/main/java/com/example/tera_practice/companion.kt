package com.example.tera_practice

// 3. Companion Object

class Book private constructor(val id : Int, val name : String){

    companion object BookFactory : Idprovider{

        override fun getId(): Int {
            return 444
        }
        val myBook = "new book"
        fun create() = Book(getId(), myBook)

    }
}

interface Idprovider{
    fun getId() : Int
}


fun main(){

    val book = Book.create()

    val bookId = Book.getId()

    println("${book.id} ${book.name}")
}






