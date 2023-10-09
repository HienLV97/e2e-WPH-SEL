package TestAutoCode;


import Support.Routers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Support.Constants;
import org.openqa.selenium.firefox.FirefoxDriver;

//public class Location {
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", Constants.pathChromeDriver);
//        WebDriver driver = new ChromeDriver();
//        driver.navigate().to(Routers.SIGN_IN);
////        driver.findElement(By.ByClassName())
//        WebElement passWord = driver.findElement(By.xpath("//input[contains(@placeholder, 'Password')]"));
////       driver.findElement(By.CssSelector("[placeholder='Password']"));
////       driver.findElement(By.cssSelector("input[placeholder='Password']"));
//        passWord.sendKeys("123");
//    }
//}
//
class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getPlaceholder(String value) {
//        String xpathExpression = "//input[contains(@placeholder, '" + value + "')]";
        return driver.findElement(By.xpath("//input[contains(@placeholder, '" + value + "')]"));
    }
//    public WebElement getBtn(String value) {
//        String xpathExpression = "//input[contains(@placeholder, '" + value + "')]";
//        return driver.findElement(By.xpath(xpathExpression));
//    }
}

public class Location {
    static WebDriver driver = new ChromeDriver();
    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage(driver);
        driver.navigate().to(Routers.SIGN_IN);
        WebElement textboxEmail = loginPage.getPlaceholder("Email");
        textboxEmail.sendKeys("abc@gmail.com");
        WebElement textboxPassword = loginPage.getPlaceholder("Password");
        textboxPassword.sendKeys("abc@gmail.com");
        textboxEmail.clear();
    }
}