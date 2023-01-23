package com.playground

import org.junit.Test

class ReverseIntTest {
    private val reverseInt = ReverseInt()

    @Test
    fun zeroInputReversedToZero() {
        val input = 0
        val expectation = 0

        assert(reverseInt.reverse(input) == expectation)
    }

    @Test
    fun singleDigitNumberReverseIsEqualToInput() {
        val input = 7
        val expectation = 7

        assert(reverseInt.reverse(input) == expectation)
    }

    @Test
    fun twoDifferentDigitsReversedCorrectly() {
        val input = 12
        val expectation = 21

        assert(reverseInt.reverse(input) == expectation)
    }

    @Test
    fun threeDifferentDigitsReversedCorrectly1() {
        val input = 123
        val expectation = 321

        assert(reverseInt.reverse(input) == expectation)
    }

    @Test
    fun threeDifferentDigitsReversedCorrectly2() {
        val input = 965
        val expectation = 569

        assert(reverseInt.reverse(input) == expectation)
    }

    @Test
    fun fourDifferentDigitsReversedCorrectly1() {
        val input = 1234
        val expectation = 4321

        assert(reverseInt.reverse(input) == expectation)
    }

    @Test
    fun fourDifferentDigitsReversedCorrectly2() {
        val input = 2266
        val expectation = 6622

        assert(reverseInt.reverse(input) == expectation)
    }

    @Test
    fun sameDigitsNumberReturnsItself() {
        val input = 1111
        val expectation = 1111

        assert(reverseInt.reverse(input) == expectation)
    }
}