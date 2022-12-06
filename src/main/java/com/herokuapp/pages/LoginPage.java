package com.herokuapp.pages;

import com.herokuapp.propertyreader.PropertyReader;
import com.herokuapp.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends Utility {

    By userNameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.xpath("//i[contains(text(),'Login')]");

    By userNameErrorMessage = By.xpath("//div[@id = 'flash']");
    By passwordErrorMessage = By.xpath("//div[@class = 'flash error']");


    public void enterUserName(String username){
        sendTextToElement(userNameField,username);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getUsernameErrorMessage(){
        return getTextFromElement(userNameErrorMessage);
    }
    public String getPasswordErrorMessage(){
        return getTextFromElement(passwordErrorMessage);
    }
}
