package com.ltts.mykotlinactivities

import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter First Sudject Marks Out Of 50: ")
    val a = reader.nextDouble()
    print("Enter Second Sudject Marks Out Of 50: ")
    val b = reader.nextDouble()
    print("Enter Thrid Sudject Marks Out Of 50: ")
    val c = reader.nextDouble()
    println("The Total Marks=${a + b + c} and Percentage ${((a + b + c) / 150) * 100}%")
}