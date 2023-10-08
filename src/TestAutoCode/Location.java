package TestAutoCode;


import Support.Routers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Support.Constants;

public class Location {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Constants.pathChromeDriver);
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(Routers.SIGN_IN);
//        driver.findElement(By.ByClassName())
       WebElement passWord =  driver.findElement(By.xpath("//input[contains(@placeholder, 'Password')]"));
//       driver.findElement(By.CssSelector("[placeholder='Password']"));
//       driver.findElement(By.cssSelector("input[placeholder='Password']"));
        passWord.sendKeys("123");

    }
}
