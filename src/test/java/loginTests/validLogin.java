package loginTests;

import baseTests.BaseTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class validLogin extends BaseTest {
    private String validEmail="automation@gmail.com";
    private String validPassword="Test!123";
    @Test
    public void loginWithValidCredentials()
    {
      var login=  homePage.clickLoginIcon();
      login.setEmailField(validEmail);
      login.setPasswordField(validPassword);
      var myAccount=login.clickLoginButton();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(myAccount.getURL().contains(" https://demo.nopcommerce.com"),"Error with url assertion");
        softAssert.assertTrue(myAccount.isMyAccountDisplayed(),"Error with myAccount assertion");
        softAssert.assertAll();

    }
}
