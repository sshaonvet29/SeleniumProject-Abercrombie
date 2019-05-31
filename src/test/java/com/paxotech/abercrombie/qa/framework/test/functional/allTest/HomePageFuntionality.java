package com.paxotech.abercrombie.qa.framework.test.functional.allTest;

import com.paxotech.abercrombie.qa.framework.Retry;
import com.paxotech.abercrombie.qa.framework.ScriptBase;
import com.paxotech.abercrombie.qa.framework.pages.PageBase;
import org.testng.annotations.Test;


/**
 * Created by PaxoTech Student on 6/10/2016.
 */
public class HomePageFuntionality extends ScriptBase{

    @Test(retryAnalyzer = Retry.class)

    public void homePageTest(){

        abercrombie().navigateToApplication();
        abercrombie().homePage().checkTitle();
        abercrombie().homePage().closeInpiratonAdd();
        abercrombie().homePage().whatsNewTab();
        abercrombie().homePage().mensTab();
        abercrombie().homePage().womensTab();
        abercrombie().homePage().kidsTab();
        abercrombie().homePage().saleTab();
        abercrombie().homePage().signInSignInTab();
        abercrombie().homePage().createAccountTab();
        abercrombie().homePage().verifyCreateAcc();
        abercrombie().homePage().trackMyOrderTab();
        abercrombie().homePage().mySavesTab();
        abercrombie().homePage().bagTab();


    }



    }

