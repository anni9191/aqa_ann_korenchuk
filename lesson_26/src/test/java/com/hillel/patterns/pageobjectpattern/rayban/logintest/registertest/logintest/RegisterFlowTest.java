package com.hillel.patterns.pageobjectpattern.rayban.logintest.registertest.logintest;

import org.hillel.paterns.factory.BrowserName;
import org.hillel.paterns.factory.WebDriverFactory;
import org.hillel.paterns.pageobjectpatern.rayban.flows.login.LoginFlow;
import org.hillel.paterns.pageobjectpatern.rayban.registerflow.RegistrationFlow;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RegisterFlowTest {

    private static LoginFlow loginFlow;

    private static RegistrationFlow registrationFlow;

    private static WebDriver driver;

    @BeforeAll
    public static void init(){
        driver = WebDriverFactory.getByName(BrowserName.EDGE);
        loginFlow = new LoginFlow(driver);
        registrationFlow = new RegistrationFlow(driver);
        driver.manage().window().maximize();
    }

    @Test
    public void registerNavigateTest(){
        driver.get("https://www.ray-ban.com/LoginDisplayView?catalogId=22565&langId=-4&storeId=26152");
        loginFlow.login("buongiorno@gmail.com","");
        loginFlow.navigateToRegistrationPage();
        String title = registrationFlow.getTitlePage();
        Assertions.assertEquals("CREA UN ACCOUNT", title);
    }


}
