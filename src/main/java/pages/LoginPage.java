package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
    private WebDriver driver;
    private HomePage homePage;
    By emailField    = By.id("Email");
    By passwordField = By.id("Password");
    By loginBtn = By.xpath("//button[contains(text(),'Log')]");
    By logoutIcon = By.className("ico-logout");
    By unSuccessLoginMessage =By.xpath("//div[contains(text(),'Login was unsuccessful')]");
    By emailErrorMessage = By.id("Email-error");

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void setEmail(String email)
    {
        driver.findElement(emailField).sendKeys(email);
    }
    public void setPassword(String pass)
    {
        driver.findElement(passwordField).sendKeys(pass);
    }
    public HomePage clickLoginBtn()
    {
        driver.findElement(loginBtn).click();
        return new HomePage(driver);
    }


    public WebElement getLogoutIcon()
    {
        return driver.findElement(logoutIcon);
    }

    public String getUnSuccessLoginMessage()
    {
        return driver.findElement(unSuccessLoginMessage).getText();
    }
    public String getEmailErrorMessage()
    {
        return driver.findElement(emailErrorMessage).getText();
    }




}
