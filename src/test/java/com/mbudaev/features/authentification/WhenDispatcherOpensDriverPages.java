package com.mbudaev.features.authentification;

import com.mbudaev.domain.User;
import com.mbudaev.features.BaseTest;
import com.mbudaev.pages.DispatcherPage;
import com.mbudaev.pages.ErrorPage;
import com.mbudaev.pages.OrderPage;
import com.mbudaev.pages.RoutingManagerPage;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Pending;
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
public class WhenDispatcherOpensDriverPages extends BaseTest {
    private final User user;

    public WhenDispatcherOpensDriverPages(User user) {
        this.user = user;
    }

    @TestData
    public static Collection<Object[]> testData() {
        return Arrays.asList(new java.lang.Object[][]{
                {new User("dispatcher", "123")}
        });
    }

    @Before
    public void setUp(){
        userSteps.onLoginForm.open();
        userSteps.onLoginForm.login(user);
    }

    @Test
    @Title("Dispatcher open dispatcher page")
    public void openDispatcherPage() {
        userSteps.onDispatcherPage.open();
        pages.currentPageAt(DispatcherPage.class);
    }

    @Test
    @Title("Dispatcher open dispatcher page by date")
    public void openDispatcherByDatePage() {
        userSteps.onDispatcherPage.open("2014-09-15");
        pages.currentPageAt(DispatcherPage.class);
    }

    @Test
    @Title("Dispatcher open certain order page")
    public void openCertainOrderPage() {
        userSteps.onOrderPage.openOrderPageNumber(781);
        pages.currentPageAt(OrderPage.class);
    }

    @Test
    @Title("Dispatcher open new order page")
    public void openNewOrderPage() {
        userSteps.onOrderPage.openNewOrderPage();
        pages.currentPageAt(OrderPage.class);
    }

    @Test
    @Title("Dispatcher open rout list by date page")
    public void openRoutesManagerPage() {
        userSteps.onRoutingManagerPage.openLoadById(2);
        pages.currentPageAt(RoutingManagerPage.class);
    }

    @Test
    @Title("Dispatcher open loads list page")
    public void openLoadsPage() {
        userSteps.onLoadsSteps.open();
        pages.currentPageAt(ErrorPage.class);
    }

    @Test
    @Title("Dispatcher open loads list page")
    public void openLoadsByDatePage() {
        userSteps.onLoadsSteps.open("2014-09-15");
        pages.currentPageAt(ErrorPage.class);
    }

    @After
    public void tearDown (){
        pages.getDriver().manage().deleteAllCookies();
    }
}
