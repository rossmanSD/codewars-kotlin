package net.rossmanges.codewars

class FizzBuzz2 {
    fun fizzBuzz(n: Int) = (1..n).map {
        when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }
    }.toTypedArray()
}