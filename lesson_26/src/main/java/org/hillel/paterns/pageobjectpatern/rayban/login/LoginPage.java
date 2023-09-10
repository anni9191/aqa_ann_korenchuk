package org.hillel.paterns.pageobjectpatern.rayban.login;

import org.hillel.paterns.pageobjectpatern.rayban.adstract.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends AbstractPage {

    private static final By EMAIL_FIELD = By.xpath("//input[@id='loginEmail']");
    private static final By PASSWORD_FIELD = By.xpath("//input[@id='show-password']");
    private static final By LOGIN_BUTTON = By.xpath("///input[@id='login_submit']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEMAIL_FIELD(){
        return driver.findElement(EMAIL_FIELD);

    }

    public WebElement getPASSWORD_FIELD(){
        return driver.findElement(PASSWORD_FIELD);

    }

    public WebElement getLOGIN_BUTTON(){
        return driver.findElement(LOGIN_BUTTON);

    }

}
