package com.example.calculator

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MathTest {

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun increment_isCorrect() {
        assertEquals(3, 2 + 1)
    }

    @Test
    fun dividing_isCorrect() {
        assertEquals(2, 4 / 2)
    }
}