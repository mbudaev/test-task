package com.mbudaev.features.authentification;

import com.mbudaev.domain.User;
import com.mbudaev.features.BaseTest;
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
public class WhenUsernameOrPasswordCorrect extends BaseTest {

    public WhenUsernameOrPasswordCorrect(User user) {
        this.user = user;
    }

    @TestData
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {new User("dispatcher", "123")},
                {new User("driver1", "123")},
                {new User("driver2", "123")}
        });
    }

    private final User user;

    @Before
    public void setUp() throws Exception {
        systemSteps.cleanDB();
        userSteps.onLoginForm.open();
    }

    @Test
    @Title("Correct authentication test")
    public void invalidDriverLogin() {
        userSteps.onLoginForm.fillField(user.getLogin(), user.getPassword()).submit();
        userSteps.onPageHeader.loginNameIsEquals(user.getLogin());
    }

}
