package qa.tests;

import basePage.BaseTest;
import org.testng.annotations.Test;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;

public class LoginPageTest extends BaseTest {

    // I need to access the method from HomePageEvents and LoginPageEvents class So I create a object with those class name
    // to get the method.

    HomePageEvents homePageEvents= new HomePageEvents();
    LoginPageEvents loginPageEvents= new LoginPageEvents();

    @Test
    public void loginToTheApplication(){
        homePageEvents.signinBTN();
        loginPageEvents.enterCredentials();
    }







}
