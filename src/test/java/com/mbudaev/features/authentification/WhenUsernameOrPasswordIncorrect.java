package com.mbudaev.features.authentification;

import com.mbudaev.domain.User;
import com.mbudaev.features.BaseTest;
import com.mbudaev.pages.LoginPage;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.TestData;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Mikhail_Budaev on 07-Jun-16.
 */
@RunWith(SerenityParameterizedRunner.class)
public class WhenUsernameOrPasswordIncorrect extends BaseTest {
    public WhenUsernameOrPasswordIncorrect(User user) {
        this.user = user;
    }

    @TestData
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {new User("Vasya", "")},
                {new User("", "123")},
                {new User("Vasya", "123")},
                {new User("123", "zfdsg")},
                {new User("driver1", "")},
                {new User("driver1", "111")},
                {new User("", "123")},
                {new User("driver2", "")},
                {new User("driver2", "122")},
                {new User("dispatcher", "")},
                {new User("dispatcher", "111")},
                {new User("dispatcher", "asdgf")}
        });
    }

    private final User user;

    @Before
    public void setUp() throws Exception {
        userSteps.onLoginForm.open();
    }

    @Test
    @Title("Incorrect authentication test")
    public void invalidDriverLogin() {
        userSteps.onLoginForm.fill_field(user.getLogin(), user.getPassword()).submit();
        pages.currentPageAt(LoginPage.class);
    }


}
