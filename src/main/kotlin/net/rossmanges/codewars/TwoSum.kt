package net.rossmanges.codewars

class TwoSum {
    fun two_sum(input: IntArray, target: Int): Pair<Int, Int> {
        for (i in 0 until input.size) {
            for (j in 1 until input.size) {
                if (input[i] + input [j] == target) {
                    return Pair(i, j)
                }
            }
        }
        return Pair(0,0)
    }
}