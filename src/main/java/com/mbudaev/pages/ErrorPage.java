package com.mbudaev.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.sourceforge.htmlunit.corejs.javascript.ast.Name;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Mikhail_Budaev on 09-Jun-16.
 */

@NamedUrls({
        @NamedUrl(name = "404", url = "/404"),
        @NamedUrl(name = "422", url = "/422"),
        @NamedUrl(name = "500", url = "/500")
})
@At(urls = {"#HOST/404", "#HOST/422", "#HOST/500"})
public class ErrorPage extends PageObject {
    public ErrorPage(WebDriver driver) {
        super(driver);
    }

}
