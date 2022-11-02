package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;}
    By loginIcon  = By.className("ico-login");



    public LoginPage clickLogin()
    {
        driver.findElement(loginIcon).click();
        return new LoginPage(driver);
    }







}
