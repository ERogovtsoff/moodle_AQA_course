package org.example;

import org.junit.Assert;
import org.junit.Test;
import calc.Calculator;

public class TriangleTest{
    Calculator calculator = new Calculator();

    @Test
    public void positiveTest() {
        Assert.assertEquals(6.0, calculator.triangleSquareCalculate(3, 4, 5), 0.0);
    }

    @Test
    public void exceptionOnNullValueATest() {
        try {
            calculator.triangleSquareCalculate(0, 4, 5);
        } catch (ArithmeticException exception) {
            Assert.assertEquals("Число a не может быть меньше, либо равно 0", exception.getMessage());
        }
    }

    @Test
    public void exceptionOnNullValueBTest() {
        try {
            calculator.triangleSquareCalculate(4, 0, 5);
        } catch (ArithmeticException exception) {
            Assert.assertEquals("Число b не может быть меньше, либо равно 0", exception.getMessage());
        }
    }

    @Test
    public void exceptionOnNullValueCTest() {
        try {
            calculator.triangleSquareCalculate(4, 5, 0);
        } catch (ArithmeticException exception) {
            Assert.assertEquals("Число c не может быть меньше, либо равно 0", exception.getMessage());
        }
    }
}
