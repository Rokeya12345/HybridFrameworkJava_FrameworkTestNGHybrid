package pageEvents;

import Utils.ElementFetch;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pageObjects.CreateNewContactElements;

import java.util.List;

import static basePage.BaseTest.driver;

public class CreateNewContactsEvents {

    ElementFetch elementFetch = new ElementFetch();

    public void enterCreateNewContactInfo() throws InterruptedException {

        Actions action = new Actions(driver);
        action.moveToElement(elementFetch.getWebElement("XPATH", "//input[@name='first_name']")).build().perform();

        Thread.sleep(2000);
        elementFetch.getWebElement("XPATH", CreateNewContactElements.firstName).sendKeys("Lucky");
        elementFetch.getWebElement("XPATH", CreateNewContactElements.middleName).sendKeys("HR");
        elementFetch.getWebElement("XPATH", CreateNewContactElements.lastName).sendKeys("Ira");
        Thread.sleep(2000);
        elementFetch.getWebElement("XPATH", CreateNewContactElements.streetAddress).sendKeys("001 rose st");
        elementFetch.getWebElement("XPATH", CreateNewContactElements.city).sendKeys("Jersy City");
        Thread.sleep(3000);
        elementFetch.getWebElement("XPATH", CreateNewContactElements.stateOrCounty).sendKeys("New Jersy");
        elementFetch.getWebElement("XPATH", CreateNewContactElements.postCode).sendKeys("20011");
        Thread.sleep(3000);


        elementFetch.getWebElement("XPATH", CreateNewContactElements.addressDropdown).click();
        Thread.sleep(3000);

        List<WebElement> listAllCountry = elementFetch.getWebElements("XPATH", CreateNewContactElements.addressAllCountry);
        System.out.println("Total number of country :" + listAllCountry.size());
        for (int i = 0; i < listAllCountry.size(); i++) {
            String countryText = listAllCountry.get(i).getText();
            System.out.println("Total number of country :" + countryText);
            if (countryText.equalsIgnoreCase("Turkey")) {
                listAllCountry.get(i).click();
                break;
            }

        }
        Thread.sleep(2000);
        elementFetch.getWebElement("XPATH", CreateNewContactElements.addressAddSign).click();

        elementFetch.getWebElement("XPATH", CreateNewContactElements.streetAddress2).sendKeys("002 Biden St");
        Thread.sleep(2000);
        elementFetch.getWebElement("XPATH", CreateNewContactElements.city2).sendKeys("No More");
        elementFetch.getWebElement("XPATH", CreateNewContactElements.stateOrCounty2).sendKeys("OHIO");
        elementFetch.getWebElement("XPATH", CreateNewContactElements.postCode2).sendKeys("20012");
        Thread.sleep(2000);

        elementFetch.getWebElement("XPATH", CreateNewContactElements.addressDropdown2).click();
        Thread.sleep(2000);

        List<WebElement> listAllCountry2 = elementFetch.getWebElements("XPATH", CreateNewContactElements.addressAllCountry2);
        System.out.println("Total number of country :" + listAllCountry2.size());
        for (int j = 0; j < listAllCountry2.size(); j++) {
            String countryText2 = listAllCountry2.get(j).getText();
            System.out.println("Total number of country :" + countryText2);
            if (countryText2.equalsIgnoreCase("Tunisia")) {
                listAllCountry2.get(j).click();
                break;
            }

        }

        elementFetch.getWebElement("XPATH", CreateNewContactElements.addressAddSign2).click();
        elementFetch.getWebElement("XPATH", CreateNewContactElements.emailAddress).sendKeys("abc@hotmail.com");
        elementFetch.getWebElement("XPATH", CreateNewContactElements.nextEmailBTN).sendKeys("abcd@hot.com");
        elementFetch.getWebElement("XPATH", CreateNewContactElements.emailAddSign).click();
        elementFetch.getWebElement("XPATH", CreateNewContactElements.searchCompany).sendKeys("ABC Company");

        elementFetch.getWebElement("XPATH",CreateNewContactElements.categoryDropdown).click();
        Thread.sleep(2000);

        List<WebElement> category= elementFetch.getWebElements("XPATH", CreateNewContactElements.listOfCategory);
        System.out.println("Total number of category items are  :" + category.size());
        for(int k=0; k<category.size();k++){
            String categoryText = category.get(k).getText();
            System.out.println("List of category :" + categoryText);
            if(categoryText.equalsIgnoreCase("Contact")){
                category.get(k).click();
                break;
            }
        }

        elementFetch.getWebElement("XPATH", CreateNewContactElements.phoneDropDown).click();
        Thread.sleep(2000);
        List<WebElement>listPhone= elementFetch.getWebElements("XPATH",CreateNewContactElements.listOfCountryForPhone);
        System.out.println("Total number of country's phone are  :" + listPhone.size());
        for(int l=0; l<listPhone.size();l++){
            String phoneText=listPhone.get(l).getText();
            System.out.println("List of country :" + phoneText);
            if(phoneText.equalsIgnoreCase("Switzerland")){
                listPhone.get(l).click();
                break;
            }
        }

        elementFetch.getWebElement("XPATH", CreateNewContactElements.phoneNumber).sendKeys("18884012314");
        elementFetch.getWebElement("XPATH",CreateNewContactElements.phoneNextBTN ).sendKeys("18082010000");
        elementFetch.getWebElement("XPATH", CreateNewContactElements.phoneAddSign).click();
        Thread.sleep(2000);
        elementFetch.getWebElement("XPATH", CreateNewContactElements.saveBTN).click();



       // Thread.sleep(2000);
        String actual= "Lucky Ira";
        Thread.sleep(2000);
        String expected =elementFetch.getWebElement("XPATH", CreateNewContactElements.titleVerify).getText();
        Assert.assertEquals(actual,expected);
        System.out.println("My actual and expected are matched :" + expected);
    }
}


