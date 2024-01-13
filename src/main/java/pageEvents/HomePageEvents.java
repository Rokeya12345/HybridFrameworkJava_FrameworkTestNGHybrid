package pageEvents;

import Utils.ElementFetch;
import pageObjects.HomePageElements;

public class HomePageEvents {

    ElementFetch elementFetch= new ElementFetch();

    public void signinBTN(){

        elementFetch.getWebElement("XPATH", HomePageElements.signInBTN).click();
      //  elementFetch.getWebElement("XPATH", HomePageElements.signUpBTN).click();

    }

}
