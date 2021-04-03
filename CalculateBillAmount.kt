package com.ltts.mykotlinactivities

import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter Quantity: ")
    val a = reader.nextDouble()
    print("Enter Unit Price: ")
    val b = reader.nextDouble()
    var amount=a*b
    val discount=amount*0.15;
   println("Discount =$discount \nFinal Bill Amount=${amount - discount}Rupees")
}