package com.ltts.mykotlinactivities

import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter  Number: ")
    val a = reader.nextInt()
    var fac  = 1
    var factorial: (Int) -> Unit ={ a:Int -> for(i in 1..a) { fac *= i } }
    factorial(a)
    print(fac)
 }