package com.mbudaev.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import org.openqa.selenium.WebDriver;

/**
 * Created by Mikhail_Budaev on 08-Jun-16.
 */
@NamedUrls(
        {
                @NamedUrl(name = "loads.by.id", url = "/loads/{1}/routing")
        }
)
@At("#HOST/loads/.*./routing")
public class RoutingManagerPage extends PageObject {
    public RoutingManagerPage(WebDriver driver) {
        super(driver);
    }

}
