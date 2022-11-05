package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;}

    private WebElement getLoginIcon()
    {
        return driver.findElement(By.cssSelector("a[class='ico-login']"));
    }

    public LoginPage clickLogin()
    {
      getLoginIcon().click();
        return new LoginPage(driver);
    }







}
