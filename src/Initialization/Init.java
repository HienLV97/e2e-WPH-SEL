package Initialization;

import ScreenSetup.screenPosition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Init {
    public static WebDriver driver = null;

    @BeforeTest
    public static void Setup() {

        driver = new ChromeDriver();
//        screenPosition.MidRight();
        screenPosition.MidRightMac();
//        screenPosition.FullScreen2();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterTest
    public static void TearDown() throws Exception {
        Thread.sleep(5000);
//        driver.quit();
    }
}
