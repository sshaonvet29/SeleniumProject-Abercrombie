package com.paxotech.abercrombie.qa.framework.pages;

import com.paxotech.abercrombie.qa.framework.ResourceFactory;
import org.openqa.selenium.WebDriver;

/**
 * Created by Aktar on 6/6/2016.
 */
public class Application {
    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private RegistrationPage registrationPage;
    private ProductSelectionPage productSelectionPage;
    private LoginPageWithExcelData loginPageWithExcelData;

    public Application(WebDriver driver){
        this.driver = driver;

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        productSelectionPage= new ProductSelectionPage(driver);
        loginPageWithExcelData = new LoginPageWithExcelData(driver);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void navigateToApplication(){
        driver.navigate().to(ResourceFactory.getInstance().getProperty("APP_URL").toString());
    }

    public HomePage homePage(){
        return homePage;
    }
    public LoginPage loginPage(){
        return loginPage;
    }
    public RegistrationPage registrationPage(){
        return registrationPage;
    }
    public ProductSelectionPage productSelectionPage(){
        return productSelectionPage;
    }
    public LoginPageWithExcelData loginPageWithExcelData(){
        return loginPageWithExcelData;
    }
}
