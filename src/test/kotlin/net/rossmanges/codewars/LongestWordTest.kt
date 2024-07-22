package net.rossmanges.codewars

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class LongestWordTest : StringSpec( {
    val classUnderTest = LongestWord()
    "test 1" {
        classUnderTest.longestWord(arrayOf(
            "w","wo","wor","worl","world"
        )) shouldBe "world"
    }
    "test 2" {
        classUnderTest.longestWord(arrayOf(
            "a","banana","app","appl","ap","apply","apple"
        )) shouldBe "apple"
    }
})