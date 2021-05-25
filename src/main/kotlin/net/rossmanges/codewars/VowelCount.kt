package net.rossmanges.codewars

class VowelCount {
    fun getCount(str : String) : Int {
        val vowels = "aeiou"
        return str.filter { it in vowels }.count()
    }
}