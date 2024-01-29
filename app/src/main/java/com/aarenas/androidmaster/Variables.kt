package com.aarenas.androidmaster

val edad:Int = 2
val edad2:Int = 3

fun main (){

    showMyName("Alejandro", 22)
    val result = substract(12,5)

    println(result)


}

//Funcion con parametros de entrada
fun showMyName(name:String, age:Int){
    println("Hola soy $name, y tengo $age años")
}


//Funciones con parametros de salida
fun substract(number1: Int, number2:Int):Int{
    //Los dos puntos se especifica que tipo va devolver. Solo debe devolver UNA SOLA COSA
    return  number1 - number2

}


//Funciones basicas
fun variablesAlfanumericas(){
    // Int  -2,147,483,647 a 2,147,483,647
    val age:Int = 40

    //Long -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807
    val example:Long = 45

    //Float soporta hasta 6 decimales
    val floatExample: Float = 30.5444f

    //Double soporta hasta 14 decimales
    val doubleExample: Double = 77.77777777777

    //Variables alfanumericas


//char => solo soporta un caracter

    val charExample1:Char = 'd'
    val charExample2:Char = '2'
    val charExample3:Char = '@'





//String => debe llevar comillas dobles

    val stringExample = "Hola Alejandro"

}

fun variablesBooleanas(){
    //Boolean => True | False

    val booleanExample:Boolean = false


    println(booleanExample)
}

fun variablesNumericas (){


    println("Suma")
    println(edad + edad2)

    println("Resta")
    println(edad - edad2)

    println("Multiplicar")
    println(edad * edad2)

    println("Dividir")
    println(edad / edad2)

    println("Módulo")
    println(edad % edad2)


}

fun elseif(number: Int){
    if (number > 10){
        println("El numero es mayor que 10")
    } else {
        println("El numero es menor que 10")

    }
}


