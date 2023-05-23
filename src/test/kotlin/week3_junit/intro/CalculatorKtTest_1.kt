package week3_junit.intro

import junit.framework.TestCase.assertEquals
import org.junit.Test
import w3_junit.Calculation

class CalculatorKtTest {

    @Test
    fun calculator1to1Test() {
        with(Calculation()) {
            assertEquals("Error addition 1 + 2", 3.0 ,calculator(addition, 1.0,2.0))
        }
    }
}