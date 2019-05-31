package com.paxotech.abercrombie.qa.framework.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.lift.find.XPathFinder;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductSelectionPage extends PageBase {

    private int TimeoutValue = 30;

    public ProductSelectionPage(WebDriver driver) {
        super(driver);

        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);

    }

//***********************************************************************************************************

    @FindBy(linkText = "A&F Essentials")
    private WebElement essentials;

    @FindBy(xpath = "//span[text()='Category']")
    private WebElement catBox;

    @FindBy(xpath = "//span[text()='Size ']")
    private WebElement sizeBox;

    @FindBy(xpath = "//span[text()='Color ']")
    private WebElement colorBox;

    @FindBy(xpath = "//span[text()='Sleeve Length']")
    private WebElement sleeveBox;

    @FindBy(xpath = "//span[text()='Fit']")
    private WebElement fitBox;

    @FindBy(xpath = ".//*[@id='pid-6969073']/div[3]/div[1]/h2/a")
    private WebElement iTee;

    @FindBy(css = ".action.button.submit")
     private WebElement aTBag;

    @FindBy(xpath = ".//*[@id='util-minicart']/a")
    private WebElement bag;

    @FindBy(xpath = ".//*[@id='mini-cart-checkout']")
    private WebElement bDetails;

    @FindBy(xpath = ".//*[@id='shop-bag-checkout']/a")
    private WebElement chOut;

    @FindBy(xpath = ".//*[@id='first-name-field']")
    private WebElement fNameTextBox;

    @FindBy(xpath = ".//*[@id='last-name-field']")
    private WebElement lNameTextBox;

    @FindBy(xpath = ".//*[@id='address-field']")
    private WebElement sAddressTextBox;

    @FindBy(xpath = ".//*[@id='address-2-field']")
    private WebElement aptTextBox;


    @FindBy(id = "city-field")
    private WebElement cityTextBox;

    @FindBy(xpath = ".//*[@id='us-state-field']")
    private WebElement stateTextBox;

    @FindBy(xpath = ".//*[@id='zip-code-field']")
    private WebElement zipCodeBox;

    @FindBy(xpath = ".//*[@id='shippingMethods']/ul/li[2]/label/em")
    private WebElement sMethodBox;

    @FindBy(linkText = "NEXT - PAYMENT OPTIONS")
    private WebElement payOptionButton;

    @FindBy(id = "card-number-field")
    private WebElement cNum;

    @FindBy(xpath = ".//*[@id='card-brand-field']")
    private WebElement pType;

    @FindBy(xpath = ".//*[@id='card-exp-month']")
    private WebElement exMonth;

    @FindBy(xpath = ".//*[@id='card-exp-year']")
    private WebElement exYear;

    @FindBy(xpath = ".//*[@id='csv-field']")
    private WebElement sCode;

    @FindBy(xpath = ".//*[@id='pay-phone-field']")
    private WebElement conPhone;

    @FindBy(xpath = ".//*[@id='pay-email-field']")
    private WebElement conEmail;

    @FindBy(xpath = ".//*[@id='checkoutLink']")
    private WebElement pOrder;

    @FindBy(xpath = ".//*[@id='confirm']/div[4]/ul/li")
    private WebElement veryfyText;

    @FindBy(xpath = "//a[contains(text(),'Remove')]")
    private WebElement removeButton;

    //***************************************Action************************************************************


    public void afEssentialsTab() {
        highlight(essentials);
        essentials.click();
        delayFor(3000);
    }

    public void setCatagories(String catagory) {

        //JavascriptExecutor jse = (JavascriptExecutor)driver;
        //jse.executeScript("window.scrollBy(0,550)", "");
        highlight(catBox);
        catBox.click();
        WebElement catagoryLink = driver.findElement(By.xpath("//p[text()='" +catagory+ "']"));
        catagoryLink.click();
        delayFor(3000);

    }

    public void setSize(String size) {
        highlight(sizeBox);
        sizeBox.click();
        WebElement sizeLink = driver.findElement(By.xpath("//p[text()='" +size+ "']"));
        sizeLink.click();
        delayFor(3000);
    }

    public void setColor(String color) {
        highlight(colorBox);
        colorBox.click();
        WebElement colorLink = driver.findElement(By.xpath("//p[text()='" +color+ "']"));
        colorLink.click();
        delayFor(3000);
    }

    public void setSleeveLength(String sleeveLength) {
        highlight(sleeveBox);
        sleeveBox.click();
        WebElement sleeveLink = driver.findElement(By.xpath("//span[text()='" + sleeveLength + "']"));
        sleeveLink.click();
        delayFor(3000);
    }

    public void setFit(String fit) {
        highlight(fitBox);
        fitBox.click();
        WebElement fitLink = driver.findElement(By.xpath("//span[text()='" + fit + "']"));
        fitLink.click();
        delayFor(3000);

    }

    public void selectIconikTee(){
        highlight(iTee);
        iTee.click();
        delayFor(3000);

    }

    public void fianlSizeSelection(String fsize){
        WebElement sizeSelect;
        sizeSelect=driver.findElement(By.xpath("//span[text()='"+fsize+"']"));
        sizeSelect.click();
        delayFor(3000);

    }

    public void addToBag(){
        highlight(aTBag);
        aTBag.click();
        delayFor(3000);
    }

    public void shoppingBag(){
        Actions action= new Actions(driver);
        action.moveToElement(bag).moveToElement(bDetails).click().build().perform();
        delayFor(5000);
    }

    public void checkOutButton(){
        highlight(chOut);
        chOut.click();
        delayFor(3000);

    }

    public void setFirstName(String firstName){
        highlight(fNameTextBox);
        fNameTextBox.clear();
        fNameTextBox.sendKeys(firstName);
        delayFor(2000);
    }

    public void setLastName(String lastName){
        highlight(lNameTextBox);
        lNameTextBox.clear();
        lNameTextBox.sendKeys(lastName);
        delayFor(2000);
    }
     public void setAddress(String address){
         highlight(sAddressTextBox);
         sAddressTextBox.clear();
         sAddressTextBox.sendKeys(address);
         delayFor(2000);
     }

    public void setApt(String apt){
        highlight(aptTextBox);
        aptTextBox.clear();
        aptTextBox.sendKeys(apt);
        delayFor(2000);
    }

    public void setCity(String city){
        highlight(cityTextBox);
        cityTextBox.clear();
        cityTextBox.sendKeys(city);
        delayFor(2000);
    }

    public void setState(String value){
        Select state = new Select(stateTextBox);
        state.selectByValue(value);
        delayFor(3000);
    }

    public void setZipCode(String code){
        highlight(zipCodeBox);
        zipCodeBox.clear();
        zipCodeBox.sendKeys(code);

        delayFor(2000);
    }

    public void setShippingMethod(){
        highlight(sMethodBox);
        sMethodBox.click();
        delayFor(2000);

    }

    public void nextPaymentOption(){
        highlight(payOptionButton);
        payOptionButton.click();
        delayFor(3000);

    }

    public void cardNumField(String cardNo){
        highlight(cNum);
        cNum.clear();
        cNum.sendKeys(cardNo);
        delayFor(2000);
    }

    public void paymentType(String payment){
        Select paymentOption = new Select(pType);
        paymentOption.selectByValue(payment);
        delayFor(3000);
    }

    public void expirationMonth(String month){
        Select monthExp = new Select(exMonth);
        monthExp.selectByValue(month);
        delayFor(3000);
    }

    public void expirationYear(String year){
        Select yearExp = new Select(exYear);
        yearExp.selectByValue(year);
        delayFor(3000);
    }

    public void securityCode(String code){
        highlight(sCode);
        sCode.clear();
        sCode.sendKeys(code);
        delayFor(2000);

    }

    public void contactPhone(String phone){
        highlight(conPhone);
        conPhone.clear();
        conPhone.sendKeys(phone);
        delayFor(2000);
    }

    public void contactEmail(String email){
        highlight(conEmail);
        conEmail.clear();
        conEmail.sendKeys(email);
        delayFor(2000);

    }

    public void placeOrderLink(){
        pOrder.click();
        delayFor(2000);

    }

    public void verifyPayment(String  msg ){
        String text = veryfyText.getText();
        Assert.assertEquals(text,msg.toUpperCase());
        delayFor(2000);
    }

    public void removeItem(){
        highlight(removeButton);
        removeButton.click();
        delayFor(3000);
    }

}
