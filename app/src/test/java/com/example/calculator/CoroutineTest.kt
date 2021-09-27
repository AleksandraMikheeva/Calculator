//package com.example.calculator
//
//import kotlinx.coroutines.delay
//import kotlinx.coroutines.launch
//import kotlinx.coroutines.runBlocking
//import kotlin.system.measureTimeMillis
//import kotlin.time.measureTime
//
//fun main() {
//    val time = measu
//    runBlocking {
//        launch {
//            timer(1000)
//        }
//        println("$time")
//    }
//}
//
//private suspend fun timer(time: Long) {
//    runBlocking {
//        launch{
//            delay(time)
//
//        }
//        launch {
//            delay(2000L)
//            println(measureTimeMillis { 100 })
//        }
//        launch {
//            delay(10_000)
//            println(measureTimeMillis { 1000 })
//        }
//       println(measureTimeMillis { 1000 })
//    }
//}
//
//private fun CoroutineScope.dalay(l: Long) {
//
//}
