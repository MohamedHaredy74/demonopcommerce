package loginTestCases;

import baseTests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLogin extends BaseTest {

    private String validEmail ="hareedy99@gmail.com";
    private String validPass = "122333456";
    @Test(priority = 1)
    public void loginWithInvalidEmailAndInvalidPass()
    {
        var login = homePage.clickLogin();
        login.setEmail("mohaa@gamil.com");
        login.setPassword("123456");
        login.clickLoginBtn();
        Assert.assertTrue(login.getUnSuccessLoginMessage().contains("Login was unsuccessful"));
    }

    @Test(priority = 2)
    public void loginWithValidEmailAndInvalidPass()
    {
        var login =homePage.clickLogin();
        login.setEmail(validEmail);
        login.setPassword("123963");
        login.clickLoginBtn();
        Assert.assertTrue(login.getUnSuccessLoginMessage().contains("Login was unsuccessful"));
    }

    @Test(priority = 3)
    public void loginWithInvalidEmailAndValidPass()
    {
        var login =homePage.clickLogin();
        login.setEmail("asdgf@gmail.com");
        login.setPassword(validPass);
        login.clickLoginBtn();
        Assert.assertTrue(login.getUnSuccessLoginMessage().contains("Login was unsuccessful"));
    }
    @Test(priority = 4)
    public void loginWithValidEmailFieldOnly()
    {
        var login =homePage.clickLogin();
        login.setEmail(validEmail);
        login.clickLoginBtn();
        Assert.assertTrue(login.getUnSuccessLoginMessage().contains("Login was unsuccessful"));
    }

    @Test(priority = 5)
    public void loginWithValidPasswordFieldOnly()
    {
        var login =homePage.clickLogin();
        login.setPassword(validPass);
        login.clickLoginBtn();
        Assert.assertTrue(login.getEmailErrorMessage().contains("Please enter your email"));
    }

    @Test(priority = 6)
    public void loginWithoutSettingFields()
    {
        var login =homePage.clickLogin();
        login.clickLoginBtn();
        Assert.assertTrue(login.getEmailErrorMessage().contains("Please enter your email"));

    }

}
