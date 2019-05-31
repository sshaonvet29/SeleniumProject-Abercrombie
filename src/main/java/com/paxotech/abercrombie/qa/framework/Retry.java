package com.paxotech.abercrombie.qa.framework;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * Created by PaxoTech Student on 7/18/2016.
 */
public class Retry implements IRetryAnalyzer {
    private int retryCount = 0;
    private int maxRetryCount = 1;

    public boolean retry(ITestResult result) {

        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}
