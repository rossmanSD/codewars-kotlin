package net.rossmanges.codewars

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DinglemouseTest {
    @Test
    fun testBob27Male() {
        val dm = Dinglemouse().setName("Bob").setAge(27).setSex('M')
        val expected = "Hello. My name is Bob. I am 27. I am male."
        assertEquals(expected, dm.hello())
    }

    @Test
    fun test27MaleBob() {
        val dm = Dinglemouse().setAge(27).setSex('M').setName("Bob")
        val expected = "Hello. I am 27. I am male. My name is Bob."
        assertEquals(expected, dm.hello())
    }

    @Test
    fun testAliceFemale() {
        val dm = Dinglemouse().setName("Alice").setSex('F')
        val expected = "Hello. My name is Alice. I am female."
        assertEquals(expected, dm.hello())
    }

    @Test
    fun testBatman() {
        val dm = Dinglemouse().setName("Batman")
        val expected = "Hello. My name is Batman."
        assertEquals(expected, dm.hello())
    }
}