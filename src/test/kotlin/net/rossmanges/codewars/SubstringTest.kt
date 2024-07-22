package net.rossmanges.codewars

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class SubstringTest : StringSpec({
    val classUnderTest = Substring()
    "first test" {
        classUnderTest.plagiarismTest(
            "I'm a cat that likes to sit on a wood table",
            "I like to sit on a wood table because I'm a cat"
        ) shouldBe true
    }
})