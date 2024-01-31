package com.aarenas.androidmaster.sintaxys

fun main() {
    mutableList()
}

fun mutableList() {
    var weekDays: MutableList<String> =
        mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    weekDays.add(1, "alejoDay")

    //println(weekDays)
//remover atributos de un array
    weekDays.remove("alejoDay")
    //Validar si esta vacia
    if (weekDays.isEmpty()) {
        println("por ahora la lista esta vacia")
    } else {
        weekDays.forEach { println(it) }
    }
}

fun inmutableList() {
    val readOnly: List<String> =
        listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    //filter
    val example = readOnly.filter { it.contains("a") }

    //println(example)

    //forEach
    //readOnly.forEach {weekDay -> println(weekDay)}
}