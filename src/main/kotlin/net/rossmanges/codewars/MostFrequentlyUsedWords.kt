package net.rossmanges.codewars

class MostFrequentlyUsedWords {
    fun top3(s: String): List<String> {
        val allWords = s
            .filter { it.isLetter() || it == '\'' || it == ' ' }
            .trim().mySplit("\\s+".toRegex()).filter {
                word -> word.any { it.isLetter() }
            }
        val uniqueWords = allWords.distinct().map { it.lowercase() }

        val wordsByCount = mutableMapOf<String, Int>()

        uniqueWords.forEach { word ->
            wordsByCount[word] = allWords.count { it.lowercase() == word }
        }

        val mostFrequentlyUsedWords = wordsByCount.entries
            .sortedByDescending {
                it.value
            }
            .take(3)
            .map { it.key }

        return mostFrequentlyUsedWords
    }

    fun String.mySplit(separator: Regex) = split(separator)
        .takeIf { it.size > 1 || it[0].isNotEmpty() }
        ?: emptyList()
}