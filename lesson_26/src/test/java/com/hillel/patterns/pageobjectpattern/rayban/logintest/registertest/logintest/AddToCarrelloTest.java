package com.hillel.patterns.pageobjectpattern.rayban.logintest.registertest.logintest;

import org.hillel.paterns.factory.BrowserName;
import org.hillel.paterns.factory.WebDriverFactory;
import org.hillel.paterns.pageobjectpatern.rayban.flows.login.LoginFlow;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class AddToCarrelloTest {

    private static LoginFlow loginFlow;

    private static WebDriver driver;

    @BeforeAll
    public static void init(){
    driver = WebDriverFactory.getByName(BrowserName.EDGE);
    loginFlow = new LoginFlow(driver);
    driver.manage().window().maximize();
    // loginFlow.login("");

    }
}
