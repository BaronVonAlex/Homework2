package com.example.davaleba2

import java.sql.DriverManager.println

class Car
{
    var model = ""
    var color = ""
    var engine = ""

    override fun toString(): String
    {
        return "$engine, $color, $model"
    }

    override fun equals(other: Any?): Boolean
    {
        if (other is Car){
            if (engine == other.engine){
                return true
            }
        }
        return false
    }

    fun printModel()
    {
        println(model)
    }

}

fun main()
{
    var car1 = Car()
    car1.model = "Nissan"
    car1.color = "White"
    car1.engine = "2.4"
    println(car1)

    var car2 = Car()
    car2.model = "Toyota"
    car2.color = "Red"
    car2.engine = "3.4"
    println(car2)
    println(car1 == car2)
}
