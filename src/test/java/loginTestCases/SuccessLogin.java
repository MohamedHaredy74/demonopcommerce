package loginTestCases;

import baseTests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessLogin extends BaseTest {


    private String validEmail ="mostafa@gmail.com";
    private String validPassword = "122333456";
    @Test
    public void loginWitValidData()
    {
       var loginPage = homePage.clickLogin();
       loginPage.setEmail(validEmail);
       loginPage.setPassword(validPassword);
       loginPage.clickLoginBtn();
       Assert.assertTrue(loginPage.logoutIconIsDisplayed());



    }
}
