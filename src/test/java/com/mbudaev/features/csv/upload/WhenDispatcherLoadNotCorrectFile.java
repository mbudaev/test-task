package com.mbudaev.features.csv.upload;

import com.mbudaev.features.BaseTest;
import com.mbudaev.pages.DispatcherPage;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.TestData;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Mikhail_Budaev on 09-Jun-16.
 */
@RunWith(SerenityParameterizedRunner.class)
public class WhenDispatcherLoadNotCorrectFile extends BaseTest {


    public WhenDispatcherLoadNotCorrectFile(File file) {
        this.file = file;
    }

    @TestData
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {new File("src/test/resource/file_without_header.csv")},
                {new File("src/test/resource/file_without_data.csv")},
                {new File("src/test/resource/file_without_extension")},
                {new File("src/test/resource/file_empty.csv")}
        });
    }
    //TODO Need assert for failure uploading

    private final File file;


    @Before
    public void setUp() throws Exception {
        systemSteps.cleanDB();
        userSteps.onLoginForm.open();
        userSteps.onLoginForm.loginAsDispatcher();
    }


    @Test
    @Title("Click Update button without file to upload")
    public void uploadFile() {
        userSteps.onDispatcherPage.chooseFileToUpload(file);
        userSteps.onDispatcherPage.clickUploadFileButton();
        pages.currentPageAt(DispatcherPage.class);

    }
}

