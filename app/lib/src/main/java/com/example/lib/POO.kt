package com.example.lib

// POO - A PIE (Abstraction, Polimorphism, Inheritance, Encapsulation)


// clase normal
class Person(val name : String, val age : Int){

    fun sayHello(){
        println("Hola soy $name y tengo $age años")
    }

}

// clase abstrata - que no puede instanciar objeto
abstract class Shape{
    abstract fun calculateArea() : Double
}

// clase que hereda de Shape
class Circle(val radius : Double) : Shape(){
    override fun calculateArea(): Double {
        return radius * radius * Math.PI
    }
}

// otra clase de figura para polimorfismo
class Square(val side : Double) : Shape(){
    override fun calculateArea(): Double {
        return side * side
    }
}

// interfaz - un contrato que obliga a otras clases a seguirlo
interface Ave{
    fun fly()
    fun poop()
    fun peep()
}

// una clase que usa la interfaz
class Eagle : Ave {
    override fun fly() {
        TODO("Not yet implemented")
    }

    override fun poop() {
        TODO("Not yet implemented")
    }

    override fun peep() {
        TODO("Not yet implemented")
    }

}

// clase open - otra clases pueden heredar de aquí
open class Animal(val name: String){
    open fun makeSound(){
        println("$name esta haciendo un sonido")
    }
}

// clase que hereda de otra clase
class Dog : Animal(name = "Bonnie"){

}

// otra clase que hereda de otra clase
class Cat (val catName : String) : Animal(name = catName){
    fun trepar(stairs:Int, place:String){
        println("$name trepo $stairs escalones")
    }
}

fun main(){
    val persona1 = Person("Javier", 25)
    val persona2 = Person("Pedro", 22)
    persona1.sayHello()
    persona2.sayHello()
    println("El nombre de la persona 1 es ${persona1.name}")

    val square1 = Square(side = 34.5)
    val square2 = Square(side = 12.3)
    val circle = Circle(radius = 10.0)
    val shapes = listOf(square2, square1, circle)
    for (shape in shapes){
        println(shape.calculateArea())
    }

    val cat = Cat("Coco")
    cat.trepar(10, "LaSalle")
}