package com.ltts.mykotlinactivities

import java.util.*

fun main(args:Array<String>)
{  val reader = Scanner(System.`in`)
    print("Enter Radius: ")
    val radius = reader.nextInt()
    val  Area = 3.14 * radius * radius
    val  Circumference = 2 * 3.14 * radius
    val  Length = Circumference/4
    println("Calculated Area = $Area \nCalculated Circumference= $Circumference \n" +
            "Calculated Length =$Length")
}