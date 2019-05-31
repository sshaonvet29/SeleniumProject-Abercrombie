package com.paxotech.abercrombie.qa.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by PaxoTech Student on 6/12/2016.
 */
public class RegistrationPage extends PageBase {
    private int TimeoutValue = 30;
    public RegistrationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);
    }

    //****************************************************************************************//
    @FindBy(how = How.ID, using = "email-create-account")
    private WebElement emailTextBox;

    @FindBy(how = How.ID, using = "login-password-field-create-account")
    private WebElement passwordTextBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='social-signon-form-create-account']/div[4]/ul/li/input")
    private WebElement conButton;

    @FindBy(how = How.ID, using = "login-firstname-field")
    private WebElement fName;

    @FindBy(how = How.ID, using = "login-lastname-field")
    private WebElement laName;

    @FindBy(how = How.ID, using = "login-phone-field")
    private WebElement cellNum;

    @FindBy(how = How.ID, using = "optIn")
    private WebElement cK;

    @FindBy(how = How.XPATH, using = ".//*[@id='login-form--hidden']/div[2]/ul/li/input")
    private WebElement createAc;

    @FindBy(how = How.XPATH, using = ".//*[@id='country-field']")
    private WebElement listOfcountry;

    @FindBy(how = How.ID, using = "address-field")
    private WebElement address;

    @FindBy(how = How.ID, using = "pobox-field")
    private WebElement poBox;

    @FindBy(how = How.ID, using = "city-field")
    private WebElement city;

    @FindBy(how = How.ID, using = "us-state-field")
    private WebElement state;

    @FindBy(how = How.ID, using = "zipcodefield")
    private WebElement postalCode;

    @FindBy(how = How.ID, using = "email-brand-hol-field")
    private WebElement offerHollis;

    @FindBy(how = How.ID, using = "gender-field")
    private WebElement gender;

    @FindBy(how = How.ID, using = "birthMonth")
    private WebElement month;

    @FindBy(how = How.ID, using = "birthDay")
    private WebElement bDay;

    @FindBy(how = How.XPATH, using = ".//*[@id='favorite-glb_hoodies']")
    private WebElement fCat;

    @FindBy(xpath = ".//*[@id='personalize-account']/div[3]/ul/li/a")
    private WebElement savButton;


    //*****************************Action***************************//

    public void sendEmailAddress(String email){
        highlight(emailTextBox);
        emailTextBox.clear();
        emailTextBox.sendKeys(email);
        delayFor(2000);
    }

    public void sendPassword(String passWord){
        highlight(passwordTextBox);
        passwordTextBox.clear();
        passwordTextBox.sendKeys(passWord);
        delayFor(2000);
    }

    public void continueButton(){
        highlight(conButton);
        conButton.click();
        delayFor(2000);
    }

    public void sendFirstName(String fastName){
        highlight(fName);
        fName.clear();
        fName.sendKeys(fastName);

    }


    public void sendLastName(String lastName){
        highlight(laName);
        laName.clear();
        laName.sendKeys(lastName);

    }

    public void sendCellNumber(String number){
        highlight(cellNum);
        cellNum.clear();
        cellNum.sendKeys(number);
        delayFor(2000);


    }

    public void creatAccountButton(){
        jsClick(createAc);

       /* JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", createAc);*/
       // createAc.click();
        delayFor(3000);
    }

    public void verifyCreateAccount( ){
        String text = driver.findElement(By.xpath(".//*[@id='primary-content']/div[1]/h2")).getText();
        Assert.assertEquals(text,"You're Signed Up! Now receive Free Shipping every day on orders $75 and up when signed in! Don't forget to complete the form below to personalize your Shopping Experience!".toUpperCase());
        delayFor(3000);
}

    public void setCountry(String countryName){
        Select select = new Select(listOfcountry);
        select.selectByVisibleText(countryName);
        delayFor(2000);

    }

    public void setAddress(String add){
        highlight(address);
        address.clear();
        address.sendKeys(add);

    }

    public void selectPoBox() {
        if (!poBox.isSelected()) {
            poBox.click();

        }

    }

    public void setCity(String cityName){
        highlight(city);
        city.clear();
        city.sendKeys(cityName);
        delayFor(2000);
    }

    public void setState(String stateName){
        Select select = new Select(state);
        select.selectByValue(stateName);
        delayFor(2000);

    }

    public void setPostalCode(String codeNum){

        postalCode.clear();
        postalCode.sendKeys(codeNum);
        delayFor(2000);
    }

    public void checkHollister(){
        if(!offerHollis.isSelected()){
            offerHollis.click();
            delayFor(2000);

        }
    }

    public void setGender(String gen){
        Select select = new Select(gender);
        select.selectByVisibleText(gen);
        delayFor(2000);

    }


    public void setMonth(String value){
        Select select = new Select(month);
        select.selectByValue(value);
        delayFor(2000);
    }

    public void setBirthDay(String day){
        Select select = new Select(bDay);
        select.selectByValue(day);
        delayFor(2000);
    }

    public void favoriteCatagories() {

        List<WebElement> radios = fCat.findElements(By.tagName("input"));
        for (WebElement el : radios) {
            if (el.getAttribute("value").contentEquals("1")) {
                el.click();
                break;
            }
        }

    }


    public void clickSaveButton() {
        jsClick(savButton);

        delayFor(3000);

    }


}
