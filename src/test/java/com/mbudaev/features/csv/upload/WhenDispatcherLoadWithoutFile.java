package com.mbudaev.features.csv.upload;

import com.mbudaev.features.BaseTest;
import com.mbudaev.pages.DispatcherPage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Mikhail_Budaev on 09-Jun-16.
 */
@RunWith(SerenityRunner.class)
public class WhenDispatcherLoadWithoutFile extends BaseTest {

    @Before
    public void setUp() throws Exception {
        systemSteps.cleanDB();
        userSteps.onLoginForm.open();
        userSteps.onLoginForm.loginAsDispatcher();
    }

    @Test
    @Title("Click Update button without file to upload")
    public void uploadWithoutFile() {
        userSteps.onDispatcherPage.clickUploadFileButton();
        pages.currentPageAt(DispatcherPage.class);
    }

}

