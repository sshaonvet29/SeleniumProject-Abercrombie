package com.paxotech.abercrombie.qa.framework.steps;

import com.paxotech.abercrombie.qa.framework.BaseSteps;
import com.paxotech.abercrombie.qa.framework.DriverFactory;
import com.paxotech.abercrombie.qa.framework.ResourceFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class AppSteps extends BaseSteps {

    @Given("^User can browse to an application$")
    public void user_can_browse_to_an_application() throws Throwable {
        driver.manage().deleteAllCookies();
    }

    @When("^Browse to the url$")
    public void browse_to_the_url() throws Throwable {
        String url = resources.getProperty("APP_URL");
        driver.navigate().to(url);
    }


}
