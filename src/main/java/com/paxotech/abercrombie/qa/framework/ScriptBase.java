package com.paxotech.abercrombie.qa.framework;
import com.paxotech.abercrombie.qa.framework.pages.Application;


import com.paxovision.execution.reporter.listener.ReporterTestListener;
import com.paxovision.execution.reporter.service.ReporterService;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners({ReporterTestListener.class})
public class ScriptBase {

    protected ReporterService reporter = ReporterService.reporter();
    protected WebDriver driver;
    private ThreadLocal<Application> threadedApplication = null;


    @BeforeClass
    public void beforeclass(){
        reporter.setReportPath(System.getProperty("user.dir")+"/test-output/htmlReport/");
        reporter.setReportName("Abercrombie");
        reporter.setReportTitle("Abercrombie Functional Test");
        reporter.setCreateUniqueFileName(false);
    }






    @BeforeMethod
    public void startUp(){
        driver = DriverFactory.getInstance().getDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        threadedApplication = new ThreadLocal<Application>(){;
            @Override
            protected Application initialValue()
            {
                return new Application(DriverFactory.getInstance().getDriver());
            }
        };

    }

    public Application abercrombie(){
        return threadedApplication.get();
    }

    @AfterMethod
    public void tearDown(){
        //DriverFactory.getInstance().removeDriver();

    }
}