package Utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    // purpose--> When I run my test cases and if it is failed then I want to run it again 2nd time. So automatically
    // it will run my test script as many time as I want.


    int count = 0;
    int retryCount = 2; // 2 = how many time you want to run the test script

    public boolean retry(ITestResult result) {
        while (count < retryCount) {
            count++;
            return true;
        }
        return false;
    }

}