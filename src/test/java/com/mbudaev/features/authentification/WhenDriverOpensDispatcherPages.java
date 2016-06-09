package com.mbudaev.features.authentification;

import com.mbudaev.domain.User;
import com.mbudaev.features.BaseTest;
import com.mbudaev.pages.ErrorPage;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.TestData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Mikhail_Budaev on 08-Jun-16.
 */
@RunWith(SerenityParameterizedRunner.class)
public class WhenDriverOpensDispatcherPages extends BaseTest {
    private final User user;

    public WhenDriverOpensDispatcherPages(User user) {
        this.user = user;
    }

    @TestData
    public static Collection<java.lang.Object[]> testData() {
        return Arrays.asList(new java.lang.Object[][]{
                {new User("driver1", "123")},
                {new User("driver2", "123")}
        });
    }

    @Before
    public void setup() {
        userSteps.onLoginForm.open();
        userSteps.onLoginForm.login(user);
    }

    @Test
    @Title("Driver openLoadById dispatcher page")
    public void openDispatcherPage() {
        userSteps.onDispatcherPage.open();
        userSteps.pages().currentPageAt(ErrorPage.class);
    }

    @Test
    @Title("Driver openLoadById new order page")
    public void openNewOrderPage() {
        userSteps.onOrderPage.openNewOrderPage();
        userSteps.pages().currentPageAt(ErrorPage.class);
    }

    @Test
    @Title("Driver openLoadById order edit page")
    public void openOrderEditPage() {
        userSteps.onOrderPage.openOrderPageNumber(781);
        userSteps.pages().currentPageAt(ErrorPage.class);
    }

    @Test
    @Title("Driver openLoadById manage routs page")
    public void openRoutesManagerPage() {
        userSteps.onRoutingManagerPage.openLoadById(2);
        userSteps.pages().currentPageAt(ErrorPage.class);
    }

    @After
    public void tearDown() {
        pages.getDriver().manage().deleteAllCookies();
    }
}
