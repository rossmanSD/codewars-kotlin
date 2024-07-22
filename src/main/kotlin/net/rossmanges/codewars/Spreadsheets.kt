package net.rossmanges.codewars

class Spreadsheets {
    val range = ('A'..'Z')
    fun spreadsheet(s: String) = if (isSpreadsheetInput(s))
        calcValueFromRowCol(s)
        else calcValueFromSpreadsheet(s)

    /**
     * Given a spreadsheet coordinate like "A1" turn row-col
     * coordinates like "R1C1"
     */
    fun calcValueFromSpreadsheet(s: String): String {
        val colIndex = getColIndex(parseColumnLetter(s))
        val rowNumber = parseNumber(s)
        return "R${rowNumber}C${colIndex}"
    }

    /**
     * Given a row-col coordinate like "R1C1" return
     * a spreadsheet coordinate like "A1"
     */
    fun calcValueFromRowCol(s: String): String {
        val rowNum = parseRowNumber(s)
        val colLetters = getColLetters(parseColNumber(s))
        return "$colLetters$rowNum"
    }

    /**
     * Returns a column number given a string representing the column letters.
     * For example:
     * A = 1
     * Z = 26
     * AA = (1 * 26) + 1  = 27
     * AZ = (1 * 26) + 25 = 52
     * BK = (2 * 26) + 11 = 63
     * BZ = (2 * 26) + 26 = 78
     */
    private fun getColIndex(letter: String): Int {
        val letterValue = range.indexOf(letter[0]) + 1
        return if (letter.length == 1) {
            letterValue
        } else {
            (letterValue * 26) + getColIndex(letter.drop(1))
        }
    }

    /**
     * Returns a column letter given a number representing the column number.
     * For example:
     * 1 = A
     * 26 = Z
     * 27 = (27 - 26) = AA
     * 52 = (52 - 26) = 26 = AZ
     * 63 = (63 - 26) = (37 - 26) = 11 = BK
     * 78 = (78 - 26) = (52 - 26) = 26 = BZ
     */
    fun getColLetters(number: Int, count: Int = 0): String {
        val newCount = count + 1
        return if (number <= 26) {
            range.toList()[number-1].toString()
        } else {
            val reduced = number - 26
            if (reduced <= 26) {
                range.toList()[newCount - 1].toString() + getColLetters(reduced, newCount)
            } else {
                getColLetters(reduced, newCount)
            }
        }
    }

    private fun parseColumnLetter(s: String): String {
        var letter = ""
            for (c in s) {
            if (c.isLetter()) letter += c
                else break
        }
        return letter
    }

    private fun parseNumber(s: String): Int {
        var numberString = ""
        for (c in s) {
            if (c.isDigit()) numberString += c
        }
        return numberString.toInt()
    }

    private fun parseRowNumber(s: String): Int {
        return s.split("C")[0].split("R")[1].toInt()
    }

    private fun parseColNumber(s: String): Int {
        return s.split("C")[1].toInt()
    }

    private fun isSpreadsheetInput(s: String): Boolean {
        return Regex("R(\\d+)C(\\d+)").find(s) != null
    }
}