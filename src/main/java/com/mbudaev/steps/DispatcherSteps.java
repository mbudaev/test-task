package com.mbudaev.steps;

import com.mbudaev.pages.DispatcherPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by Mikhail_Budaev on 08-Jun-16.
 */
public class DispatcherSteps extends ScenarioSteps {
    public DispatcherSteps(Pages pages) {
        super(pages);
    }

    DispatcherPage dispatcherPage;


    @Step("Open Dispatcher page")
    public void open() {
        dispatcherPage.open("orders",null);
    }

    @Step("Open order page for the date {0}")
    public void open(String date) {
        dispatcherPage.open("orders", PageObject.withParameters(date));
    }

    @Step("Page not present without authentication")
    public void page_present_without_authentication() {
        assertThat(dispatcherPage.newOrderBtnIsDisplayed(), is(false));
    }
}