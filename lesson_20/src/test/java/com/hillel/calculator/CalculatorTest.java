package com.hillel.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private static Calculator calculator = new Calculator();

    @BeforeAll
    public static void init() {
        calculator = new Calculator();
    }


    @Test
    public void testSumm() {
        int a = 10;
        int b = 3;
        int result = 13;
        int actualResult = calculator.summ(a, b);
        Assertions.assertTrue(result == actualResult, "actual result:" + actualResult + " expected was:" + result);

    }

    @Test
    public void testSumm2() {
        int a = 10;
        int b = 4;
        int result = 13;
        int actualResult = calculator.summ(a, b);
        Assertions.assertFalse(result == actualResult, "actual result:" + actualResult + " expected was:" + result);
    }

    @Test
    public void testSumm3() {
        int a = 10;
        int b = 3;
        int result = 13;
        int actualResult = calculator.summ(a, b);
        Assertions.assertEquals(result, actualResult, "actual result:" + actualResult + " expected was:" + result);
    }

    @Test
    public void testSumm4() {
        int a = 10;
        int b = 4;
        int result = 13;
        int actualResult = calculator.summ(a, b);
        Assertions.assertNotEquals(result, actualResult, "actual result:" + actualResult + " expected was:" + result);
    }

    @Test
    @DisplayName("Division Test")
    public void testDivision() {
        int c = 10;
        int d = 2;
        int result = 5;
        int actualResult = calculator.division(c,d);
        Assertions.assertTrue(result == actualResult, "actual result:" + actualResult + " expected was:" + result);
    }

    @Test
    @DisplayName("Multiplication Test")
    public void testMultiplication() {
        int i = 2;
        int j = 2;
        int result = 4;
        int actualResult = calculator.multiplication(i,j);
        Assertions.assertTrue(result == actualResult, "actual result:" + actualResult + " expected was:" + result);
    }

    @Test
    @DisplayName("Substact Test")
    public void testSubstact() {
        int k = 10;
        int m = 2;
        int result = 8;
        int actualResult = calculator.substact(k,m);
        Assertions.assertTrue(result == actualResult, "actual result:" + actualResult + " expected was:" + result);
    }
}



