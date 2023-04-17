package net.rossmanges.codewars

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MostFrequentlyUsedWordsTest : StringSpec({
    val classUnderTest = MostFrequentlyUsedWords()

    "fixed tests" {
        classUnderTest.top3("a a a  b  c c  d d d d  e e e e e") shouldBe listOf("e", "d", "a")
        classUnderTest.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e") shouldBe
                listOf("e", "ddd", "aa")
    }

    "punctuation fixed test" {
        classUnderTest.top3("  //wont won't won't ") shouldBe listOf("won't", "wont")
        classUnderTest.top3("  , e   .. ") shouldBe listOf("e")
    }
    "empty fixed test" {
        classUnderTest.top3("  ...  ") shouldBe emptyList()
        classUnderTest.top3("  '  ") shouldBe emptyList()
        classUnderTest.top3("  '''  ") shouldBe emptyList()
    }
})