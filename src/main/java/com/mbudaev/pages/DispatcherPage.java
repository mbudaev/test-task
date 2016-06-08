package com.mbudaev.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Mikhail_Budaev on 08-Jun-16.
 */
@DefaultUrl("/orders")
@NamedUrls(
        {
                @NamedUrl(name = "orders", url = "/orders"),
                @NamedUrl(name = "orders.date", url = "/orders?selected_date={1}")
        })
public class DispatcherPage extends PageObject {
    public DispatcherPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".btn-success")
    private WebElement newOrderBtn;

    public boolean newOrderBtnIsDisplayed() {
        return newOrderBtn.isDisplayed();
    }
}
