package net.rossmanges.codewars

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class SpreadsheetTest : StringSpec({
    val classUnderTest = Spreadsheets()

    "single letter tests" {
        classUnderTest.spreadsheet("A1").shouldBe("R1C1")
        classUnderTest.spreadsheet("D5").shouldBe("R5C4")
    }
    "basic double letter test" {
        classUnderTest.spreadsheet("AA3").shouldBe("R3C27")
    }
    "more double letter tests" {
        classUnderTest.spreadsheet("AZ3").shouldBe("R3C52")
        classUnderTest.spreadsheet("BK31").shouldBe("R31C63")
        classUnderTest.spreadsheet("BZ31").shouldBe("R31C78")
    }
    "triple letter tests" {
        classUnderTest.spreadsheet("AAA1").shouldBe("R1C703")
    }

    "given 1 should be A" {
        classUnderTest.getColLetters(1).shouldBe("A")
    }
    "given 26 should be Z" {
        classUnderTest.getColLetters(26).shouldBe("Z")
    }
    "given 27 should be AA" {
        classUnderTest.getColLetters(27).shouldBe("AA")
    }
    "given 52 should be AZ" {
        classUnderTest.getColLetters(52).shouldBe("AZ")
    }
    "given 63 should be BK" {
        classUnderTest.getColLetters(63).shouldBe("BK")
    }
    "given 78 should be BZ" {
        classUnderTest.getColLetters(78).shouldBe("BZ")
    }
    "given R1C1 should be A1" {
        classUnderTest.spreadsheet("R1C1").shouldBe("A1")
    }
    "given R5C4 should be D5" {
        classUnderTest.spreadsheet("R5C4").shouldBe("D5")
    }
    "given R31C78 should be BZ31" {
        classUnderTest.spreadsheet("R31C78").shouldBe("BZ31")
    }

    "given R65535C65535 should be ?" {
        classUnderTest.spreadsheet("R6553C6553").shouldBe("BZ31")
    }
})