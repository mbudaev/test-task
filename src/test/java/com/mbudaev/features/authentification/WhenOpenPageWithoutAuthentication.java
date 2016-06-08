package com.mbudaev.features.authentification;

import com.mbudaev.features.BaseTest;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Pending;
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
        userSteps.onDispatcherPage.page_present_without_authentication();
    }

    @Test
    @Pending
    @Title("Open dispatcher page without authentication")
    public void openOrderCreatePage() {
        userSteps.onOrderPage.openNewOrderPage();
        userSteps.onOrderPage.displayed_button_create();
    }

    @Test
//    @Pending
    @Title("Open dispatcher page without authentication")
    public void openOrderEditPage() {
        userSteps.onOrderPage.openOrderPageNumber(781);
        userSteps.onOrderPage.displayed_button_save();
    }

    @Test
    @Pending
    @Title("Open dispatcher page without authentication")
    public void openRoutesManagerPage() {
        userSteps.onRoutesManagerPage.open();
        userSteps.onRoutesManagerPage.page_present_without_authentification();
    }
//
//    @Test
//    @Pending
//    @Title("Open dispatcher page without authentication")
//    public void openDriverPage() {
//        userSteps.onDriverPage.open();
//        userSteps.onDriverPage.page_present_without_authentification();
//    }
}


