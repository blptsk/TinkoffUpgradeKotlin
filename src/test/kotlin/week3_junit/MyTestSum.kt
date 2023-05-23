package week3_junit

import org.junit.Test

import org.junit.Assert.*
import org.junit.Assume.assumeTrue
import org.junit.Rule
import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.model.Statement

class MyTestSum {

    @Test
    fun sumTest() {
       // assertEquals("SumTest 1 and 1 is failed",2, FirstClass().sum(1,1))
    }

    @Test
    fun checkNFCTest(){
        assumeTrue(isNfcAvailable())
        checkScreenNfc()
    }

    fun checkScreenNfc(){}

    fun isNfcAvailable(): Boolean = false
}


