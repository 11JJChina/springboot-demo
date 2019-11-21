package com.example.springbootdemo.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexCalculationTest {

    ComplexCalculation cc = new ComplexCalculation();

    @Test
    public void divisionTest(){
        int c = cc.division(100,5);
        assertEquals(20,c);
    }

    @Test
    public void multiplyTest(){
        int c = cc.multiply(100,5);
        assertEquals(500,c);
    }

}
