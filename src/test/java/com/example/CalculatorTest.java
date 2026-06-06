package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    public void testSubtract() {
        assertEquals(4, calculator.subtract(10,6));
    }

    @Test
    public void testEven() {
        assertTrue(calculator.isEven(8));
    }

    @Test
    public void testOdd() {
        assertFalse(calculator.isEven(7));
    }
}