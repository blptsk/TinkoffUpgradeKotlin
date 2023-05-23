package week3_junit.rules

import junit.framework.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import w3_junit.Calculation

class CalculatorTestWithRule {

    @get:Rule
    val rule1 = UpgradeTestRule("MyFirst")

    @Test
    fun calculator1to1Test() {
        with(Calculation()) {
            assertEquals("Addition error 1 + 1", 2.0, calculator(addition, 1.0, 1.0))
        }
    }

}