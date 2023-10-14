package Buoi9WebDriver;

import Support.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ThucHanh_WebDriver {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Constants Constants = new Constants(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement textboxEmail = Constants.getPlaceholder("Username");
        textboxEmail.sendKeys("Admin");

        WebElement textboxPassword = Constants.getPlaceholder("Password");
        textboxPassword.sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();



    }
}
