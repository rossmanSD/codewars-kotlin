package net.rossmanges.codewars

class Numerals {
    fun romanToInt(s: String): Int {
        return getIntValueOfSpecialCases(s, specialCaseMap)
    }

    private fun getIntValueOfSpecialCases(inputNumerals: String, specialCaseMap: Map<Char, List<Char>>): Int {
        // first, process and remove all of the "special cases" that may exist
        var result = Pair(0, inputNumerals)
        specialCaseMap.forEach { (n, specialCharList) ->
            result = getIntValueOfSpecialCase(result, n, specialCharList)
        }

        // take remaining characters in the string and sum their int values,
        // and add to the result of the special cases to get the final answer.
        val finalResult = result.second.map {
            getIntValue(it)
        }.sum() + result.first
        return finalResult
    }

    private fun getIntValueOfSpecialCase(
        memo: Pair<Int, String>,
        canBeSubtractedBy: Char,
        specialCases: List<Char>
    ): Pair<Int, String> {
        var valueOfSpecialCase = memo.first
        val numerals = memo.second
        var remainingNumerals = ""
        for (i in numerals.indices) {
            remainingNumerals += numerals[i]
            if (specialCases.contains(numerals[i])) {
                if (i > 0) {
                    val preceding = numerals[i - 1]
                    if (preceding == canBeSubtractedBy) {
                        valueOfSpecialCase += getIntValue(numerals[i]) - getIntValue(canBeSubtractedBy)
                        remainingNumerals = remainingNumerals.dropLast(2)
                    }
                }
            }
        }
        return Pair(valueOfSpecialCase, remainingNumerals)
    }

    private fun getIntValue(c: Char): Int = when (c) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> 0
    }

    private val specialCaseMap = mapOf(
        // I can be placed before V (5) and X (10) to make 4 and 9.
        'I' to listOf('V', 'X'),
        // X can be placed before L (50) and C (100) to make 40 and 90.
        'X' to listOf('L', 'C'),
        // C can be placed before D (500) and M (1000) to make 400 and 900.
        'C' to listOf('D', 'M')
    )
}