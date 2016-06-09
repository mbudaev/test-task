package com.mbudaev.steps;

import com.mbudaev.pages.RoutingManagerPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by Mikhail_Budaev on 08-Jun-16.
 */
public class RoutingManagerSteps extends ScenarioSteps {
    public RoutingManagerSteps(Pages pages) {
        super(pages);
    }

    RoutingManagerPage routingManagerPage;

    @Step("Open loads by id page")
    public void openLoadById(int id) {
        routingManagerPage.open("loads.by.id", PageObject.withParameters("" + id));
    }

}
