package com.mbudaev.steps;

import com.mbudaev.pages.RoutesManagerPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by Mikhail_Budaev on 08-Jun-16.
 */
public class RoutesManagerSteps extends ScenarioSteps {
    public RoutesManagerSteps(Pages pages) {
        super(pages);
    }

    RoutesManagerPage routesManagerPage;

    @Step("Open driver main page")
    public void open() {
        routesManagerPage.open();
    }
}
