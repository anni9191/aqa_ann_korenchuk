package com.hillel.calc;

import calc.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;


public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @BeforeClass
    public void init (){
       calculator = new Calculator();
        System.out.println("Before class");
    }

    @BeforeTest
    public void printBeforeTest(){
        System.out.println("Before test");
    }

    @BeforeMethod
    public void beforeTestMethod(){
        System.out.println("Before each");
    }

    @BeforeGroups
    public void init2() {
        calculator = new Calculator();
        System.out.println("Before suite");
    }

    @Test(groups = {"smoke"})
    public void summTest(){
        int i =20;
        int j =11;
        int result = calculator.summ(i,j);
        Assert.assertEquals(result, 31);
        System.out.println("test1");
    }

    @Test(dependsOnGroups = {"smoke", "regression"})
    public void test1(){
        System.out.println("after all regression");
        Assert.assertEquals(1,1);
    }

    @Test(groups = {"regression"})
    public void summTest1(){
        int i =20;
        int j =11;
        int result = calculator.summ(i,j);
        Assert.assertEquals(result, 31);
        System.out.println("test2");
    }

    @AfterMethod
    public void afterTestMethod(){
        System.out.println("After each");
    }

    @AfterClass
    public void afterTestClass(){
        System.out.println("After class");
    }

}
