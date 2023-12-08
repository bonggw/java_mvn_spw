package com.gw.java_mvn_spw.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void multiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }
}