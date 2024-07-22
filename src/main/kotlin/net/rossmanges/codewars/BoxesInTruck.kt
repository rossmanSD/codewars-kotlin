package net.rossmanges.codewars

class BoxesInTruck {
    fun getMaxUnits(numBoxes: List<Int>, unitsPerBox: List<Int>, truckSize: Int): Int {
        // zip the two lists into a collection of key-value pairs and then sort by the value
        // ex: numBoxes: { 3, 2, 3 }; unitsPerBox: { 7, 2, 1 }
        // zipped unitsByBox: { (3 to 7), (2 to 2), (3 to 1) }
        val boxes = numBoxes
            .zip(unitsPerBox)
            .sortedByDescending { it.second }
            .flatMap { (box, units) -> List(box) { units } }
            .take(truckSize)
            .reduce { acc, it -> it + acc }
        return boxes
    }
}