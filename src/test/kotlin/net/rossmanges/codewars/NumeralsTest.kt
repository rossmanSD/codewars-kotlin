package net.rossmanges.codewars

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class NumeralsTest : StringSpec({
    val classUnderTest = Numerals()
        "IIIshouldBe3" {
            classUnderTest.romanToInt("III") shouldBe 3
        }
        "LVIIIshouldBe58" {
            classUnderTest.romanToInt("LVIII")
        }
        "MCMXCIVshouldBe1994" {
            classUnderTest.romanToInt("MCMXCIV")
        }
})