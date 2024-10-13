package com.example.basickotlin

import android.provider.ContactsContract.CommonDataKinds.Email

data class DataClass (
    val id: Int,
    var email: String,
    var age: Int
)

fun main (){
    val data = DataClass (1, "imampermana243@gmail.com", 40)
    println(data)

    //fungsi equals
    val data2 = DataClass (1, "imampermana224@gmail.com", 20)
    println(data == data2)// false

    //fungsi copy
    val data4 = data.copy()
    println(data4)

    //fungsi copy dengan perubahan
    val data3 = data.copy (email = "imampermana")
    println(data3)
}