package net.rossmanges.codewars

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class CountTheDigitTest : StringSpec ({
    "fixed tests" {
        val ctd = CountTheDigit()
        ctd.nbDig(5750, 0) shouldBe 4700
        ctd.nbDig(11011, 2) shouldBe 9481
    }
})