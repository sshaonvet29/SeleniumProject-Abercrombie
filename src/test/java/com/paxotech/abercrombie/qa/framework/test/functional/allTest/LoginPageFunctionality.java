package com.paxotech.abercrombie.qa.framework.test.functional.allTest;

import com.paxotech.abercrombie.qa.framework.ScriptBase;
import org.testng.annotations.Test;

public class LoginPageFunctionality extends ScriptBase {


    @Test
    public void validLoginTest() {
        abercrombie().navigateToApplication();
        abercrombie().homePage().closeInpiratonAdd();
        abercrombie().homePage().signInSignInTab();
        abercrombie().loginPage().enterEmailAddress("aktar203@gmail.com");
        abercrombie().loginPage().enterPassword("paxotech123");
        abercrombie().loginPage().clickLogin();
        abercrombie().loginPage().verifyLogin("Welcome, m");
        abercrombie().loginPage().signOut();

    }

    @Test(priority = 1)
    public void inValidLoginTest() {
        abercrombie().navigateToApplication();
        abercrombie().homePage().closeInpiratonAdd();
        abercrombie().homePage().signInSignInTab();
        abercrombie().loginPage().enterEmailAddress("aktar203@gmail.com");
        abercrombie().loginPage().enterPassword("paxotech");
        abercrombie().loginPage().clickLogin();
        abercrombie().loginPage().verifyLogin("The password you entered does not match the email provided.");


    }

    @Test(enabled = false)
    public void inValidPasswordTest() {
        abercrombie().navigateToApplication();
        abercrombie().homePage().closeInpiratonAdd();
        abercrombie().homePage().signInSignInTab();
        abercrombie().loginPage().enterEmailAddress("aktar203@gmail.com");
        abercrombie().loginPage().enterPassword("paxotech");
        abercrombie().loginPage().clickLogin();
        abercrombie().loginPage().verifyLogin("The password you entered does not match the email provided.");

    }
}