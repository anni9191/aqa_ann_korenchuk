package org.hillel.paterns.pageobjectpatern.rayban.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.hillel.paterns.pageobjectpatern.rayban.adstract.AbstractPage.TIMEOUT;

public class WaiterManager {

    private static final Duration = Duration.ofMillis(10000);

    public static WebElement waitUntilElementIsVisible(WebDriver driver, By locator) {
        return new WebDriverWait(driver, TIMEOUT) .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitUntilElementIsVisibleFluent(WebDriver driver, By locator) {
        return
                new FluentWait<>(driver)
                        .withTimeout(Duration.ofSeconds(8))
                        .pollingEvery(Duration.ofSeconds(9))
                        .ignoring(TimeoutException.class)
                        .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
