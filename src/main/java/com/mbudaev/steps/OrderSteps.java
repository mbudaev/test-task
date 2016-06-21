package com.mbudaev.steps;

import com.mbudaev.domain.Address;
import com.mbudaev.domain.Client;
import com.mbudaev.domain.Order;
import com.mbudaev.pages.OrderPage;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by Mikhail_Budaev on 08-Jun-16.
 */
public class OrderSteps extends ScenarioSteps {
    public OrderSteps(Pages pages) {
        super(pages);
    }

    OrderPage orderPage;

    @Step("Open order {0} page")
    public void openOrderPageNumber(int i) {
        orderPage.open("openLoadById.order", PageObject.withParameters("" + i));
    }

    @Step("Open creation order page")
    public void openNewOrderPage() {
        orderPage.open("create.order", PageObject.withParameters(""));
    }

    @Step("Creation button order is displayed?")
    public void displayedButtonCreate() {
        assertThat(orderPage.createOrderBtnIsDisplayed(), is(false));
    }

    @Step("Save changes button order is displayed?")
    public void displayedButtonSave() {
        assertThat(orderPage.saveOrderBtnIsDisplayed(), is(false));
    }

    @StepGroup("Fill order form")
    public void fillOrderForm(Order order) {
        fillDeliveryInfo(order);
        fillDestinationAddress(order.getAddress());
        fillClientInfo(order.getClient());
    }

    @StepGroup("Fill client information {0}")
    private void fillClientInfo(Client client) {
        fillClientName(client.getName());
        fillClientPhone(client.getPhone());
    }

    @Step("Fill client phone: {0}")
    private void fillClientPhone(String phone) {
        orderPage.fillClientPhone(phone);
    }

    @Step("Fill client name: {0}")
    private void fillClientName(String name) {
        orderPage.fillClientName(name);
    }

    @StepGroup("Fill destination address {0}")
    private void fillDestinationAddress(Address address) {
        fillAddressCountry(address.getCountry());
        fillAddressState(address.getState());
        fillAddressCity(address.getCity());
        fillAddressStreet(address.getAddress());
        fillAddressZipCode(address.getZipCode());

    }

    @Step("Fill country: {0}")
    private void fillAddressCountry(String country) {
        orderPage.fillAddressCountry(country);
    }

    @Step("Fill state: {0}")
    private void fillAddressState(String state) {
        orderPage.fillAddressState(state);
    }

    @Step("Fill city: {0}")
    private void fillAddressCity(String city) {
        orderPage.fillAddressCity(city);
    }

    @Step("Fill street: {0}")
    private void fillAddressStreet(String street) {
        orderPage.fillAddressStreet(street);
    }

    @Step("Fill zipCode: {0}")
    private void fillAddressZipCode(Integer zipCode) {
        orderPage.fillAddressZipCode(zipCode);
    }

    @StepGroup("Fill delivery information {0}")
    private void fillDeliveryInfo(Order order) {
        fillDeliveryDate(order.getDeliveryDate());
        fillDeliveryShift(order.getShift());
        fillOrderNumber(order.getOrderNumber());
        fillOrderType(order.getOrderType());
        fillVolume(order.getVolume());
        fillUnitsQuantity(order.getUnitsQuantity());
        fillUnitsType(order.getUnitsType());
        fillDeliveryMode(order.getDeliveryMode());
    }

    @Step("Fill deliveryDate: {0}")
    private void fillDeliveryDate(String deliveryDate) {
        orderPage.fillDeliveryDate(deliveryDate);
    }

    @Step("Fill shift: {0}")
    private void fillDeliveryShift(String  shift) {
        orderPage.selectDeliveryShift(shift);
    }

    @Step("Fill orderNumber: {0}")
    private void fillOrderNumber(Integer orderNumber) {
        orderPage.fillOrderNumber(orderNumber);
    }

    @Step("Fill orderType: {0}")
    private void fillOrderType(String orderType) {
        orderPage.fillOrderType(orderType);
    }

    @Step("Fill volume: {0}")
    private void fillVolume(double volume) {
        orderPage.fillVolume(volume);
    }

    @Step("Fill unitsQuantity: {0}")
    private void fillUnitsQuantity(String unitsQuantity) {
        orderPage.fillUnitsQuantity(unitsQuantity);
    }

    @Step("Fill unitsType: {0}")
    private void fillUnitsType(String unitsType) {
        orderPage.fillUnitsType(unitsType);
    }

    @Step("Fill deliveryMode: {0}")
    private void fillDeliveryMode(String deliveryMode) {
        orderPage.fillDeliveryMode(deliveryMode);
    }

    @Step("Click create order button")
    public void clickCreateOrder() {
        orderPage.clickCreateOrderButton();
    }

    @Step("Assert: Alert {0} is displayed")
    public void alertIsDisplayed(String alertMessage) {
        assertThat(orderPage.alertIsDisplayed(alertMessage), is(true));

    }
}
