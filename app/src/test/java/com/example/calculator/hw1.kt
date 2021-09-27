package com.example.calculator

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("")
    val n = scanner.nextInt()
    var sum = 0
    for (i in 1..n) {
        sum += scanner.nextInt()
    }
    println(sum)
}