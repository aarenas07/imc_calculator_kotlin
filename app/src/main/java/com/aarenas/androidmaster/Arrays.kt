package com.aarenas.androidmaster

fun main(){
    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    //println(weekDays[3])

    //Bucles en Array

    //posicion
    for (position in weekDays.indices){
        //println("He pasado por aqui $position")
    }
//posicion y valor
    for((position, value) in weekDays.withIndex()){
        println("La posicion $position, contiene $value")
    }

    //solo valor
    for (weekDay in weekDays){
        println("Ahora es $weekDay")
    }
}