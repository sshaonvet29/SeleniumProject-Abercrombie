package com.paxotech.abercrombie.qa.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created by PaxoTech Student on 6/6/2016.
 */
public class HomePage extends PageBase{
    //private WebDriver driver = null;
    private int TimeoutValue = 30;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,TimeoutValue),this);
    }

    @FindBy(how = How.XPATH,using = ".//*[@id='simplemodal-container']/a")
    private WebElement inspirationAdd;

    @FindBy(how = How.CSS,using = ".genericESpot>a")
    private WebElement whatsNew;

    @FindBy(how = How.ID,using = "division_12202")
    private WebElement mens;


    @FindBy(how = How.ID, using = "division_12203")
    private WebElement womens;

    @FindBy(how = How.ID, using = "division_176705")
    private WebElement kids;

    @FindBy(how = How.ID, using = "division_177205")
    private WebElement sale;

    @FindBy(how = How.XPATH, using ="//*[contains(text(), 'Sign In')]")
    private WebElement signIn;
    @FindBy(how = How.XPATH, using =".//*[@id='util-account-nav']/ul/li[1]/a")
    private WebElement signInSignIn;

    @FindBy(how = How.XPATH, using =".//*[@id='util-account-nav']/ul/li[2]/a")
    private WebElement createAc;

    @FindBy(how = How.XPATH, using =".//*[@id='util-account-nav']/ul/li[3]/a")
    private WebElement tMyOrder;

    @FindBy(how = How.XPATH, using =".//*[@id='util-wishlist']/a")
    private WebElement mySaves;

    @FindBy(how = How.XPATH, using =".//*[@id='util-minicart']/a")
    private WebElement bags;



    //**************************Action******************************************//
    public void checkTitle(){;
    String title = driver.getTitle();
    Assert.assertEquals(title, "Abercrombie & Fitch | Authentic American clothing since 1892");
    System.out.println(title);
    }

    public void closeInpiratonAdd(){
        highlight(inspirationAdd);
        inspirationAdd.click();
        delayFor(2000);
    }

    public void whatsNewTab(){
        highlight(whatsNew);
        whatsNew.click();
        delayFor(2000);
    }

    public void mensTab(){
        highlight(mens);
        mens.click();
        delayFor(2000);
    }

    public void womensTab(){
        highlight(womens);
        womens.click();
        delayFor(2000);
    }

    public void kidsTab(){
        highlight(kids);
        kids.click();
        delayFor(2000);
    }

    public void saleTab() {
        highlight(sale);
        sale.click();
        delayFor(2000);
    }

    /*public void signInSignInTab() {
        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {

        }
        Actions action = new Actions(driver);
        WebElement signIn = driver.findElement(By.xpath("/*//*[@id='util-account']/a"));
        WebElement memberSignIn = driver.findElement(By.xpath("/*//*[@id='util-account-nav']/ul/li/a[contains(.,'Sign In')]"));

        action.moveToElement(signIn).moveToElement(memberSignIn).click().build().perform();
    }*/


    public void signInSignInTab() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Actions action = new Actions(driver);
        action.moveToElement(signIn).moveToElement(signInSignIn).click().build().perform();
    }

    public void createAccountTab() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Actions action = new Actions(driver);
        action.moveToElement(signIn).moveToElement(signInSignIn).moveToElement(createAc).click().build().perform();
        delayFor(2000);
    }
    public void verifyCreateAcc(){
        String msg = driver.findElement(By.xpath(".//*[@id='tabpanel-2-account-tabs']/section/h1")).getText();
        Assert.assertEquals(msg,"Members get free shipping on orders over $75!");
        System.out.println(msg);
        delayFor(3000);
    }


    public void trackMyOrderTab() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Actions action = new Actions(driver);
        action.moveToElement(signIn).moveToElement(signInSignIn).moveToElement(createAc).moveToElement(tMyOrder).click().build().perform();
    }

     public void mySavesTab(){
         highlight(mySaves);
         mySaves.click();
         delayFor(2000);
     }

    public void bagTab(){
        bags.click();
        delayFor(2000);
    }

}
