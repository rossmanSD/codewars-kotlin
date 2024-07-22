package net.rossmanges.codewars

class Stack {
    fun bracketMatcher(str: String): String {
        val stack = mutableListOf<Char>()
        val openToCloseMap = mutableMapOf(
            '}' to '{', ']' to '[', ')' to '('
        )

        str.forEach { c ->
            when (c) {
                '{', '[', '(' -> stack.add(c)
                '}', ']', ')' -> {
                    if (stack.isEmpty()) return "0"
                    val elem = stack.removeLastOrNull()
                    if (elem != openToCloseMap[c]) return "0"
                }
                else -> { /* ignore */ }
            }
        }

        return if (stack.isEmpty()) "1" else "0"
    }
}