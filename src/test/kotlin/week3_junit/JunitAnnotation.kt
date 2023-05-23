package week3_junit

import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertFalse
import org.junit.*
import week3_junit.rules.UpgradeTestRule


class JunitAnnotationsExample {
    private var list: ArrayList<String>? = null


    @Before
    fun beforeFunc() {
        list = ArrayList()
        println("Using @Before annotations ,executed before each test cases ")
    }

    @After
    fun afterFunc() {
        list!!.clear()
        println("Using @After ,executed after each test cases")
    }

    @Test
    fun testBody() {
        list!!.add("test")
        assertFalse(list!!.isEmpty())
        assertEquals(1, list!!.size)
    }

    @Ignore
    fun ignoredTest() {
        println("Using @Ignore , this execution is ignored")
        Assume.assumeTrue(true)
    }

    @Test(timeout = 10)
    fun testWithTimeout() {
        println("Using @Test(timeout),it can be used to enforce timeout in JUnit4 test case")
    }

    @Ignore("fuck off")
    @Test(expected = NoSuchMethodException::class)
    fun exceptionTest() {
        println("Using @Test(expected) ,it will check for specified exception during its execution")
    }

    companion object {
        @JvmField
        @ClassRule
        val rule = UpgradeTestRule()


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