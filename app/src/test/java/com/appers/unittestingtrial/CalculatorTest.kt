package com.appers.unittestingtrial

import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class CalculatorTest {
private  var  calculator : Calculator?=null
    @Before
    fun setUp() {
calculator=Calculator()
    }
@Test
fun `Test to make sure Addition works`(){
assertEquals(5.0,calculator?.addition(3,2))
    assertEquals(12.0,calculator?.addition(5,7))

}
@Test
    fun `Test to make sure Division works`(){

        assertEquals(2.0,calculator?.division(8,4))
    assertEquals(3.0,calculator?.division(9,3))
    }
    @Test
    fun `Test to check if Subtraction works`(){
        assertEquals(3.0,calculator?.subtraction(10,7))
        assertEquals(2.0,calculator?.subtraction(5,3))
    }
    @Test
    fun `Test to check if Multiplication works`(){
        assertEquals(15.0,calculator?.multiplication(3,5))

        assertEquals(16.0,calculator?.multiplication(4,4))

    }
    @Test
    fun `Test to check if Modulus works`(){
        assertEquals(1.0,calculator?.modulus(5,2))
        assertEquals(2.0,calculator?.modulus(11,3))
    }
    @After
    fun tearDown() {
        calculator=null
    }
}