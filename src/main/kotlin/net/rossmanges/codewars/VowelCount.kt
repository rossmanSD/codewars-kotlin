package net.rossmanges.codewars

class VowelCount {
    fun getCount(str : String) : Int {
        val vowels = "aeiou"
        return str.count { it in vowels }
    }
}