package net.rossmanges.codewars

class CountTheDigit {
    fun nbDig(n: Int, d: Int) = (0..n)
        .fold(0) { sum, element ->
            sum + (element * element).toString().count { c ->
                c in d.toString()
            }
        }
}