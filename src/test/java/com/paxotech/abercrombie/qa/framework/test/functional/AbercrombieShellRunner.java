package com.paxotech.abercrombie.qa.framework.test.functional;


import com.paxotech.abercrombie.qa.framework.ParallelSuite;
import com.paxotech.abercrombie.qa.framework.test.functional.allTest.CheckOutFunctionality;
import com.paxotech.abercrombie.qa.framework.test.functional.allTest.HomePageFuntionality;
import com.paxotech.abercrombie.qa.framework.test.functional.allTest.LoginPageFunctionality;
import com.paxotech.abercrombie.qa.framework.test.functional.allTest.RegistrationPageFunctionality;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//@RunWith(Suite.class)
@RunWith(ParallelSuite.class)
@Suite.SuiteClasses({
        HomePageFuntionality.class,
        //RegistrationPageFunctionality.class,
        LoginPageFunctionality.class,
        //CheckOutFunctionality.class

})
public class AbercrombieShellRunner {
}
