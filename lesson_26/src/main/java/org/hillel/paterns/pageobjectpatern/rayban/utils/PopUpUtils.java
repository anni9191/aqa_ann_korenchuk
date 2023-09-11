package org.hillel.paterns.pageobjectpatern.rayban.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopUpUtils {
    public static final By ESCLUSIVIPOPUP = By.xpath("//div[@class='text-module text-module--theme-light text-module--text-align-center text-module--cta-mobile-orientation-vertical text-module--vertical-spacing-large']");

    private PopUpUtils(){

    }


    public static void closePopUp(WebDriver driver){
       driver.findElement(ESCLUSIVIPOPUP).click();
    }

}


