package com.example.springbootdemo.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleCalculationTest {

    SimpleCalculation sc = new SimpleCalculation();

    @Test
    public void AddTest() {

        int c = sc.add(3, 5);

        assertEquals(8, c);
    }

    @Test
    public void SubtrationTest() {

        int c = sc.subtration(20, 5);

        assertEquals(15, c);
    }
}
