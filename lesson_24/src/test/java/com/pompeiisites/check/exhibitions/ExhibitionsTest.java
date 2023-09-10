package com.pompeiisites.check.exhibitions;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.platform.commons.annotation.Testable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class ExhibitionsTest {

    private static final WebDriver driver;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testExhibition() throws InterruptedException {
        driver.get("http://pompeiisites.org/en");
        WebElement ticketsIcon = driver.findElement(By.xpath("//li[@class='menu-item menu-item-type-post_type_archive menu-item-object-mostra nav__item  nav__item__10139']"));
        ticketsIcon.click();
        Thread.sleep(5000);
        String link = driver.getCurrentUrl();
        Assertions.assertTrue(link.contains("exhibitions-and-events"));

        WebElement articleExhibition = driver.findElement(By.xpath("//article[@class='slide slide--defaultbg block  owl-lazy background__full']"));
        WebElement imageExhibition =  driver.findElement(By.xpath("//img[@class='u-photo b-lazy img-responsive u-featured b-loaded']"));

    }

    @Test
    public void testTicket() {
        driver.get("https://www.ticketone.it/en/artist/scavi-pompei/parco-archeologico-di-pompei-988882/");

        List<WebElement> webElement = driver.findElements(By.xpath("//div[@class='event-time-block events-list hidden-xs"));
        List<String> prices = webElement.stream().map(WebElement::getText).collect(Collectors.toList());
        Assertions.assertTrue(prices.stream().allMatch(p -> p.contains("€")));
    }

    @AfterAll
    public static void teardown(){
        driver.quit();
    }

}
