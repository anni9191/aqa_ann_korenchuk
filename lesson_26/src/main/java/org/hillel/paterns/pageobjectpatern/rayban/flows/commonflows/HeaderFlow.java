package org.hillel.paterns.pageobjectpatern.rayban.flows.commonflows;

import org.hillel.paterns.pageobjectpatern.rayban.pages.register.commomFragments.HeaderMenu;
import org.openqa.selenium.WebDriver;

public class HeaderFlow {
    private HeaderMenu headerMenu;

    public HeaderFlow(WebDriver driver) {
        this.headerMenu = new HeaderMenu(driver);
    }

    public void navigateToLogin(){
        headerMenu.getLoginIcon().click();
    }
}
