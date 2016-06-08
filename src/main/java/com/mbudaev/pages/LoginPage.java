package com.mbudaev.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.FindsByClassName;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBys;

import java.util.List;

/**
 * Created by Mikhail_Budaev on 07-Jun-16.
 */
@DefaultUrl("/auth/signin")
public class LoginPage extends PageObject {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "login")
    private WebElement loginField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(name = "commit")
    private WebElement signInButton;

    @FindBy(className = "alert")
    private WebElement failBlock;

    @FindBy(css = ".alert.alert-warning.fade.in>ul>li")
    private List<WebElement> failstext;


    public void fillUsername(String username) {
        loginField.clear();
        loginField.sendKeys(username);
    }

    public void fillPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void click_submit() {
        signInButton.click();
    }

    public boolean failTextIsPresent() {
        if (failstext.size() > 0) {
            return failBlock.isDisplayed();
        } else {
            return false;
        }


    }
}
