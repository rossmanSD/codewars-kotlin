package net.rossmanges.codewars

import io.kotest.core.spec.style.StringSpec
import io.kotest.data.forAll
import io.kotest.data.headers
import io.kotest.data.row
import io.kotest.data.table
import io.kotest.matchers.shouldBe

class PopulationGrowthTest : StringSpec({
    val pg = PopulationGrowth()
    "table of inputs" {
        table(
            headers("p0", "growth", "aug", "goal", "expected years"),
            row(1500, 5.0, 100, 5000, 15),
            row(1500000, 2.5, 10000, 2000000, 10),
            row(1500000, 0.0, 10000, 2000000, 50),
            row(1500000, null, 10000, 2000000, 50)
        ).forAll { p0: Int, growth: Double?, aug: Int, goal: Int, expectedYears: Int ->
            pg.idiomaticNbYear(p0, growth, aug, goal) shouldBe expectedYears
            pg.nbYear(p0, growth, aug, goal) shouldBe expectedYears
        }
    }
})