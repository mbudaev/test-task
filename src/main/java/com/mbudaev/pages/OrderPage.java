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

@NamedUrls(
        {
                @NamedUrl(name = "openLoadById.order", url = "/orders/{1}/edit"),
                @NamedUrl(name = "create.order", url = "/orders/new")
        }
)
@At(urls = {
        "#HOST/orders/.*./edit",
        "#HOST/orders/new"
})
public class OrderPage extends PageObject {
    public OrderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@value='Save changes']")
    private WebElement saveOrderBtn;


    @FindBy(xpath = "//input[@value='Create Order']")
    private WebElement createOrderBtn;


    public boolean createOrderBtnIsDisplayed() {
        return createOrderBtn.isDisplayed();
    }

    public boolean saveOrderBtnIsDisplayed() {
        return saveOrderBtn.isDisplayed();
    }
}
