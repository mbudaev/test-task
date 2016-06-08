package com.mbudaev.features;

import com.mbudaev.steps.SystemSteps;
import com.mbudaev.steps.UserSteps;
import com.mbudaev.utils.DatabaseHelper;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.openqa.selenium.WebDriver;

/**
 * Created by Mikhail_Budaev on 07-Jun-16.
 */
public class BaseTest {


    @Managed(uniqueSession = true)
    public WebDriver driver;

    @ManagedPages()
    public Pages pages;

    @Steps
    public UserSteps userSteps;

    @Steps
    public SystemSteps systemSteps;


}
