package com.paxotech.abercrombie.qa.framework.steps;

import com.paxotech.abercrombie.qa.framework.BaseSteps;
import cucumber.api.java.en.Then;

/**
 * Created by PaxoTech Student on 6/6/2016.
 */
public class HomePageSteps extends BaseSteps {
    @Then("^abercrombie home page should show$")
    public void abercrombie_home_page_should_show() throws Throwable {
        abercrombie.homePage().closeInpiratonAdd();
        abercrombie.homePage().checkTitle();

    }
}
