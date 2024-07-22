package net.rossmanges.codewars

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class BoxesInTruckTest : StringSpec({
    val classUnderTest = BoxesInTruck()

    "first test" {
        classUnderTest.getMaxUnits(
            numBoxes = listOf(1, 2, 3),
            unitsPerBox = listOf(3, 2, 1),
            truckSize = 3
        ) shouldBe 7
    }
    "second test" {
        classUnderTest.getMaxUnits(
            numBoxes = listOf(3, 1, 6),
            unitsPerBox = listOf(2, 7, 4),
            truckSize = 6
        ) shouldBe 27
    }
})