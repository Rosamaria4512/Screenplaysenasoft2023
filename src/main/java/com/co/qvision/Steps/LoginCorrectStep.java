package com.co.qvision.Steps;

import com.co.qvision.PageObejcts.LoginPage;
import com.co.qvision.models.CredentialLoginCorrectly;
import net.thucydides.core.annotations.Step;

public class LoginCorrectStep {

    CredentialLoginCorrectly credentialLoginCorrectly;

    public LoginCorrectStep(CredentialLoginCorrectly credentialLoginCorrectly) {
        this.credentialLoginCorrectly = credentialLoginCorrectly;
    }

    LoginPage loginPage = new LoginPage();

    @Step
    public void openBrowser(){
        loginPage.open();
    }

  /*  @Step
    public void login(){

        loginPage.getDriver().findElement(loginPage.getBTN_LOGO())
                .click();
    }
    public void username(){
        loginPage.getDriver().findElement(loginPage.getTXT_USER())
                .sendKeys(credentialLoginCorrectly.getEmail());
    }
    public void password(){
        loginPage.getDriver().findElement(loginPage.getTXT_PASSWORD())
                .sendKeys(credentialLoginCorrectly.getPassword());
    }*/
}


