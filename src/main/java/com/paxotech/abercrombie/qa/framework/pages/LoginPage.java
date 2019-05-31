package com.paxotech.abercrombie.qa.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

/**
 * Created by PaxoTech Student on 6/6/2016.
 */
public class LoginPage extends PageBase {

    private int TimeoutValue = 50;


    @FindBy(how= How.XPATH, using = ".//*[@id='email-sign-in']")
    private WebElement userNametextbox;

    @FindBy(how = How.XPATH, using = ".//*[@id='login-password-field-sign-in']")
    private WebElement userNamePassword;

    @FindBy(how = How.CSS, using = ".button.submit-button")
    private WebElement loginbutton;

    @FindBy(id = "util-account")
    private WebElement signedIn;

    @FindBy(xpath = ".//*[@id='primary-content']/div/section[1]/section/div[2]/h3")
    private WebElement varifyMsg;

    @FindBy(xpath = ".//*[@id='util-account-nav']/ul/li[1]/a")
    private WebElement myAccout;

    @FindBy(xpath = ".//*[@id='util-account-footer']/a")
    private WebElement tMyOrder;

    @FindBy(css = ".util-account__link.util-account__sign-out")
    private WebElement signOutButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);
    }




    //****************************Action********************************//

   /* public void logIn(String username, String password){
        userNametextbox.clear();
        userNametextbox.sendKeys(username);
        delayFor(3000);
        userNamePassword.clear();
        userNamePassword.sendKeys(password);
        delayFor(3000);
        WebElement loginButton=null;
        if (buttons !=null && buttons.size()>0) {
            loginButton = buttons.get(0);
        }
        loginButton.click();
    }*/

    public void enterEmailAddress(String email){
        highlight(userNametextbox);
        userNametextbox.sendKeys(email);
    }

    public void enterPassword(String password){
        highlight(userNamePassword);
        userNamePassword.sendKeys(password);
    }

    public void clickLogin(){
        highlight(loginbutton);
        loginbutton.click();
    }

    public void verifyLogin(String msg){
        String text = varifyMsg.getText();
        Assert.assertEquals(text,msg.toUpperCase());
        delayFor(3000);
    }

    public void signOut(){

        Actions action = new Actions(driver);
        action.moveToElement(signedIn).moveToElement(myAccout).moveToElement(tMyOrder).moveToElement(signOutButton).click().build().perform();
    delayFor(3000);
    }

    }









