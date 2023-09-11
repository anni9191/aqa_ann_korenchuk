package com.hillel.patterns.pageobjectpattern.rayban.logintest.registertest.logintest;

import org.hillel.paterns.factory.BrowserName;
import org.hillel.paterns.factory.WebDriverFactory;
import org.hillel.paterns.pageobjectpatern.rayban.flows.login.LoginFlow;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class LoginFlowTest {

    private static LoginFlow loginFlow;

    private static WebDriver driver;

    @BeforeAll
    public static void init(){
        driver = WebDriverFactory.getByName(BrowserName.EDGE);
        loginFlow = new LoginFlow(driver);
        driver.manage().window().maximize();
        driver.get("https://www.sunglasshut.com/uk");
        closePopUp(driver);
    }

    private static void closePopUp(WebDriver driver) {
    }


    @Test
    public void loginNavigationTest() {
        driver.get("https://www.sunglasshut.com/uk");
        loginFlow.getHeaderFlow().navigateToLogin();
        Assertions.assertTrue(driver.getCurrentUrl().contains("myaccount"));

    @Test
    public void loginTest(){
        driver.get("https://www.ray-ban.com/LoginDisplayView?catalogId=22565&langId=-4&storeId=26152");
        loginFlow.fillEmail("buongiorno@gmail.com");
        loginFlow.submit();
        String errorText = loginFlow.getPasswordErrorText();
        Assertions.assertEquals(errorText, "Immettere la password");
    }

    @Test
    public void loginTest2(){
        driver.get("https://www.ray-ban.com/LoginDisplayView?catalogId=22565&langId=-4&storeId=26152");
        loginFlow.login("buongiorno@gmail.com","");
        String errorText = loginFlow.getPasswordErrorText();
        Assertions.assertEquals(errorText, "Immettere la password");
    }

    @Test
    public void loginTest3(){
        driver.get("https://www.ray-ban.com/LoginDisplayView?catalogId=22565&langId=-4&storeId=26152");
        loginFlow.login("","Qwerty123@");
        String errorText = loginFlow.getEmailFieldErrorTest();
        Assertions.assertEquals(errorText, "Immettere un indirizzo e-mail valido");
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
