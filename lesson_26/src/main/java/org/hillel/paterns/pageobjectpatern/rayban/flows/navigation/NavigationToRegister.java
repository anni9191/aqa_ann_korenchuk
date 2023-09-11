package org.hillel.paterns.pageobjectpatern.rayban.flows.navigation;

import org.hillel.paterns.pageobjectpatern.rayban.flows.login.LoginFlow;
import org.hillel.paterns.pageobjectpatern.rayban.registerflow.RegistrationFlow;
import org.openqa.selenium.WebDriver;

public class NavigationToRegister {

    private LoginFlow loginFlow;
    private RegistrationFlow registrationFlow;

    public NavigationToRegister(WebDriver driver) {
        this.registrationFlow = new RegistrationFlow(driver);
        this.loginFlow = new LoginFlow(driver);
    }

    public void navigateToRegisterPageFromLoginPage() {
        loginFlow.navigateToRegistrationPage();
    }



}
