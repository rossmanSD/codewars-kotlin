package net.rossmanges.codewars

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class FizzBuzzTest2 : StringSpec({
    val fb = FizzBuzz2()
    "one number" {
        fb.fizzBuzz(1) shouldBe arrayOf("1")
    }

    "ten numbers" {
        val expected = arrayOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz")
        fb.fizzBuzz(10) shouldBe expected
    }
})