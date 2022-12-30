package baseTests;
import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import java.io.File;
import java.io.IOException;


public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
    private  String demoLink ="https://demo.nopcommerce.com/";

    @BeforeClass
    public void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.navigate().to(demoLink);
        driver.manage().window().fullscreen();
        homePage=new HomePage(driver);
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
    @AfterMethod
    public void takeScreenOnFailure(ITestResult result) throws IOException {
        if (ITestResult.FAILURE== result.getStatus())
        {
            var camera=(TakesScreenshot)driver;
            File screen = camera.getScreenshotAs(OutputType.FILE);
            Files.copy(screen, new File("./screenshots/"+result.getName()+".png"));
        }
    }
}
