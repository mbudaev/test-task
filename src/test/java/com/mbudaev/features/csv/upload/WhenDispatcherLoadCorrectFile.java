package com.mbudaev.features.csv.upload;

import com.mbudaev.features.BaseTest;
import com.mbudaev.pages.DispatcherPage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.File;

/**
 * Created by Mikhail_Budaev on 09-Jun-16.
 */
@RunWith(SerenityRunner.class)
public class WhenDispatcherLoadCorrectFile extends BaseTest {


    private File file = new File("src/test/resource/correct_short_file.csv");

    @Before
    public void setUp() throws Exception {
        systemSteps.cleanDB();
        userSteps.onLoginForm.open();
        userSteps.onLoginForm.loginAsDispatcher();
    }

    @Test
    @Title("Load correct file")
    public void uploadFile() {
        System.out.println(file.getAbsolutePath());
        userSteps.onDispatcherPage.chooseFileToUpload(file);
        userSteps.onDispatcherPage.clickUploadFileButton();
        pages.currentPageAt(DispatcherPage.class);
        userSteps.onDispatcherPage.waitUploading();
    }

}
