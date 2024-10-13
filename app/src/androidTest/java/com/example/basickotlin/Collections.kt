package com.example.basickotlin

import android.graphics.drawable.shapes.Shape
import android.hardware.camera2.CameraExtensionSession.StillCaptureLatency

//list adalah kumpulan data yang disusun secara berurutan dari
//list  bersifat  ordered, artinya  data yang rasukan akan memiliki posisi sesuai urutan

fun ContohList() {
 println()
 println("==== List ====")

   //List Read-Only
 val readOnlyAbjad = listOf("A", "B", "C")
 println(readOnlyAbjad)

    //List Mutable
 val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
 println(shape)

    //Menambahkan data ke dalam Mutable
 shape.add("Circle")
 println(shape)

    //Menghapus Data dari List Mutable
 shape.remove("Triangle")
 println(shape)

    //Mengubah  Data di dalam List Mutable
 shape[0] = "Oval"
 println(shape)

    //List Read-Only
 val shapeLocked: List<String> = shape
 println(shapeLocked)
}

// Set adalah Kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya menyimpan data unik (ridak ada duplikasi)
// Set bersifat unordere, artinya data yang dimasukkan tidak memiliki posisi tertentu
// Set Bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat di ubah
// set Read-Only menggunakan setOf
// Set Mutable menggunakan mutableSetOf

fun ContohSet() {
 println()
 println("==== Set ====")

 // Set Read-Only
 val readOnlyAbjad: Set<String> = setOf("A", "B", "C")
 println(readOnlyAbjad)

 //Set Mutable
 val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
 println(shape)

 //Menambahkan
 shape.add("Circle")
 println(shape)

 //Menghapus
 shape.remove("Circle")
 println(shape)

 // Set Read-Only
 val shapeLock: Set<String> = shape
 println(shapeLock)

}



//map adalah kumpulan data yang disusun dalam pasangan key-value
//map bersifat undereted, artinya data yang dimasukan tidak memiliki posisi tertentu
//map bersifat nutable dan read only, artinya data yang dimasukan dapat disimpan dan tidak dapat diubah
//map mutable menggunakan

fun ContohMap(){
 println()
 println("==== Map ====")
 //map read-Only
 val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
 println(readOnlyShape)

 //map Mutable
 val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
 println(shape)

 //menambahkan data kedalam map mutable
 shape["Rectangle"] = 4
 println(shape)

 shape.remove("Cricle")
 println(shape)

 shape["Square"] = 5
 println(shape)

 val shapesLocked: Map<String, Int> = shape
 println(shapesLocked)
}



fun main(){
 ContohList()
 ContohMap()
 ContohSet()
}