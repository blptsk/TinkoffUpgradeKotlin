package week3_junit.rules

import org.junit.Rule
import org.junit.Test
import org.junit.rules.RuleChain

class CalculatorTestWithRuleChain {

    @JvmField
    @Rule
    var chain = RuleChain
        .outerRule(UpgradeTestRule("First rule"))
        .around(UpgradeTestRule("Second rule"))
        .around(UpgradeTestRule("Third rule"))

    @Test
    fun calculator1to1Test() {

        val r: Int = 10
        val r1 : Int = 8
        println(r.div(8))

    }

}