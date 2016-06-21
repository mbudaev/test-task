package com.mbudaev.pages;

import com.opera.core.systems.OperaWebElement;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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
    @FindBy(id = "client_name")
    private WebElementFacade clientNameField;

    @FindBy(id = "client_phone")
    private WebElementFacade clientPhoneField;

    @FindBy(id = "country")
    private WebElementFacade addressCountryField;

    @FindBy(id = "state")
    private WebElementFacade addressStateField;

    @FindBy(id = "city")
    private WebElementFacade addressCityField;

    @FindBy(id = "raw_line")
    private WebElementFacade addressStreetField;

    @FindBy(id = "zipcode")
    private WebElementFacade addressZipCodeField;

    @FindBy(id = "desired_date")
    private WebElementFacade deliveryDateField;

    @FindBy(id = "desired_shift")
    private WebElementFacade deliveryShiftField;

    @FindBy(id = "purchase_order_number")
    private WebElementFacade orderNumberField;

    @FindBy(id = "order_type")
    private WebElementFacade orderTypeField;

    @FindBy(id = "volume")
    private WebElementFacade volumeField;

    @FindBy(id = "unit_quantity")
    private WebElementFacade unitsQuantityField;

    @FindBy(id = "unit_type")
    private WebElementFacade unitsTypeField;

    @FindBy(id = "mode")
    private WebElementFacade deliveryModeField;

    @FindBy(name = "commit")
    private WebElementFacade createorderButton;

    @FindBy(xpath = "//div[contains(@class,'alert')]//li")
    private List<WebElementFacade> alertsList;

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

    public void fillClientPhone(String phone) {
        clientPhoneField.clear();
        clientPhoneField.sendKeys(phone);

    }

    public void fillClientName(String name) {
        clientNameField.clear();
        clientNameField.sendKeys(name);
    }

    public void fillAddressCountry(String country) {
        addressCountryField.clear();
        addressCountryField.sendKeys(country);
    }

    public void fillAddressState(String state) {
        addressStateField.clear();
        addressStateField.sendKeys(state);
    }

    public void fillAddressCity(String city) {
        addressCityField.clear();
        addressCityField.sendKeys(city);
    }

    public void fillAddressStreet(String street) {
        addressStreetField.clear();
        addressStreetField.sendKeys(street);
    }

    public void fillAddressZipCode(Integer zipCode) {
        addressZipCodeField.clear();
        addressZipCodeField.sendKeys(String.valueOf(zipCode));

    }

    public void fillDeliveryDate(String deliveryDate) {
        deliveryDateField.clear();
        deliveryDateField.sendKeys(deliveryDate);
    }

    public void selectDeliveryShift(String shift) {
        if (shift != null) {
            deliveryShiftField.selectByVisibleText(shift);
        }
    }

    public void fillOrderNumber(Integer orderNumber) {
        orderNumberField.clear();
        orderNumberField.sendKeys(String.valueOf(orderNumber));
    }

    public void fillOrderType(String orderType) {
        if (orderType != null) {
            orderTypeField.selectByVisibleText(orderType);
        }
    }

    public void fillVolume(double volume) {
        volumeField.clear();
        volumeField.sendKeys(String.valueOf(volume));
    }

    public void fillUnitsQuantity(String unitsQuantity) {
        unitsQuantityField.clear();
        unitsQuantityField.sendKeys(unitsQuantity);
    }

    public void fillUnitsType(String unitsType) {
        unitsTypeField.clear();
        unitsTypeField.sendKeys(unitsType);
    }

    public void fillDeliveryMode(String deliveryMode) {
        deliveryModeField.clear();
        deliveryModeField.sendKeys(deliveryMode);
    }

    public void clickCreateOrderButton() {
        createorderButton.click();
    }

    public boolean alertIsDisplayed(String alertMessage) {
        for (WebElementFacade alert : alertsList) {
            if (alert.getText().equals(alertMessage)) return true;
        }
        return false;
    }
}
