package week3_junit.annotations
import junit.framework.TestCase.assertEquals
import org.junit.*
import org.junit.Assume.assumeTrue
import w3_junit.Calculation

import java.lang.UnsupportedOperationException

class CalculatorKtTest {

    lateinit var calculation : Calculation

    @Before
    fun setUp(){
        calculation = Calculation()
        println("[Annotations] Before Test")
    }

    @Test
    fun calculator1to1Test() {
        with(calculation) {
            assertEquals("Addition error ", 2.0 ,calculator(addition, 1.0,1.0))
        }
    }

    @Test
    fun calculator1to0Test() {
        with(calculation) {
            assertEquals("Addition error", 1.0 ,calculator(addition, 1.0,0.0))
        }
    }

    @Test (expected = UnsupportedOperationException::class)
    fun calculator1to02Test() {
        with(calculation) {
            calculator(division,2.0,0.0)
        }
    }

    @Test ()
    fun calculator1to3Test() {
        assumeTrue(false)
        with(calculation) {
            assertEquals("Addition error", 2.0 ,calculator(addition, 1.0,3.0))
        }
    }

    @After
    fun tearDown() {
        println("[Annotations] After Test")
    }


    companion object {
        @JvmStatic
        @BeforeClass
        fun beforeClassMethod() {
            println("Using @BeforeClass , executed before all test cases ")
        }

        @JvmStatic
        @AfterClass
        fun afterClassMethod() {
            println("Using @AfterClass ,executed after all test cases")
        }
    }
}