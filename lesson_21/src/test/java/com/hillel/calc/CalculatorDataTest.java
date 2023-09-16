package com.hillel.calc;

import calc.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorDataTest {
    private Calculator calculator = new Calculator();

    @Test(dataProvider = "intProvoder", dataProviderClass = DataProviderFactory.class)
    public void summTest(int a, int b, int result) {
        int actualResult = calculator.summ(a, b);
        Assert.assertEquals(result, actualResult);
        System.out.println("test1");
    }
}
