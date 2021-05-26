package net.rossmanges.codewars

class PrinterError {
    /**
     * returns number of errors over length of string.
     */
    fun printerError(s: String): String {
        val errorCount = s.count { it > 'm' }
        return "$errorCount/${s.length}"
    }
}