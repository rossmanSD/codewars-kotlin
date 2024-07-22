package net.rossmanges.codewars

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class StackTest : StringSpec({
    val classUnderTest = Stack()

    "first test" {
        classUnderTest.bracketMatcher("(coder)(byte))") shouldBe "0"
    }
    "second test" {
        classUnderTest.bracketMatcher("(c(oder)) b(yte)") shouldBe "1"
    }
    "third test" {
        classUnderTest.bracketMatcher("hello()") shouldBe "1"
    }
    "valid parentheses" {
        classUnderTest.bracketMatcher("()") shouldBe "1"
        classUnderTest.bracketMatcher(")(()))") shouldBe "0"
        classUnderTest.bracketMatcher("(") shouldBe "0"
        classUnderTest.bracketMatcher("(())((()())())") shouldBe "1"
    }
    "other kinds of brackets" {
        classUnderTest.bracketMatcher("{{()()}}") shouldBe "1"
        classUnderTest.bracketMatcher("{{()()}()}") shouldBe "1"
    }
})