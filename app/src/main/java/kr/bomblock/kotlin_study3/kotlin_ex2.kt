package kr.bomblock.kotlin_study3

import android.app.Person

fun main(){
    var denis = Person("Denis", "Panjuta")
    var john = Person()
    var johnPeterson = Person(lastName = "Peterson")

class Person(firstName: String = "John", lastName: String ="Doe"){

    init {
        println("Initialized a new Person object with" + "firstName = $firstName and lastName = $lastName")
    }
}
}