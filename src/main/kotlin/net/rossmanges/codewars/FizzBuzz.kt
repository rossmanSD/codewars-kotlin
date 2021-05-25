package net.rossmanges.codewars

class FizzBuzz {
    fun fizzBuzz(n: Int): Array<String> {
        val numbers = (1..n).toList()
        return numbers.map {
            if (it % 3 == 0 && it % 5 == 0) "FizzBuzz"
            else if (it % 3 == 0) "Fizz"
            else if (it % 5 == 0) "Buzz"
            else it.toString()
        }.toTypedArray()
    }
}