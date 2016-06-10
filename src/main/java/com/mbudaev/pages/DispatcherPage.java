package com.mbudaev.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

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
    public DispatcherPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".btn-success")
    private WebElement newOrderBtn;

    @FindBy(xpath = "//input[@value='Upload']")
    private WebElement uploadButton;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement fileToUpload;

    public boolean newOrderBtnIsDisplayed() {
        return newOrderBtn.isDisplayed();
    }

    public void clickUploadButton() {
        uploadButton.click();
    }

    public void setFileToUpload(File file) {
        upload(file.getAbsolutePath()).to(fileToUpload);
    }
}
