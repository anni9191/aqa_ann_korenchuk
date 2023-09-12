package org.hillel.paterns.pageobjectpatern.rayban.adstract;

import org.hillel.paterns.pageobjectpatern.rayban.pages.register.commomFragments.HeaderMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class AbstractPage {

    public static final Duration TIMEOUT = Duration.ofMillis(10000);

    protected WebDriver driver;

    protected WebDriverWait driverWait;

    private HeaderMenu headerMenu;

    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
        headerMenu = new HeaderMenu(driver);
        driverWait = new WebDriverWait(driver, TIMEOUT);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HeaderMenu getHeaderMenu() {return HeaderMenu};
}

