package pageEvents;

import Utils.ElementFetch;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import pageObjects.CogmentoSearchElements;




public class CogmentoSearchEvents  {

    ElementFetch elementFetch= new ElementFetch();

    public void enterSearch() throws InterruptedException {

        elementFetch.getWebElement("XPATH", CogmentoSearchElements.search).click();
        elementFetch.getWebElement("XPATH", CogmentoSearchElements.search).sendKeys("BizBee Inc");
        elementFetch.getWebElement("XPATH", CogmentoSearchElements.search).sendKeys(Keys.ENTER);
        elementFetch.getWebElement("XPATH", CogmentoSearchElements.bizzBeeInc).click();


        String actual = "Everyone in the company can see.";
        Thread.sleep(2000);
        String expected = elementFetch.getWebElement("XPATH", CogmentoSearchElements.access).getText();
        Assert.assertEquals(actual, expected);
        System.out.println("Test case is passed :" + expected);

        String expected1 = "bizbee: <bizbee@gmail.com>";
        Thread.sleep(2000);
        String actual1 = elementFetch.getWebElement("XPATH", CogmentoSearchElements.email).getText();
        Assert.assertEquals(actual1, expected1);
        System.out.println("My actual1 and expected1 email are matched :" + actual1);

        String expectedCategory= "Customer";
        Thread.sleep(2000);
        String actualCategory=elementFetch.getWebElement("XPATH", CogmentoSearchElements.category).getText();
        Assert.assertEquals(actualCategory, expectedCategory);
        System.out.println("Test case is passed :" + actualCategory);


        String expectedStatus= "New";
        Thread.sleep(2000);
        String actualStatus  =elementFetch.getWebElement("XPATH", CogmentoSearchElements.status).getText();
        Assert.assertEquals(actualStatus,expectedStatus);
        System.out.println("Test case is passed :" + actualStatus);

        String expectedDescription="This is an IT training Company";
        Thread.sleep(2000);
        String actualDescription =elementFetch.getWebElement("XPATH",CogmentoSearchElements.description).getText();
        Assert.assertEquals(actualDescription, expectedDescription);
        System.out.println("Test case is passed :" + actualDescription);

        String expectedAddress="123, NewYork, NY, 10036";
        Thread.sleep(2000);
        String actualAddress =elementFetch.getWebElement("XPATH",CogmentoSearchElements.address).getText();
        Assert.assertEquals(actualAddress,expectedAddress );
        System.out.println("Test case is passed :" + actualAddress);

        String expectedNum="5253621547: +17182546954";
        Thread.sleep(2000);
        String actualNum =elementFetch.getWebElement("XPATH", CogmentoSearchElements.number).getText();
        Assert.assertEquals(actualNum, expectedNum);
        System.out.println("My actualNum and expectedNum are matched: "+ actualNum);

//      String expectedNa="N/A";
//      Thread.sleep(2000);
//      String actualNa=elementFetch.getWebElement("XPATH", CogmentoSearchElements.na ).getText();
//      Assert.assertEquals(actualNa, expectedNa);
//      System.out.println("My actualNa and expectedNa are matched :+ expectedNa");

        String expectedDepartment= "IT Program";
        Thread.sleep(2000);
        String actualDepartment  =elementFetch.getWebElement("XPATH", CogmentoSearchElements.department ).getText();
        Assert.assertEquals(actualDepartment,  expectedDepartment);
        System.out.println("Test case is passed :" + actualDepartment);


        String expectedSup ="Ismail Mohammad Hossain";
        Thread.sleep(2000);
        String actualSup =elementFetch.getWebElement("XPATH",CogmentoSearchElements.supervisor).getText();
        Assert.assertEquals(actualSup, expectedSup);
        System.out.println("Test case is passed:" + actualSup);

        String expectedSource="Website";
        Thread.sleep(2000);
        String actualSource =elementFetch.getWebElement("XPATH",CogmentoSearchElements.source).getText();
        Assert.assertEquals(actualSource, expectedSource);
        System.out.println("Test case is passed :" + actualSource);

        String expectedCall="No";
        Thread.sleep(2000);
        String actualCall =elementFetch.getWebElement("XPATH", CogmentoSearchElements.doNotCall ).getText();
        Assert.assertEquals(actualCall, expectedCall);
        System.out.println("My actual value  and expected value  are matched : " + actualCall);


        String expectedText="No";
        String actualText=elementFetch.getWebElement("XPATH", CogmentoSearchElements.text).getText();
        Assert.assertEquals(actualText,expectedText );
        System.out.println("My actual value  and expected value  are matched : " + actualText);

        String expectedEmail="No";
        String actualEmail= elementFetch.getWebElement("XPATH",CogmentoSearchElements.doNotEmail ).getText();
        Assert.assertEquals(actualEmail,expectedEmail);
        System.out.println("My actual value  and expected value  are matched : " + actualEmail);

        String expectedBirthday="4 July 2000";
        String actualBirthday=elementFetch.getWebElement("XPATH",CogmentoSearchElements.birthday ).getText();
        Assert.assertEquals(actualBirthday,expectedBirthday);
        System.out.println("My actual value  and expected value  are matched : " + actualBirthday);

//      String expectedIden="N/A";
//      String actualIden =elementFetch.getWebElement("XPATH", CogmentoSearchElements.identifier).getText();
//      Assert.assertEquals(actualIden, expectedIden);
//      System.out.println("My actual value  and expected value  are matched : " + expectedIden);

        String expectedCreatedAt="21/01/2024 11:29";
        String actualCreatedAt=elementFetch.getWebElement("XPATH", CogmentoSearchElements.createdAt).getText();
        Assert.assertEquals(actualCreatedAt, expectedCreatedAt);
        System.out.println("My actual value  and expected value  are matched : " + actualCreatedAt);


        String expectedCreatedBy="Biz Bee";
        String actualCreatedBy=elementFetch.getWebElement("XPATH", CogmentoSearchElements.createdBy).getText();
        Assert.assertEquals(actualCreatedBy, expectedCreatedBy);
        System.out.println("My actual value  and expected value  are matched : " + actualCreatedBy);



        }
    }

