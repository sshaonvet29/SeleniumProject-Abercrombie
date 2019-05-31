package com.paxotech.abercrombie.qa.framework.test.functional.allTest;

import com.paxotech.abercrombie.qa.framework.ScriptBase;
import org.testng.annotations.Test;


/**
 * Created by PaxoTech Student on 7/8/2016.
 */
public class CheckOutFunctionality extends ScriptBase {
   @Test
    public void checkoutTest(){
        abercrombie().navigateToApplication();
        abercrombie().homePage().closeInpiratonAdd();
        abercrombie().homePage().mensTab();
        abercrombie().productSelectionPage().afEssentialsTab();
        abercrombie().productSelectionPage().setCatagories("The Crew");
        abercrombie().productSelectionPage().setSize("S");
        abercrombie().productSelectionPage().setColor("blue");
        //abercrombie().productSelectionPage().setSleeveLength("Long Sleeve");
        //abercrombie().productSelectionPage().setFit("Classic");
        abercrombie().productSelectionPage().selectIconikTee();
        abercrombie().productSelectionPage().fianlSizeSelection("XL");
        abercrombie().productSelectionPage().addToBag();
        abercrombie().productSelectionPage().shoppingBag();
        abercrombie().productSelectionPage().checkOutButton();
        abercrombie().productSelectionPage().setFirstName("Paxo");
        abercrombie().productSelectionPage().setLastName("Tech");
        abercrombie().productSelectionPage().setAddress("13930 85th Rd");
        abercrombie().productSelectionPage().setApt("1P");
        abercrombie().productSelectionPage().setCity("Jamaica");
        abercrombie().productSelectionPage().setState("NY");
        abercrombie().productSelectionPage().setZipCode("11435");
        abercrombie().productSelectionPage().setShippingMethod();
        abercrombie().productSelectionPage().nextPaymentOption();
        abercrombie().productSelectionPage().cardNumField("1234567890");
        abercrombie().productSelectionPage().paymentType("003");
        abercrombie().productSelectionPage().expirationMonth("08");
        abercrombie().productSelectionPage().expirationYear("2020");
        abercrombie().productSelectionPage().securityCode("453");
        abercrombie().productSelectionPage().contactPhone("7185670954");
        abercrombie().productSelectionPage().contactEmail("paxotech@gmail.com");
        abercrombie().productSelectionPage().placeOrderLink();
        abercrombie().productSelectionPage().verifyPayment("Please correct the highlighted fields.");
        abercrombie().productSelectionPage().removeItem();

    }
}
