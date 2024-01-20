package qa.tests;

import basePage.BaseTest;
import org.testng.annotations.Test;
import pageEvents.*;

public class LoginPageTest extends BaseTest {

    // I need to access the method from HomePageEvents and LoginPageEvents class So I create a object with those class name
    // to get the method.

    HomePageEvents homePageEvents= new HomePageEvents();
    LoginPageEvents loginPageEvents= new LoginPageEvents();
    CogmentoPageEvents cogmentoPageEvents= new CogmentoPageEvents();
    CreateNewContactsEvents createNewContactsEvents= new CreateNewContactsEvents();


    /**User opens chrome browser.
     User clicks on ‘login’ button.
     User inputs email.
     User inputs password.
     User clicks on ‘login’ button.
     User Mouse Hover to ‘Contact’ option.
     Users click on the ‘Add’ button.
     User inputs ‘First Name’.
     User inputs ‘Middle Name’.
     User inputs ‘Last Name’.
     User inputs ‘Address’.
     User inputs ‘Email’.
     User inputs ‘Company’.
     User inputs ‘Category’.
     User inputs ‘Phone Number’.
     Users saved the form.
     User verify's the form is saved.
     *
     */
    @Test
    public void loginToTheApplication() throws InterruptedException {
        homePageEvents.signinBTN();
        loginPageEvents.enterCredentials();
        cogmentoPageEvents.clickContactAddBTN();
        Thread.sleep(10000);
        createNewContactsEvents.enterCreateNewContactInfo();

    }
}
