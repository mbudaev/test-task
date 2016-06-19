package com.mbudaev.steps;

import com.mbudaev.domain.User;
import com.mbudaev.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


/**
 * Created by Mikhail_Budaev on 07-Jun-16.
 */
public class LoginFormSteps extends ScenarioSteps {
    private static final String USERNAME_DISPATCHER = "dispatcher";
    private static final String PASSWORD = "123";
    private static final String USERNAME_DRIVER1 = "driver1";
    private static final String USERNAME_DRIVER2 = "driver2";


    public LoginFormSteps(Pages pages) {
        super(pages);
    }

    LoginPage loginPage;

    @StepGroup("Given username {0} and password {1}")
    public LoginFormSteps fillField(String username, String password) {
        loginPage.fillUsername(username);
        loginPage.fillPassword(password);
        return this;
    }

    @Step("Submit")
    public void submit() {
        loginPage.click_submit();
    }


    @Step("Open main page")
    public void open() {
        loginPage.open();
    }

    @Step("Assert authentification result")
    public void failedMessageIsDisplayed() {
        assertThat(loginPage.failTextIsPresent(), is(true));
    }

    @StepGroup("Login as dispatcher")
    public void loginAsDispatcher() {
        fillField(USERNAME_DISPATCHER, PASSWORD).submit();
    }

    @StepGroup("Login as {0}")
    public void login(User user)  {
        fillField(user.getLogin(), user.getPassword()).submit();
    }
    @StepGroup("Login as driver2")
    public void loginAsDriver2()  {
        fillField(USERNAME_DRIVER2, PASSWORD).submit();
    }
}
