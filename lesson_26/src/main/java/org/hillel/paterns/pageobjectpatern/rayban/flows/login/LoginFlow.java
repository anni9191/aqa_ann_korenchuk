package org.hillel.paterns.pageobjectpatern.rayban.flows.login;

import org.hillel.paterns.pageobjectpatern.rayban.pages.register.login.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginFlow {
    private LoginPage loginPage;

    public LoginFlow(WebDriver webDriver) {
        this.loginPage = new loginPage(webDriver);
    }

    public void fillEmail(String email) {
        loginPage.getEMAIL_FIELD().clear();
        loginPage.getEMAIL_FIELD().sendKeys(email);
    }

    public void fillPassword(String password) {
        loginPage.getPASSWORD_FIELD().sendKeys(password);
    }

    public void submit(){
        loginPage.getLOGIN_BUTTON().click();
    }

    public String getPasswordErrorText(){
        return loginPage.getPASSWORD_ERROR().getText()
    }

    public String getEmailFieldErrorTest(){
        return loginPage.getEMAIL_FIELD_ERROR().getText()
    }

    public void login(String email, String password){
        fillEmail(email);
        fillPassword(password);
        submit();
    }
    public void navigateToRegistrationPage(){
        loginPage.getREGISTER_BUTTON().click();
    }
}
