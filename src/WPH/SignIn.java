package WPH;

import Support.Routers;
import Support.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class SignIn {
    WebDriver driver = new FirefoxDriver();
    Constants Constants = new Constants(driver);
    @BeforeSuite
    public void beforeSuite(){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(Routers.SIGN_IN);
    }
    @Test (description= "Print the first test method")
    public void nevigation(){
        driver.navigate().to(Routers.HOME);
        WebElement signInBtn = Constants.getBtn("Sign in");
        signInBtn.click();
        System.out.println("a'");
    }
    @Test (description= "Print the second test method")
    public void nevigation1(){
        driver.navigate().to(Routers.HOME);
        WebElement signInBtn = Constants.getBtn("Sign in");
        signInBtn.click();
        System.out.println("a'");
    }
    @AfterSuite
    public void closeDriver() {
        driver.quit();
    }
}