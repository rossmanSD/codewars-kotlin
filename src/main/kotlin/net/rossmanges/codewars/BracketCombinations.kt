package net.rossmanges.codewars

class BracketCombinations {
    fun bracketCombinations(num: Int): Int {
       return f(Pair(num, num), mutableMapOf())
    }

    private fun f(p: Pair<Int, Int>, memo: MutableMap<Pair<Int, Int>, Int>): Int {
        if (p.first < 1 || p.second < 1) return 1
        if (p.first == 1 && p.second == 1) return 1
        return memo[p] ?: run {
            val result = if (p.first == p.second) {
                f(Pair(p.first - 1, p.second), memo)
            } else {
                f(Pair(p.first - 1, p.second), memo)
                + f(Pair(p.first, p.second - 1), memo)
            }
            memo[p] = result
            result
        }
    }

    //       2
    //  ()()  (())

    //                  3,3
    //                      (   2,3
    //              (  1,3        )  2,2
    //           (  0,3  )  1,2        (   1,2
    //             )   )             (  0,2  ) 1,1
    //              )   (           )  0,1    (   0,1
    //               )    )        )  0,0       ) 0,0

    //  ()()() ((())) (())() ()(()) (()())
}