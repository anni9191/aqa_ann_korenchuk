package org.hillel.paterns.pageobjectpatern.rayban.registerflow;

import org.hillel.paterns.pageobjectpatern.rayban.pages.register.RegistrationPage;
import org.openqa.selenium.WebDriver;

public class RegistrationFlow {
    private RegistrationFlow registrationFlow;

    public RegistrationFlow(WebDriver driver) {

        this.registrationFlow = new RegistrationPage(driver);
    }
    public String getTitlePage(){

        return registrationPage.getPAGE_TITLE().getText();
    }
}
