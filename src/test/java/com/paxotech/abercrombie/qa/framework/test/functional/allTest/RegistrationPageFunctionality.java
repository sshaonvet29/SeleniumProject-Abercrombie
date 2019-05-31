package com.paxotech.abercrombie.qa.framework.test.functional.allTest;

import com.paxotech.abercrombie.qa.framework.ScriptBase;
import org.testng.annotations.Test;

/**
 * Created by PaxoTech Student on 7/7/2016.
 */
public class RegistrationPageFunctionality extends ScriptBase {

    @Test
    public void registrationTest(){
        abercrombie().navigateToApplication();
        abercrombie().homePage().closeInpiratonAdd();
        abercrombie().homePage().createAccountTab();
        abercrombie().registrationPage().sendEmailAddress("addto1@gmail.com");
        abercrombie().registrationPage().sendPassword("paxotech123");
        abercrombie().registrationPage().continueButton();
        abercrombie().registrationPage().sendFirstName("paxo");
        abercrombie().registrationPage().sendLastName("tech");
        abercrombie().registrationPage().sendCellNumber("3478907604");
        abercrombie().registrationPage().creatAccountButton();
        abercrombie().registrationPage().verifyCreateAccount();
        abercrombie().registrationPage().setCountry("United States");
        abercrombie().registrationPage().setAddress("13980 85th dr");
        abercrombie().registrationPage().selectPoBox();
        abercrombie().registrationPage().setCity("jamaica");
        abercrombie().registrationPage().setState("NY");
        abercrombie().registrationPage().setPostalCode("11435");
        abercrombie().registrationPage().checkHollister();
        abercrombie().registrationPage().setGender("Male");
        abercrombie().registrationPage().setMonth("01");
        abercrombie().registrationPage().setBirthDay("06");
        abercrombie().registrationPage().favoriteCatagories();


    }

}
