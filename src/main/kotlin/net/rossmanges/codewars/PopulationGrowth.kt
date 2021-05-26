package net.rossmanges.codewars

import kotlin.math.roundToInt

/**
 * 7kyu _Growth of a Population_ on CodeWars
 *
 * In a small town the population is p0 = 1000 at the beginning of a year. The population regularly increases by 2
 * percent per year and moreover 50 new inhabitants per year come to live in the town. How many years does the town
 * need to see its population greater or equal to p = 1200 inhabitants?
 */
class PopulationGrowth {

    /**
     * returns number of entire years needed to get a population greater or equal to the goal.
     * (my initial solution)
     *
     * [p0] - initial population (>0).
     * [growthPct] - population increase percentage per year (>0.0 or null).
     * [aug] - inhabitants coming or leaving each year.
     * [goal] - population quantity to meet or surpass (>0).
     */
    fun nbYear(p0:Int, growthPct:Double?, aug:Int, goal:Int):Int {
        var population = p0
        var iterations = 0
        while (population < goal) {
            population += (population * (growthPct ?: 0.0)/100.0).roundToInt() + aug
            iterations ++
        }
        return iterations
    }

    /**
     * More idiomatic solution (adapted from solutions on CodeWars)
     */
    fun idiomaticNbYear(p0:Int, growthPct:Double?, aug:Int, goal:Int) =
        generateSequence(p0) { population -> population + applyPercent(growthPct, population) + aug }
            .takeWhile { population -> population < goal }
            .count()

    private fun applyPercent(percentage: Double?, target: Int) = (target * ((percentage ?: 0.0)/100.0)).roundToInt()
}