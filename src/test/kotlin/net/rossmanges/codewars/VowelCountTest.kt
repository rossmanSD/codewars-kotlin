package net.rossmanges.codewars

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class VowelCountTest : StringSpec ({
    "fixed tests" {
        val vc = VowelCount()
        vc.getCount("abcdef") shouldBe 2
        vc.getCount("abracadabra") shouldBe 5
    }
})