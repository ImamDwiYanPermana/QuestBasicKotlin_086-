package com.example.basickotlin

fun ConditionalStatement(){
    println("=== Conditional Expression ===")

    //if else
    val number = 10
    if (number > 10){
        println("postive number")
    }else{
        println("negative number")
    }


    val day = 1
    when (day){
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("wednesdat")
        5 -> println("Thursdat")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("invalid")
    }

    val value = 10
    try{
        val result = value.toInt()
        println("result: $result")
    } catch (e: NumberFormatException){
        println("Invalid Number")
    }
}

fun Perulangan() {
    println()
    println("=== Perulangan ===")

    for (i in 1..5){
        println(" Perulangan ke $i")
    }

    val cars = listOf("BMW", "Toyota", "Honda", "Audi")
    for (car in cars){
        println("cars type: $car")
    }

    var x = 1
    while (x <= 5){
        println("Perulangan $x")
        x++
    }

    var y = 1
    do{
        println("perulangan ke$y")
        y++
    }while (y <= 5)
}

fun main (){
    ConditionalStatement()
    Perulangan()
}