package net.rossmanges.codewars

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ToCamelCaseTest : StringSpec({
    val classUnderTest = ToCamelCase()
    "empty input" {
        classUnderTest.toCamelCase("") shouldBe ""
    }
    "fixed tests" {
        classUnderTest.toCamelCase("the_stealth_warrior") shouldBe "theStealthWarrior"
    }
    "fixed tests 2" {
        classUnderTest.toCamelCase("the_stealth_warrior") shouldBe "theStealthWarrior"
    }
    "fixed tests 3" {
        classUnderTest.toCamelCase("The-Stealth-Warrior") shouldBe "TheStealthWarrior"
    }
})