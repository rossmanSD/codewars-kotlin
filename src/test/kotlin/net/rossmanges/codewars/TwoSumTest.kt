package net.rossmanges.codewars

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class TwoSumTest : StringSpec ({
    val classUnderTest = TwoSum()
    "first test" {
        classUnderTest.two_sum(intArrayOf(1,2,3), 4) shouldBe
                Pair(0, 2)
        classUnderTest.two_sum(intArrayOf(1234,5678,9012), 14690) shouldBe
                Pair(1, 2)
        classUnderTest.two_sum(intArrayOf(2,2,3), 4) shouldBe
                Pair(0, 1)
    }
})