package com.mbudaev.features.authentification;

import com.mbudaev.features.BaseTest;
import com.mbudaev.pages.ErrorPage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Mikhail_Budaev on 08-Jun-16.
 */
@RunWith(SerenityRunner.class)
public class WhenOpenPageWithoutAuthentication extends BaseTest {

    @Before
    public void setUp(){
        userSteps.onLoginForm.open();
    }

    @Test
    @Title("Open dispatcher page without authentication")
    public void openDispatcherPage() {
        userSteps.onDispatcherPage.open();
        userSteps.onDispatcherPage.pages().currentPageAt(ErrorPage.class);
    }

    @Test
    @Title("Open order creation page without authentication")
    public void openOrderCreatePage() {
        userSteps.onOrderPage.openNewOrderPage();
        userSteps.onOrderPage.pages().currentPageAt(ErrorPage.class);
    }

    @Test
    @Title("Open certain order page without authentication")
    public void openOrderEditPage() {
        userSteps.onOrderPage.openOrderPageNumber(781);
        userSteps.onOrderPage.pages().currentPageAt(ErrorPage.class);
    }

    @Test
    @Title("Open routing manager page without authentication")
    public void openRoutingManagerPage() {
        userSteps.onRoutingManagerPage.openLoadById(2);
        userSteps.onRoutingManagerPage.pages().currentPageAt(ErrorPage.class);
    }

    @Test
    @Title("Open dispatcher page without authentication")
    public void openDriverPage() {
        userSteps.onLoadsSteps.open();
        userSteps.onLoadsSteps.pages().currentPageAt(ErrorPage.class);

    }
}


