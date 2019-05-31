package com.paxotech.abercrombie.qa.framework.steps;

import com.paxotech.abercrombie.qa.framework.BaseSteps;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by PaxoTech Student on 6/6/2016.
 */
public class LoginPageSteps extends BaseSteps {
    @When("^User click login button$")
    public void user_click_login_button() throws Throwable {
        abercrombie.homePage().signInSignInTab();
    }

    @Then("^Login page should show$")
    public void login_page_should_show() throws Throwable {
        String text = driver.findElement(By.xpath(".//*[@id='social-signon-form-sign-in']/div[3]/div/a")).getText();
        Assert.assertEquals(text,"Forgot Password?");
    }

    @When("^Enter \"([^\"]*)\" as email address$")
    public void enter_as_email_address(String email) throws Throwable {
        abercrombie.loginPage().enterEmailAddress(email);
    }

    @When("^Enter \"([^\"]*)\" as password$")
    public void enter_as_password(String password) throws Throwable {
        abercrombie.loginPage().enterPassword(password);

    }

    @When("^Click login$")
    public void click_login() throws Throwable {
        abercrombie.loginPage().clickLogin();

    }

    @Then("^Invalid email message display \"([^\"]*)\"$")
    public void invalid_email_message_display(String msg) throws Throwable {
        String text = driver.findElement(By.xpath(".//*[@id='social-signon-form-sign-in']/ul[2]/li/p")).getText();
        Assert.assertEquals(text,msg);
    }

    @Then("^Invalid password message display \"([^\"]*)\"$")
    public void invalid_password_message_display(String msg) throws Throwable {
        String text = driver.findElement(By.xpath(".//*[@id='social-signon-form-sign-in']/ul[2]/li/p")).getText();
        Assert.assertEquals(text,msg);
    }

    @When("^Welcome message shows \"([^\"]*)\"$")
    public void welcome_message_shows(String msg) throws Throwable {
        abercrombie.loginPage().verifyLogin(msg);

    }
    @Then("^User click on Logout button$")
    public void user_click_on_Logout_button() throws Throwable {
        abercrombie.loginPage().signOut();

    }




}
