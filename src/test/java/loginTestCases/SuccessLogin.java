package loginTestCases;

import baseTests.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessLogin extends BaseTest {


    private String validEmail ="mohyee@gmail.com";
    private String validPass = "122333456";
    @Test
    public void loginWitValidData()
    {
       var login= homePage.clickLogin();
       login.setEmail(validEmail);
       login.setPassword(validPass);
       login.clickLoginBtn();
       Assert.assertTrue(login.getLogoutIcon().isDisplayed());





    }
}
