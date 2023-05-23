package week3_junit

import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import w3_junit.Calculation

@RunWith(Parameterized::class)
class StandardCalculatorTest(
    private val firstOperand: Double,
    private val secondOperand: Double,
    private val expectedValue: Double) {
    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data(): List<Array<Double>> {
            return listOf( arrayOf(10.0, 20.0, 30.0), arrayOf(-4.0, 7.0, 3.0), arrayOf(0.0, 0.0, 0.0) )
        }
    }

    @Test
    fun additionTest() {
        val calculation = Calculation()
        with (calculation) {
            assertEquals(
                "Addition error", expectedValue, calculator(addition, firstOperand, secondOperand)
            )
        }
    }
}