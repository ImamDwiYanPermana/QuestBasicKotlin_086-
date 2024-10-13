package com.example.basickotlin

import kotlin.contracts.ReturnsNotNull

fun nullSafty(){
    var neverNull: String = "This can't be null"
    // Throws a compiler error
    // nebverNull = Null

    //nullable has nullable String type
    var nullable: String? = "You can keep a null here"
    // This oke
    nullable = null

    // check for null in conditions
    if (neverNull == null){
        println("inferredNonNull is null")
    } else {
        println("inferredNonNull is not null")
    }

    println(neverNull.length) // 18
    println(nullable?.length) // null
    fun strlength(notNull: String): Int{
        return notNull.length
    }
    println(strlength(neverNull))
}



fun main(){
    nullSafty()
}

