package pageEvents;

import Utils.ElementFetch;
import pageObjects.LoginPageElements;

public class LoginPageEvents {

    ElementFetch elementFetch= new ElementFetch();

    public void enterCredentials(){

        elementFetch.getWebElement("XPATH", LoginPageElements.emailAddress)  .sendKeys("niklas.braven@deecie.com");
        elementFetch.getWebElement("XPATH", LoginPageElements.passWord).sendKeys("Bizbee@123");
        elementFetch.getWebElement("XPATH", LoginPageElements.loginBTN).click();

    }
}
