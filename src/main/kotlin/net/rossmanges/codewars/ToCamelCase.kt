package net.rossmanges.codewars

class ToCamelCase {
    fun toCamelCase(str: String): String {
        val words = str.split(Regex("-|_"))

        val camelCaseWords = mutableListOf<String>()
        words.forEachIndexed { idx, value ->
            if (idx == 0)
                camelCaseWords += value
            else
                camelCaseWords += value[0].uppercase() + value.drop(1)
        }
        return camelCaseWords.joinToString(separator = "")
    }
}