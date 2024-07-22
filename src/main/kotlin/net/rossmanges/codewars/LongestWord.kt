package net.rossmanges.codewars

class LongestWord {
    fun longestWord(words: Array<String>): String {
        var candidate = ""
        words.forEach { w ->
            if(canBeBuiltFrom(w, words)) {
                if (w.length > candidate.length) candidate = w
                if (w.length == candidate.length && w < candidate) candidate = w
            }
        }
        return candidate
    }

    /**
     * returns true if the given word can be built from the list of words,
     * 1 character at a time.
     */
    private fun canBeBuiltFrom(word: String, parts: Array<String>) : Boolean {
        if (parts.isEmpty()) {
            return false
        }
        var currentPart = ""
        word.forEach { c ->
            currentPart += c.toString()
            if (!parts.contains(currentPart)) {
                return false
            }
        }
        return true
    }
}