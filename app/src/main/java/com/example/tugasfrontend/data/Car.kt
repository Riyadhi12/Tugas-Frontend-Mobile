package com.example.tugasfrontend.data

data class Car(
    val id : Int,
    val title : String,
    val description : String,
    val carImage : Int = 0
)

data class Motor(
    val id : Int,
    val title : String,
    val description : String,
    val motorImage : Int = 0
)


data class Kapal(
    val id : Int,
    val title : String,
    val description : String,
    val kapalImage : Int = 0
)