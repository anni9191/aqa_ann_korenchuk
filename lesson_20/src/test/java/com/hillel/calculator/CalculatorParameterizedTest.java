package com.hillel.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class CalculatorParameterizedTest {
    private static Calculator calculator;

    @BeforeAll
    public static void init() {
        System.out.println("Calculator was created");
        calculator = new Calculator();
    }

    @ParameterizedTest
    @MethodSource("getValues")
    public void testSumm(int i, int j, int result) {
        int actualResult = calculator.summ(i, j);
        Assertions.assertTrue(result == actualResult, "actual result:" + actualResult + " expected was:" + result);
    }

    public static Stream<Arguments> getValues(){
        return Stream.of(
                Arguments.of(10,10,20),
                Arguments.of(4,10,14),
                Arguments.of(20,5,25)
        );
    }
    @Test
    public void assertAllShow() {
        Assertions.assertAll(
                () -> Assertions.assertTrue(true),
                () -> Assertions.assertFalse(true),
                () -> Assertions.assertTrue(false)
        );
    }

    @Test
    public void assertAllShow1() {
        Assertions.assertTrue(true);
        Assertions.assertFalse(true);
        Assertions.assertTrue(false);
    }

}
