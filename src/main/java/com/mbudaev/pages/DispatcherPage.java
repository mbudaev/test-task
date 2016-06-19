package com.mbudaev.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Mikhail_Budaev on 08-Jun-16.
 */
@DefaultUrl("/orders")
@NamedUrls(
        {
                @NamedUrl(name = "orders", url = "/orders"),
                @NamedUrl(name = "orders.by.date", url = "/orders?selected_date={1}")
        }
)
@At("#HOST/orders*")
public class DispatcherPage extends PageObject {


    @FindBy(xpath = "//h3[contains(.,'Delivery Dates:')]")
    private WebElementFacade orderDatesTitle;

    public DispatcherPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".btn-success")
    private WebElementFacade newOrderBtn;

    @FindBy(xpath = "//input[@value='Upload']")
    private WebElementFacade uploadButton;

    @FindBy(xpath = "//input[@type='file']")
    private WebElementFacade fileToUpload;

    @FindBy(xpath = "//a[contains(.,'New Delivery Order')]")
    private WebElementFacade buttonNewOrder;

    public boolean newOrderBtnIsDisplayed() {
        return newOrderBtn.isDisplayed();
    }

    public void clickUploadButton() {
        uploadButton.click();
    }

    public void setFileToUpload(File file) {
        upload(file.getAbsolutePath()).to(fileToUpload);
    }

    public void clickButtonNewOrder() {
        buttonNewOrder.click();
    }

    public void waitOrdersDateTitle() {
        orderDatesTitle.withTimeoutOf(10, TimeUnit.SECONDS).waitUntilVisible();
    }
}
