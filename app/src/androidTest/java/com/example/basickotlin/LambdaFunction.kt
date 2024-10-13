package com.example.basickotlin

// Lambda FUnctions
// Lambda FUnctions adalah fungsi yang tidak memiliki nama
// Lambda FUngtion biasanya digunakan untuk membuat fungsi yang sederhana
// Lambda functions menggunkan tanda panah (->) untuk memisahkan parameter dan body fungsi

fun uppercaseString(string: String): String{
    return string.uppercase()
}

fun main(){
    uppercaseString("hello")
    println({string: String-> string.uppercase()}("hello"))
}
