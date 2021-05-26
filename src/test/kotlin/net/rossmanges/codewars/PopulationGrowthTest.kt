package net.rossmanges.codewars

import io.kotest.core.spec.style.StringSpec
import io.kotest.inspectors.forExactly
import io.kotest.matchers.shouldBe

class PopulationGrowthTest : StringSpec({
    val pg = PopulationGrowth()
    "fixed tests" {
        pg.nbYear(1500, 5.0, 100, 5000) shouldBe 15
        pg.nbYear(1500000, 2.5, 10000, 2000000) shouldBe 10
    }

    "null and zero growthPct tests" {
        val inputs = listOf(0.0, null)
        inputs.forEach {
            pg.nbYear(1500000, it, 10000, 2000000) shouldBe 50
        }
    }
})