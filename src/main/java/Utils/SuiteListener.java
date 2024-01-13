package Utils;

import basePage.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IAnnotationTransformer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class SuiteListener implements ITestListener, IAnnotationTransformer {

    // Result from on test, if there are any failed test case so how it will take screenshot.This class basically maintain Screenshot.
    // Where it keeps the screenshot and how many times it will run.


    // it will give me all the failure screenshot.
    public void onTestFailure(ITestResult result){
      String fileName= System.getProperty("user.dir")+ File.separator+"screenshots"+File.separator+result.getMethod().getMethodName();
        File file1= ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(file1, new File(fileName+".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod){
        annotation.setRetryAnalyzer(RetryAnalyzer.class);
    }

}
