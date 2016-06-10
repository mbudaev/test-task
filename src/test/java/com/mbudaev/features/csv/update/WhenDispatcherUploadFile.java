package com.mbudaev.features.csv.update;

import com.mbudaev.features.BaseTest;
import com.mbudaev.pages.DispatcherPage;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.TestData;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Mikhail_Budaev on 09-Jun-16.
 */
@RunWith(SerenityRunner.class)
public class WhenDispatcherUploadFile extends BaseTest {





    private  File file = new File("resource/file_without_extension");
    private  File file1 = new File("resource/weekly schedule.csv");

    @Before
    public void setUp() throws Exception {
        systemSteps.cleanDB();
        userSteps.onLoginForm.open();
        userSteps.onLoginForm.login_as_dispatcher();
    }

    @Test
    @Title("Click Update button without file to upload")
    public void uploadWithoutFile() {
        userSteps.onDispatcherPage.clickUploadFileButton();
        pages.currentPageAt(DispatcherPage.class);
    }

    @Test
    @Title("Click Update button without file to upload")
    public void uploadFileWithoutExtension() {
        userSteps.onDispatcherPage.chooseFileToUpload(file1);
        userSteps.onDispatcherPage.clickUploadFileButton();
        pages.currentPageAt(DispatcherPage.class);
    }
}

