package com.example.calculator

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

abstract class Figure() {
    abstract fun square(): Float
    abstract fun perimeter(): Float
}

class Triangle(private val a: Float, private val b: Float, private val c: Float) : Figure() {
    override fun square(): Float {
        var halfPerimeter: Float = 0.5f * (a + b + c)
        return sqrt(
            halfPerimeter * (halfPerimeter - a) *
                    (halfPerimeter - b) * (halfPerimeter - c)
        ).toFloat()
    }

    override fun perimeter(): Float = a + b + c
}

open class Rectangle(private val a: Float, private val b: Float) : Figure() {
    override fun square(): Float = a * b
    override fun perimeter(): Float = 2 * (a + b)
}

class Square(private val d: Float) : Rectangle(d, d) {
}

class Circle(private val r: Float) : Figure() {
    override fun square(): Float = (PI * r.pow(2)).toFloat()
    override fun perimeter(): Float = (2 * PI * r).toFloat()
}

fun main() {
    val figures = listOf(
        Triangle(9f, 4f, 4f),
        Circle(3f),
        Rectangle(3f, 3f),
        Square(4f)
    )
    println("Сумма площадей = ${figures.map { it.square() }.sum()}.")
    println("Сумма периметров = ${figures.map { it.perimeter() }.sum()}.")
    println("Наибольший периметр имеет ${figures.maxByOrNull { it.perimeter() }}.")
    println("Наибольшую площадь имеет ${figures.maxByOrNull { it.square().toDouble() }}.")
}
