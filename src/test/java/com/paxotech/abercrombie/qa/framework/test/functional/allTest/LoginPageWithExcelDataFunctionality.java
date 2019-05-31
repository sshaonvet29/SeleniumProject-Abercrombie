package com.paxotech.abercrombie.qa.framework.test.functional.allTest;

import com.paxotech.abercrombie.qa.framework.ScriptBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by PaxoTech Student on 7/15/2016.
 */
public class LoginPageWithExcelDataFunctionality extends ScriptBase {
    @Test
    public void validLoginTest() throws IOException {
        abercrombie().navigateToApplication();
        abercrombie().homePage().closeInpiratonAdd();
        abercrombie().homePage().signInSignInTab();
        abercrombie().loginPageWithExcelData().enterLoginCredentials();


    }
}