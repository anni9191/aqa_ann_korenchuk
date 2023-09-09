package org.example;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverLogLevel;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.Set;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setLogLevel(ChromeDriverLogLevel.INFO);
        WebDriver driver = new ChromeDriver();


//      driver.get("http://pompeiisites.org/en");

        driver.navigate().to("http://pompeiisites.org/en");
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(4000);
        driver.navigate().to("https://www.parconazionaledelvesuvio.it");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.close();
        driver.quit();

        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.manage().window().setSize(new Dimension(1400,1400));
        driver.navigate().to("http://pompeiisites.org/en/exhibitions/art-and-sensuality-in-the-houses-of-pompeii");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


    }
}
