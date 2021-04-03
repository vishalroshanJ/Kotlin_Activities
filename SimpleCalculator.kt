package com.ltts.mykotlinactivities

import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter First number: ")
    val a = reader.nextDouble()
    print("Enter Second number: ")
    val b = reader.nextDouble()
    print("Enter an operator(+, -, *, /): ")
    val operator = reader.next()[0]
    val c: Double
    when (operator) {
        '+' -> c= a + b
        '-' -> c = a - b
        '*' -> c = a * b
        '/' -> c = a/ b
        else -> {
            System.out.printf("Error! operator is not correct")
            return
        }
    }
    System.out.printf("%.1f %c %.1f = %.1f", a, operator, b,c)
}