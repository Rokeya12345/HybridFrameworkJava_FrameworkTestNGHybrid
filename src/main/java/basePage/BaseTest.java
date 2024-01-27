package basePage;

import Utils.Constants;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Hostname;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.lang.reflect.Method;
import java.time.Duration;

public class BaseTest {

   public static WebDriver driver;

   public ExtentSparkReporter sparkReporter;

public ExtentReports extent;

public ExtentTest logger;

@BeforeMethod
@Parameters("browser")
public void beforeMethod(String browser, Method testMethod){

   logger = extent.createTest(testMethod.getName());
   setupDriver(browser);
   driver.manage().window().maximize();
   driver.get(Constants.url);
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

   }


   @AfterMethod
   public void afterMethod(ITestResult result){
      if(result.getStatus()==ITestResult.FAILURE ) {
         logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "- Test Case Failed", ExtentColor.RED));
         logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " -Test Case Failed", ExtentColor.RED));
      }
      else if (result.getStatus()==ITestResult.SKIP) {
         logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() +"- Test Case Skipped", ExtentColor.ORANGE));

      }
      else if (result.getStatus()==ITestResult.SUCCESS) {
         logger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "-Test Case Passed" , ExtentColor.GREEN));
      }
   }


   @BeforeTest

   public void beforeTestMethod() {

   sparkReporter = new ExtentSparkReporter(System.getProperty("User.dir") + File.separator + "reports" + File.separator + "Rokeya");
   extent = new ExtentReports();
   extent.attachReporter(sparkReporter);
   sparkReporter.config().setTheme(Theme.DARK);
   extent.setSystemInfo("HostName", "Rokeya");
   extent.setSystemInfo("UserName", "root");
   sparkReporter.config().setDocumentTitle("Automation Report");
   sparkReporter.config().setReportName("Automation Report Results by Rokeya ");
}

@AfterTest

   public void afterTest(){
   extent.flush();   // When you get the report after Test then flush it.
  driver.quit();
}

public void setupDriver(String browser){
   if(browser.equalsIgnoreCase("chrome")){
      WebDriverManager.chromedriver().setup();
      driver= new ChromeDriver();
   }
   else if (browser.equalsIgnoreCase("FireFox")) {
      WebDriverManager.firefoxdriver().setup();
      driver=new FirefoxDriver();
   }
   else if (browser.equalsIgnoreCase("edge")) {
      WebDriverManager.edgedriver().setup();
      driver=new EdgeDriver();

   }
}
}
