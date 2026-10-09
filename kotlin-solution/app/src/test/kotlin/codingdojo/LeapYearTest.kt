package codingdojo

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class LeapYearTest {

    @Test
    fun `typical common year`() {
        val year = 2001

        assertFalse(LeapYear.isLeap(year), "${year} should not be a leap year")
    }

    @Test
    fun `atypical common year`() {
        val year = 1900

        assertFalse(LeapYear.isLeap(year), "${year} should not be a leap year")
    }

    @Test
    fun `typical leap year`() {
        val year = 1996

        assertTrue(LeapYear.isLeap(year), "${year} should be a leap year")
    }

    @Test
    fun `atypical leap year`() {
        val year = 2000

        assertTrue(LeapYear.isLeap(year), "${year} should be a leap year")
    }
}