package com.mbudaev.steps;

import com.mbudaev.pages.elements.HeaderElement;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

/**
 * Created by Mikhail_Budaev on 08-Jun-16.
 */
public class HeaderSteps extends ScenarioSteps {
    public HeaderSteps(Pages pages) {
        super(pages);
    }

    HeaderElement headerElement;

    @Step("Check authentification name is {0}")
    public void loginNameIsEquals(String login) {
        assertThat(headerElement.getCurrentLogin(), containsString(login));
    }

    @Step("Click logout")
    public void clickLogout() {
        headerElement.clickLogout();
    }
}
