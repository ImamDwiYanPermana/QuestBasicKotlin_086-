package com.example.basickotlin

import android.provider.ContactsContract.CommonDataKinds.Email

class Motor (val nomorMesin: Int, var nama: String)
class Contact(val id: Int, var email: String)

fun main(){
    val contact = Contact(1, "@imampermana244@gmail.com")
    println(contact.email)

    contact.email= "@agus@gmail.com"
    println(contact.email)

    val motor = Motor(12, "Imam Permana")
    println(motor.nama)

    motor.nama= "@agus@gmail.com"
    println(motor.nama)
}