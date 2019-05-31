package com.paxotech.abercrombie.qa.framework;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.PhantomJsDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {

    public static final String USERNAME = "maktar1";
    public static final String AUTOMATE_KEY = "H6qhzUGJsyxmewDSuwmM";
    public static final String REMOTE_URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    private DriverFactory()
    {
        //Do-nothing..Do not allow to initialize this class from outside
    }
    private static DriverFactory instance = new DriverFactory();

    public static DriverFactory getInstance()
    {
        return instance;
    }

    ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>() // thread local driver object for webdriver
    {
        @Override
        protected WebDriver initialValue()
        {
            URL SELENIUM_HUB = null;

            try {
                SELENIUM_HUB = new URL("172.16.213.1:4444/wd/hub");
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

            String driverName = ResourceFactory.getInstance().getProperty("DRIVER").toString();
            if(driverName.toUpperCase().contentEquals("CHROME")){
                ChromeDriverManager.getInstance().setup();
                return new ChromeDriver();

               /* String chromeBinayPath;
                chromeBinayPath =  System.getProperty("user.dir") + "/src/main/resources/driver/32/chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", chromeBinayPath);
                return new ChromeDriver();*/
            }
            else if(driverName.toUpperCase().contentEquals("IE")){
                String ieBinayPath;
                ieBinayPath = System.getProperty("user.dir") + "/src/main/resources/driver/32/IEDriverServer.exe";
                System.setProperty("webdriver.ie.driver", ieBinayPath );
                return new InternetExplorerDriver();
            }
            else if(driverName.toUpperCase().contentEquals("FIREFOX")){
                return new FirefoxDriver();
              
            }
            else if(driverName.toUpperCase().contentEquals("PHANTOMJS")){
                PhantomJsDriverManager.getInstance().setup();
                return new PhantomJSDriver();
                /*String phantomBinayPath;
                phantomBinayPath = System.getProperty("user.dir") + "/src/main/resources/driver/32/phantomjs.exe";
                System.setProperty("phantomjs.binary.path", phantomBinayPath);
                return new PhantomJSDriver();*/
            }
            else if(driverName.toUpperCase().contentEquals("R-FF")){
                WebDriver driver = null;
                DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                // driver = new RemoteWebDriver(new URL("http://10.10.30.35:4444/wd/hub"),capabilities);
                driver = new RemoteWebDriver(SELENIUM_HUB,capabilities);
                return driver;
            }
            else if(driverName.toUpperCase().contentEquals("R-CH")){
                WebDriver driver = null;
                DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                driver = new RemoteWebDriver(SELENIUM_HUB,capabilities);
                return driver;
            }
            else if(driverName.toUpperCase().contentEquals("BS-FF")){
               DesiredCapabilities caps = new DesiredCapabilities();

                caps.setCapability("browser", "Firefox");
                caps.setCapability("browser_version", "46.0");
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "7");
                caps.setCapability("resolution", "1024x768");

                caps.setCapability("browserstack.debug", "true");

                WebDriver driver = null;
                try {
                    driver = new RemoteWebDriver(new URL(REMOTE_URL), caps);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                return driver;
            }
            else {
                return new FirefoxDriver(); // can be replaced with other browser drivers
            }
        }
    };

    public WebDriver getDriver() // call this method to get the driver object and launch the browser
    {
        return driver.get();
    }

    public void removeDriver() // Quits the driver and closes the browser
    {
        //driver.get().quit();
        //driver.remove();
    }
}
