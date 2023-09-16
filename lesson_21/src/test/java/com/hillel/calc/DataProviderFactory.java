package com.hillel.calc;

import org.testng.annotations.DataProvider;
public class DataProviderFactory {
    @DataProvider(name = "intProvoder")
    public Object[][] createData() {
        return new Object[][]{
                new Object[]{20, 11, 31},
                new Object[]{5, 10, 15}
        };
    }
}
