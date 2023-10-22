package Buoi9WebDriver;


//import ObjectLoginPage.Object;

import Support.Routers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

//
//public class TH2 extends Object {
////    static WebDriver driver = new ChromeDriver();
//
//    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        String URL = "https://testpages.herokuapp.com/styled/frames/frames-test.html";
//        driver.navigate().to(URL);
//
////        driver.findElement(By.id("input-document")).click();
//        driver.switchTo().frame("middle");
//        String itemMiddle = driver.findElement(By.xpath("//li[@id='middle0']")).getText();
//        Thread.sleep(3000);
//        System.out.println(itemMiddle);
////        assert
//    }
//}

public class TH2 {
    WebDriver driver;

    @BeforeMethod
    public void createDriver() {
//        WebDriverManager.chromedriver().setup();
        driver = new FirefoxDriver();
//        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }

    @Test
    public void testAnhTesterBlog() throws InterruptedException {
        driver.get("https://anhtester.com");
        driver.findElement(By.xpath("//a[normalize-space()='blog ']")).click();
        Thread.sleep(2000);
    }

    @Test
    public void testGoogleSearch() throws InterruptedException {
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("anhtester", Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//h3[normalize-space()='Anh Tester Automation Testing']")).click();
        Thread.sleep(2000);
    }

    @AfterMethod
    public void closeDriver() {
        driver.quit();
    }
}
