package net.rossmanges.codewars

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class FindIntersectionTest : StringSpec({
    val classUnderTest = FindIntersection()
    "first test" {
        classUnderTest.findIntersection(
            arrayOf("1, 3, 4, 7, 13", "1, 2, 4, 13, 15")
        ) shouldBe "1,4,13"
    }
    "second test" {
        classUnderTest.findIntersection(
            arrayOf("2, 3, 4", "3")
        ) shouldBe "3"
    }
    "third test" {
        classUnderTest.findIntersection(
            arrayOf("1, 2, 3, 4, 5", "6, 7, 8, 9, 10")
        ) shouldBe "false"
    }
})