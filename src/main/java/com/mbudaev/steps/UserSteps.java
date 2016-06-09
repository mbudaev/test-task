package com.mbudaev.steps;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by Mikhail_Budaev on 07-Jun-16.
 */
public class UserSteps extends ScenarioSteps {

    @Steps
    public OrderSteps onOrderPage;

    @Steps
    public HeaderSteps onPageHeader;

    @Steps
    public DispatcherSteps onDispatcherPage;

    @Steps
    public LoginFormSteps onLoginForm;

    @Steps
    public RoutingManagerSteps onRoutingManagerPage;

    @Steps
    public LoadsSteps onLoadsSteps;


    public UserSteps(Pages pages) {
        super(pages);
    }

}
