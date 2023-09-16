package com.hillel.calc;

import calc.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CalculationTestPositive {
    private Calculator calculator = new Calculator();

    @BeforeSuite
    public void init() {
        calculator = new Calculator();
        System.out.println("Before suite");
    }

    @BeforeGroups
    public void init2() {
        calculator = new Calculator();
        System.out.println("Before suite");
    }

    @BeforeClass
    public void init1() {
        calculator = new Calculator();
        System.out.println("Before class");
    }

    @Test(groups = {"smoke", "regression"})
    public void summTest() {
        int c = 20;
        int d = 21;
        int result = calculator.summ(c, d);
        Assert.assertEquals(result, 41);
        System.out.println("test1");
    }

}
