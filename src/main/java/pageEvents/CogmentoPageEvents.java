package pageEvents;

import Utils.ElementFetch;

import org.openqa.selenium.interactions.Actions;
import pageObjects.CogmentoPageElements;

import javax.swing.*;

import static basePage.BaseTest.driver;

public class CogmentoPageEvents {

    ElementFetch elementFetch= new ElementFetch();

    public void clickContactAddBTN() throws InterruptedException {

        Actions action =new Actions(driver);
        action.moveToElement(elementFetch.getWebElement("XPATH", "//i[@class='users icon']")).build().perform();
        Thread.sleep(2000);
        elementFetch.getWebElement("XPATH", CogmentoPageElements.contactsPlusIcon).click();
        Thread.sleep(2000);
    }


}
