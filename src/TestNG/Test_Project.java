package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_Project {
    public WebDriver driver = null;

    @Test
    public void demo1() {
        driver.navigate().to("https://anhtester.com");
    }

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.navigate().to("https://ibhelper.dev/testimonials");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }

    @AfterTest
    public void afterTest() throws InterruptedException {
    Thread.sleep(2000);
    }
}
