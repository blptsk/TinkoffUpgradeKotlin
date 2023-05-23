package week3_junit.rules

import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement

class UpgradeTestRule(val name: String = "default") : TestRule {
    override fun apply(base: Statement, p1: Description): Statement {
        return object : Statement() {
            override fun evaluate() {
                println("TestRule $name Before Test")
                base.evaluate()
                println("TestRule $name After Test")
            }
        }
    }
}