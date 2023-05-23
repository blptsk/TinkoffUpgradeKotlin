package week3_junit.assertions

import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.Assert.assertThrows
import org.junit.Test
import w3_junit.Calculation
import java.lang.UnsupportedOperationException

class CalculatorAssertsTest {

    @Test
    fun calculatorAssertEqualsTest() {
        with(Calculation()) {
            assertEquals("Error addition 1 + 2", 3.0, calculator(addition, 1.0, 2.0))
        }
    }

    @Test
    fun calculatorAssertTrueTest() {
        with(Calculation()) {
            assertTrue("Error addition 1 + 2", calculator(addition, 1.0, 2.0) == 3.0)
        }
    }

    @Test
    fun calculatorAssertThrowsTest() {
        with(Calculation()) {
            assertThrows(UnsupportedOperationException::class.java) { calculator(division, 1.0, 0.0) }
        }
    }


}

