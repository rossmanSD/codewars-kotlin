package net.rossmanges.codewars

/**
 * CodeWars Kata "FIXME: Hello"
 * https://www.codewars.com/kata/5b0a80ce84a30f4762000069/kotlin
 * The (original) code provided has a method hello which is supposed to show only those attributes which have been explicitly set.
 * Furthermore, it is supposed to say them in the same order they were set.
 * When the same attribute is assigned multiple times the hello method shows it only once.
 * If this happens the order depends on the first assignment of that attribute,
 * but the value is from the last assignment.
 */
class Dinglemouse {
    private val data = mutableMapOf<DataType, String>()

    fun setAge(age: Int): Dinglemouse {
        data[DataType.AGE] = age.toString()
        return this
    }

    fun setSex(sex: Char): Dinglemouse {
        data[DataType.SEX] =
            when (sex) {
                'M' -> "male"
                'F' -> "female"
                else -> "unrecognized input"
            }
        return this
    }

    fun setName(name: String): Dinglemouse {
        data[DataType.NAME] = name
        return this
    }

    fun hello(): String {
        val acc = data.map { (type, value) ->
            when (type) {
                DataType.NAME -> "My name is $value"
                DataType.AGE -> "I am $value"
                DataType.SEX -> "I am $value"
            }
        }
        return if (acc.isEmpty()) {
            "Hello."
        } else {
            "Hello. " + acc.joinToString(". ") + "."
        }
    }

    enum class DataType {
        NAME, AGE, SEX
    }
}