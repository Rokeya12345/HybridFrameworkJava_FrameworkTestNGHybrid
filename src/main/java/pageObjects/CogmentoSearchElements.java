package pageObjects;

public interface CogmentoSearchElements {

    String search = "//input[@placeholder='Search']";

    String bizzBeeInc = "//*[text()='Bizbee  INC']";

    String access = "//*[text()='Everyone in the company can see.']";
    String email = "(//div[@class='content'])[1]";

    String category = "(//div[@class='edit-in-place-holder'])[6]";

    String status = "(//div[@class='ui list'])[3]";

    String description = "//*[text()='This is an IT training Company']";

    String address = "(//div[@class='edit-in-place-holder'])[10]";

    String number= "(//div[@class='edit-in-place-holder'])[11]";

   // String na="(//div[@class='edit-in-place'])[1]";
    String department= "(//div[@class='edit-in-place-holder'])[13]";
    String supervisor= "(//div[@class='edit-in-place-holder'])[14]";

    String source="(//*[text()='Website'])[1]";
    String doNotCall="(//div[@class='edit-in-place-holder'])[18]";
    String text= "(//div[@class='edit-in-place-holder'])[19]";
    String doNotEmail="(//div[@class='edit-in-place-holder'])[20]";
    String birthday="(//div[@class='edit-in-place-holder'])[21]";
    //String identifier="//div[@class='ui input']";

    String createdAt="//*[text()='21/01/2024 11:29']";
    String createdBy= "(//*[text()='Biz Bee'])[2]";

}