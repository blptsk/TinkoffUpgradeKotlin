package week3_junit.assertions

import org.assertj.core.api.SoftAssertions
import org.junit.Test
import w3_junit.Calculation

class SoftAssertionsTest {

    @Test
    fun softAssertionTestFunc() {

        val calculator = Calculation()
        val softAssertions = SoftAssertions()
        with(calculator) {
            softAssertions.assertThat(calculator(calculator.addition, 1.0, 3.0 ))
                .isEqualTo(4.0)

            softAssertions.assertThat(calculator(calculator.division, 4.0, 2.0 ))
                .isEqualTo(2.0)

            softAssertions.assertThat(calculator(calculator.multiplication, 5.0, 15.0 ))
                .isEqualTo(75.0)
        }

        softAssertions.assertAll()

    }
}