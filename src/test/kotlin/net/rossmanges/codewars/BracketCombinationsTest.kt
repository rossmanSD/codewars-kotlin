package net.rossmanges.codewars

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class BracketCombinationsTest : StringSpec({
    val classUnderTest = BracketCombinations()
    "basic tests" {
        classUnderTest.bracketCombinations(0) shouldBe 1
        classUnderTest.bracketCombinations(1) shouldBe 1
        classUnderTest.bracketCombinations(2) shouldBe 2
        classUnderTest.bracketCombinations(3) shouldBe 5
        classUnderTest.bracketCombinations(4) shouldBe 14
        classUnderTest.bracketCombinations(40) shouldBe 1945953300

    }
})