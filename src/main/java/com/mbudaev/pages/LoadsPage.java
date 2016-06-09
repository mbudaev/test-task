package com.mbudaev.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import org.openqa.selenium.WebDriver;

/**
 * Created by Mikhail_Budaev on 09-Jun-16.
 */
@NamedUrls(
        {
                @NamedUrl(name = "loads", url = "/loads"),
                @NamedUrl(name = "loads.by.date", url = "/loads?date={1}")
        }
)
public class LoadsPage extends PageObject{
    public LoadsPage(WebDriver driver) {
        super(driver);
    }

}
