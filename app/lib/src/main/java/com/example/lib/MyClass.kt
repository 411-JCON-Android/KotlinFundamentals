package com.example.lib


fun main() {

//    // 1.
//    val price : Double = 150.0
//    val percentage : Double = 0.10
//    val tip : Double = price * percentage
//    val total : Double = price + tip
//    println("El costo de la comida es: $$total")
//
//     // 2.
//    println("Pon una edad: ")
//    val input = readlnOrNull()
//    val age = input?.toInt()
//
//    if (age == null){
//        println("El número que pusiste no es un número entero")
//    } else if (age > 17){
//        println("Eres mayor de edad, puedes pasar")
//    } else {
//        println("No puedes pasar")
//    }
//
//    when(age){
//        null -> println("El número que pusiste no es un número entero")
//        in 18..125 ->  println("Eres mayor de edad, puedes pasar")
//        in 0..17 -> println("Eres muy pequeño, no puedes pasar")
//        else -> println("Ingresa una edad real, no puedes pasar")
//    }
//
//    // 3. for
//    for(i in 1..10){
//        println(i)
//    }
//    for(i in 100 downTo 0 step 10){
//        println(i)
//    }
//
//    // 4. while
//    var counter : Int = 12
//    while(counter < 20){
//        println("El contador es menor a 20")
//        println("counter")
//        counter++
//    }

    // 5. ejemplo

    // pedir número
    var num : Int = 0
    var respuesta : String = ""

    println("Ingresa un numero: ")
    val input = readln().toIntOrNull()
    if (input == null){
        respuesta = "Ingresa un numero valido"
    } else {
        num = input

        // validaciones iniciales
        if (num == 2) {
            respuesta = "Si es un primo"
        } else if (num < 2 || num % 2 == 0) {
            respuesta = "No es un primo"
        } else {
            var i = 3
            var esPrimo = true
            while (i * i <= num) {
                if (num % i == 0) {
                    respuesta = "No es un primo"
                    esPrimo = false
                    break
                }
                i += 2
            }
            if (esPrimo) {
                respuesta = "Si es un primo"
            }
        }
    }
    println(respuesta)

}
// cambio para git
// cambio 2 para git
