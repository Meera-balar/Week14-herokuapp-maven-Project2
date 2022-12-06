package com.herokuapp.testsuite;

import com.herokuapp.pages.LoginPage;
import com.herokuapp.pages.SecurePage;
import com.herokuapp.testbase.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    SecurePage securePage = new SecurePage();

    @Test
    public void UserShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUserName("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedText = "Secure Area";
        Assert.assertEquals(securePage.getSecureAreaText(),expectedText,"Secure Area text is not displayed");
    }
    @Test
    public void verifyTheUsernameErrorMessage(){
        loginPage.enterUserName("tomJohn");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedText = "Your username is invalid!" + "\n×";
        Assert.assertEquals(loginPage.getUsernameErrorMessage(),expectedText,"Username error message is not displayed");
    }
    @Test
    public void verifyThePasswordErrorMessage(){
        loginPage.enterUserName("tomsmith");
        loginPage.enterPassword("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String expectedText = "Your password is invalid!" + "\n×";
        Assert.assertEquals(loginPage.getPasswordErrorMessage(),expectedText,"Password error message is not displayed");
    }


}
