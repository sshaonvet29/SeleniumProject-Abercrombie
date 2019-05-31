package com.paxotech.abercrombie.qa.framework;
import com.paxotech.abercrombie.qa.framework.pages.Application;
import org.openqa.selenium.WebDriver;

/**
 * Created by PaxoTech Student on 6/6/2016.
 */
public class BaseSteps {
    protected WebDriver driver = DriverFactory.getInstance().getDriver();
    protected ResourceFactory resources = ResourceFactory.getInstance();
    protected Application abercrombie = new Application(driver);

}
