package com.herokuapp.pages;

import com.herokuapp.propertyreader.PropertyReader;
import com.herokuapp.utility.Utility;
import org.openqa.selenium.By;

public class SecurePage extends Utility {

    By secureAreaText = By.xpath("//h2[text()=' Secure Area']");

    public String getSecureAreaText(){
        return getTextFromElement(secureAreaText);
    }
}
