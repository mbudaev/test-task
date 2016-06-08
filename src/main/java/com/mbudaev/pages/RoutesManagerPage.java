package com.mbudaev.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

/**
 * Created by Mikhail_Budaev on 08-Jun-16.
 */
@DefaultUrl("/loads")
public class RoutesManagerPage extends PageObject{
    public RoutesManagerPage(WebDriver driver) {
        super(driver);
    }

}
