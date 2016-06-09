package com.mbudaev.steps;

import com.mbudaev.pages.LoadsPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by Mikhail_Budaev on 09-Jun-16.
 */

public class LoadsSteps extends ScenarioSteps{
    public LoadsSteps(Pages pages) {
        super(pages);
    }

    LoadsPage loadsPage;

    @Step("Open loads page")
    public void open() {
        loadsPage.open("loads", PageObject.withParameters(""));
    }
    @Step("Open loads by date {0} page")
    public void open(String data) {
        loadsPage.open("loads.by.date", PageObject.withParameters(data));
    }
}
