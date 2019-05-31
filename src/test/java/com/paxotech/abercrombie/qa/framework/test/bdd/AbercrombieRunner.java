package com.paxotech.abercrombie.qa.framework.test.bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by PaxoTech Student on 7/12/2016.
 */


@RunWith(Cucumber.class)
@CucumberOptions(
        //dryRun = true,    *** dryRun: it doesn't run the script just show any steps is missing. By default it is false.
        //strict = true, *** if there is no staep missing then it will lets u run the script.
        //monochrome = true,
        //tags = { "@debug" },// ***run just only one script***
        //tags = { "@functional","@debug" }, /*AND*/
        //tags = { "@functional,@debug" }, /*OR*/
        //tags = { "@functional,@debug","@debug" }, /*AND-OR*/
        features = "src/test/resources/features/AbercrombieLogin.feature",
        glue = {"com.paxotech.abercrombie.qa.framework.steps"},
        plugin={
                "pretty:target/cucumber-test-report/cucumber-pretty.txt",
                "html:target/cucumber-test-report",
                "json:target/cucumber-test-report/cucumber-report.json",
                "junit:target/cucumber-test-report/test-report.xml",
                "json:target/test-report.json"
        }
)
public class AbercrombieRunner {
}
