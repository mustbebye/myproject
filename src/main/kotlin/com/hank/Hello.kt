package com.hank

fun main() {
//    println("Hello Kotlin")
//    Human().hello()
    val h = Human()
    h.hello()

    /*
    val (value) can not change
    var (variable) can change
     */
    var age = 19
    age = 20
    var weight = 66.5f
    var name: String
    name = "Hank"

}

class Human {

    fun hello() {
        println("Hello World")
    }
}