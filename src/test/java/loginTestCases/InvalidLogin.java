package loginTestCases;

import baseTests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLogin extends BaseTest {

    private String validEmail ="mostafa@gmail.com";
    private String validPassword = "122333456";
    @Test(priority = 1)
    public void loginWithInvalidEmailAndInvalidPass()
    {
        var loginPage = homePage.clickLogin();
        loginPage.setEmail("mohaa@gamil.com");
        loginPage.setPassword("123456");
        loginPage.clickLoginBtn();
        Assert.assertTrue(loginPage.getUnSuccessLoginMessage().contains("Login was unsuccessful"));
    }

    @Test(priority = 2)
    public void loginWithValidEmailAndInvalidPassword()
    {
        var loginPage =homePage.clickLogin();
        loginPage.setEmail(validEmail);
        loginPage.setPassword("123963");
        loginPage.clickLoginBtn();
        Assert.assertTrue(loginPage.getUnSuccessLoginMessage().contains("Login was unsuccessful"));
    }

    @Test(priority = 3)
    public void loginWithInvalidEmailAndValidPassword()
    {
        var loginPage =homePage.clickLogin();
        loginPage.setEmail("asdgf@gmail.com");
        loginPage.setPassword(validPassword);
        loginPage.clickLoginBtn();
        Assert.assertTrue(loginPage.getUnSuccessLoginMessage().contains("Login was unsuccessful"));
    }
    @Test(priority = 4)
    public void loginWithValidEmailFieldOnly()
    {
        var loginPage =homePage.clickLogin();
        loginPage.setEmail(validEmail);
        loginPage.clickLoginBtn();
        Assert.assertTrue(loginPage.getUnSuccessLoginMessage().contains("Login was unsuccessful"));
    }

    @Test(priority = 5)
    public void loginWithValidPasswordFieldOnly()
    {
        var loginPage =homePage.clickLogin();
        loginPage.setPassword(validPassword);
        loginPage.clickLoginBtn();
        Assert.assertTrue(loginPage.getEmailErrorMessage().contains("Please enter your email"));
    }

    @Test(priority = 6)
    public void loginWithoutSettingFields()
    {
        var loginPage =homePage.clickLogin();
        loginPage.clickLoginBtn();
        Assert.assertTrue(loginPage.getEmailErrorMessage().contains("Please enter your email"));

    }

}
