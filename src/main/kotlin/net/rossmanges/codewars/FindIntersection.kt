package net.rossmanges.codewars

class FindIntersection {
    fun findIntersection(strArr: Array<String>): String {

        val output = mutableListOf<Int>()

        val array0 = strArr[0].split(", ").map { it.toInt() }
        val array1 = strArr[1].split(", ").map { it.toInt() }

        array0.forEach { elem ->
            if (array1.contains(elem)) {
                output.add(elem)
            }
        }

        return if (output.isEmpty()) "false"
        else output.joinToString(",")
    }
}