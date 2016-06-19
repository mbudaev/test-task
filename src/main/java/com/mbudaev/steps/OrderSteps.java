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
        fillClinetName(client.getName());
        fillClinetPhone(client.getPhone());
    }

    @StepGroup("Fill destination address {0}")
    private void fillDestinationAddress(Address address) {
        fillAddressCountry(address.getCountry());
        fillAddressState(address.getState());
        fillAddressCity(address.getCity());
        fillAddressStreet(address.getAddress());
        fillAddressZipCode(address.getZipCode());

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
}
