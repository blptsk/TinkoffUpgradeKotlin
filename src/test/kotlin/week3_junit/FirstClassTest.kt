package week3_junit

import org.hamcrest.CoreMatchers.hasItems
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Assert.assertThrows
import org.junit.FixMethodOrder
import org.junit.Rule
import org.junit.Test
import org.junit.rules.RuleChain
import org.junit.runners.MethodSorters
import week3_junit.rules.UpgradeTestRule
import java.util.*


@FixMethodOrder(MethodSorters.DEFAULT)

class FirstClassTest {
    @get:Rule
    val rule = UpgradeTestRule("First rule")

    @get:Rule
    val rule2 = UpgradeTestRule()

    @get:Rule
    val rule3 = UpgradeTestRule()

    @get:Rule
    var chain: RuleChain = RuleChain.outerRule(UpgradeTestRule("First rule"))
        .around(UpgradeTestRule("Second rule"))
        .around(UpgradeTestRule("Third rule"))

    @Test
    fun myFirstSumTest() {
//        assertEquals("SumTest 1 and 1 is failed",9, FirstClass().sum(1,1))
        assertThat(
            Arrays.asList("Java", "Kotlin", "Scala"),
            hasItems("Java", "Kotlin"));
    }
    fun myFirestSumTest() {
        val exception: Exception = assertThrows(Exception::class.java) { /*your code*/ }

//        assertEquals("SumTest 1 and 1 is failed",9, FirstClass().sum(1,1))

    }
}
