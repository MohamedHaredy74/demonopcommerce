package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }
    private WebElement emailField()
    {
        return driver.findElement(By.id("Email"));
    }
    private WebElement passwordField()
    {
        return driver.findElement(By.id("Password"));
    }

    private WebElement loginButton()
    {
        return driver.findElement(By.xpath("//button[contains(text(),'Log')]"));
    }
    private WebElement logoutIcon()
    {
       return driver.findElement(By.cssSelector("a[class='ico-logout']"));
    }
    private WebElement unSuccessLoginMessage()
    {
        return driver.findElement(By.xpath("//div[contains(text(),'Login was unsuccessful')]"));
    }
    private WebElement emailErrorMessage()
    {
        return driver.findElement(By.id("Email-error"));
    }




    public void setEmail(String email)
    {
        emailField().sendKeys(email);
    }
    public void setPassword(String pass)
    {
        passwordField().sendKeys(pass);
    }
    public HomePage clickLoginBtn()
    {
        loginButton().click();
        return new HomePage(driver);
    }

    public String getEmailErrorMessage()
    {
        return emailErrorMessage().getText();
    }
    public String getUnSuccessLoginMessage()
    {
       return unSuccessLoginMessage().getText();
    }
    public boolean logoutIconIsDisplayed()
    {
        return logoutIcon().isDisplayed();
    }




}
