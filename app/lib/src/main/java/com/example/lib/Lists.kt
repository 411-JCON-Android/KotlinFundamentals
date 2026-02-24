package com.example.lib

fun main(){
    // T es para tipos genericos

    // las listOf son de tamaño fijo
    val numbers = listOf<Int>(68,56,17,28,94,58,73)

    // esta si es dinámica
    val dynamicNumbers = mutableListOf(68,56,17,28,94,58,73)
    dynamicNumbers.add(23)

    // para sacar el número mayor
    var maxNumber = numbers[0]

    for(i in numbers){
        if(i > maxNumber){
            maxNumber = i
        }
    }

    println("El número más grande es: $maxNumber")



}