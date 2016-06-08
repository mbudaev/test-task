package com.mbudaev.pages.elements;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Mikhail_Budaev on 08-Jun-16.
 */
public class HeaderElement extends PageObject {
    public HeaderElement(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".glyphicon-user")
    private WebElement login;

    @FindBy(css = ".btn-default")
    private WebElement logoutLink;

    public String getCurrentLogin (){
        return login.getText();
    }

    public void clickLogout(){
        logoutLink.click();
    }
}
