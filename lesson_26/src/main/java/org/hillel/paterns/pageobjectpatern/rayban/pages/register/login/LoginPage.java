package org.hillel.paterns.pageobjectpatern.rayban.pages.register.login;

import org.hillel.paterns.pageobjectpatern.rayban.adstract.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.hillel.paterns.pageobjectpatern.rayban.utils.WaiterManager.waitUntilElementIsVisible;

public class LoginPage extends AbstractPage {

    private static final By EMAIL_FIELD = By.xpath("//input[@id='loginEmail']");
    private static final By PASSWORD_FIELD = By.xpath("//input[@id='show-password']");
    private static final By LOGIN_BUTTON = By.xpath("///input[@id='login_submit']");

    private static final By EMAIL_FIELD_ERROR = By.xpath("//div[@class='password-field rb-fieldrow rb-fieldrow--required rb-floating rb-invalidrow']");

    private static final By PASSWORD_ERROR = By.xpath("//span[@class='rb-fieldrow__helper utagpiimask rb-fieldrow__helper--error']");

    private static final By REGISTER_BUTTON = By.xpath("//input[@class='create-button rb-btn rb-btn--black ui-state-valid']");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEMAIL_FIELD(){
        return driverWait.until(ExpectedConditions.visibilityOfElementLocated(EMAIL_FIELD));
    }

    public WebElement getPASSWORD_FIELD(){
        return waitUntilElementIsVisible(driver, PASSWORD_FIELD);

    }

    public WebElement getLOGIN_BUTTON(){
        return driver.findElement(LOGIN_BUTTON);

    }
    public WebElement getEMAIL_FIELD_ERROR(){
        return driver.findElement(EMAIL_FIELD_ERROR);

    }

    public WebElement getPASSWORD_ERROR(){
        return driver.findElement(PASSWORD_ERROR);

    }

    public WebElement getREGISTER_BUTTON(){
        return driver.findElement(REGISTER_BUTTON);

    }

}
