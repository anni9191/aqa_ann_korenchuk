package org.hillel.paterns.pageobjectpatern.rayban.flows.commonflows;

import org.hillel.paterns.pageobjectpatern.rayban.adstract.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderFlow extends AbstractPage {
    private static final By LOGIN_ICON = By.xpath("//input[@class='rb-btn rb-btn--black ui-state-valid']");

    public HeaderFlow(WebDriver driver) {
        super (driver);
    }
    public WebElement getLoginIcon() {
        return driver.findElement(LOGIN_ICON);
    }
}
