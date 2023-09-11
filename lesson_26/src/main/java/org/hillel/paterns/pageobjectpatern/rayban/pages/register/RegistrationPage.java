package org.hillel.paterns.pageobjectpatern.rayban.pages.register;

import org.hillel.paterns.pageobjectpatern.rayban.adstract.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends AbstractPage {

    private static final By PAGE_TITLE = By.xpath(""//h1[@class='wcs-login-title']);


    protected RegistrationPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getPAGE_TITLE(){
        return driver.findElement(PAGE_TITLE);
    }

}
