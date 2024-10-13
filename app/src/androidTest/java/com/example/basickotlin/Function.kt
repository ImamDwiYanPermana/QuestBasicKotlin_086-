package com.example.basickotlin

import android.app.backup.BackupAgent

fun whithoutParameter(){
    println()
    println("== whithoutParameter ==")
    println("Hello WOrd")
}

fun whithParameter(name: String){
    println()
    println("== whithParameter ==")
    println("Hello, $name")
}

fun withNamedArgument(name: String, age: Int){
    println()
    println("== whitNamedArgument ==")
    println("Hello, $name! you are $age years old")
}

fun whithDefaultParameter(name: String = "Indra", age: Int){
    println()
    println("Hello, $name! you are $age years old")
}

fun whithReturn(panjang: Int, lebar: Int){
    println()
   return println(panjang * lebar)
}


fun main(){
    whithoutParameter()
    whithParameter(name = "imam")
    withNamedArgument(name = "aldi", age = 7)
    whithDefaultParameter(age = 40)
    //whithReturn(panjang = 6, lebar = 10)
}