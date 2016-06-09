package com.mbudaev.steps;

import com.mbudaev.pages.OrderPage;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
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
    public void displayed_button_create() {
        assertThat(orderPage.createOrderBtnIsDisplayed(), is(false));
    }

    @Step("Save changes button order is displayed?")
    public void displayed_button_save() {
        assertThat(orderPage.saveOrderBtnIsDisplayed(), is(false));
    }
}
