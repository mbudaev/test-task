package com.mbudaev.steps;

import com.mbudaev.utils.DatabaseHelper;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by Mikhail_Budaev on 08-Jun-16.
 */
public class SystemSteps extends  ScenarioSteps{
    public DatabaseHelper db = DatabaseHelper.getInstance();

    @Step("Clean DB")
    public void cleanDB() throws Exception {
        db.clean();
    }


}
