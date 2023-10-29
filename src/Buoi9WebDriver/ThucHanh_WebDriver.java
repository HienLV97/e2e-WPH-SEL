package Buoi9WebDriver;

import Support.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ThucHanh_WebDriver {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Constants Constants = new Constants();
        String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
//        String URL = "https://writersperhour.dev/order";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(URL);

        WebElement textboxEmail = Constants.getPlaceholder("Username");
        textboxEmail.sendKeys("Admin");

        WebElement textboxPassword = Constants.getPlaceholder("Password");
        textboxPassword.sendKeys("admin123");

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
//        driver.findElement(By.xpath("//@span[contains(text(), 'Admin')]")).click();
//
        List<WebElement> listTh = driver.findElements(By.xpath("//*[@class='item-js ']/span"));
        for (int i = 0; i < listTh.size() ; i++){
            System.out.println(listTh.get(i).getText());
//            if()
        }
        System.out.println("Xong");
    }
}
