package pageObjects;

public interface CreateNewContactElements {

 String firstName="//input[@name='first_name']";
 String middleName="//input[@name='middle_name']";

 String lastName="//input[@name='last_name']";


 String streetAddress="//input[@name='address']";
 String city="//input[@name='city']";
 String stateOrCounty= "(//div[@class='ui input'])[6]//input";
 String postCode="//input[@name='zip']";

 String addressDropdown="(//i[@class='dropdown icon'])[7]";

 String addressAllCountry= "//div[@class='visible menu transition']//div";
 String addressAddSign="(//i[@class='add icon'])[3]";

 // Second Address steps
 String streetAddress2="(//input[@name='address'])[2]";
 String city2="(//input[@name='city'])[2]";
 String stateOrCounty2= "(//input[@name='state'])[2]";

 String postCode2 ="(//input[@name='zip'])[2]";

 String addressDropdown2="(//i[@class='dropdown icon'])[8]";
 String addressAllCountry2= "//div[@class='visible menu transition']//div";
         //"//div[@class='visible menu transition']//span[text()='Tunisia']";
 String addressAddSign2="(//i[@class='add icon'])[3]";

 String emailAddress ="//input[@placeholder='Email address']";

 String nextEmailBTN="//input[@placeholder='Personal email, Business, Alt...']";
 String emailAddSign="(//i[@class='add icon'])[1]";
 String searchCompany="(//input[@class='search'])[1]";
 String categoryDropdown="(//i[@class='dropdown icon'])[3]";
 String listOfCategory="//div[@class='visible menu transition']//div";
 String phoneDropDown="(//i[@class='dropdown icon'])[9]";
 String listOfCountryForPhone="//div[@class='visible menu transition']//div";
 String phoneNumber="//input[@placeholder='Number']";
 String phoneNextBTN= "//input[@placeholder='Home, Work, Mobile...']";
 String phoneAddSign="(//i[@class='add icon'])[4]";
 String saveBTN="//i[@class='save icon']";

 String titleVerify= "//span[@class='selectable ']";

}
