package registerTests;

import baseTests.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidRegister extends BaseTest {
    @Test
    public void registerWithValidCredentials()
    {
     var register=homePage.clickRegisterIcon();
     register.selectMAleGender();
     register.setFirstName("test");
     register.setLastName("automation");
     register.setBirthDate("1","10","1999");
     register.setEmailField("automation@gmail.com");
     register.setPasswordField("Test!123");
     register.setConfirmPasswordField("Test!123");
     var myAccount =register.clickRegister();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(myAccount.getRegisterMessageText().contains("Your registration completed"),"No Success msg Displayed");
        softAssert.assertTrue(myAccount.getRegisterMessageColor().contains("rgba(76, 177, 124, 1)"),"Error with Message color");
        softAssert.assertAll();



    }
}
