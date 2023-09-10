package com.hillel.patterns.pageobjectpattern.rayban.logintest.registertest;

import org.hillel.paterns.factory.BrowserName;
import org.hillel.paterns.factory.WebDriverFactory;
import org.hillel.paterns.pageobjectpatern.rayban.login.LoginPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

    private static LoginPage loginPage;

    private static WebDriver driver;

    @BeforeAll
    public static void init(){
        driver = WebDriverFactory.getByName(BrowserName.EDGE);
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
    }

    @Test
    public void loginTest(){
        driver.get("https://www.ray-ban.com/LoginDisplayView?catalogId=22565&langId=-4&storeId=26152");
        loginPage.getEMAIL_FIELD().sendKeys("buongiorno");
    }
}
