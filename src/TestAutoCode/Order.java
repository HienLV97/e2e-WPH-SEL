package TestAutoCode;

//import ObjectLoginPage.Object;
//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
import Support.Constants;
import Support.Routers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Order {
    static WebDriver driver = new ChromeDriver();
//    public static String testURL = "https://demos.jquerymobile.com/1.4.5/checkboxradio-radio/";

    public static void main(String[] args) throws InterruptedException {
        Constants Constants = new Constants(driver);
//        driver.navigate().to(testURL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(Routers.SIGN_IN);
        WebElement textboxEmail = Constants.getPlaceholder("Email");
        textboxEmail.sendKeys(Constants.emailAccount);

        WebElement textboxPassword = Constants.getPlaceholder("Password");
        textboxPassword.sendKeys(Constants.passAccount);
        WebElement btnSignin = Constants.getBtn("Sign in");
        btnSignin.click();

        driver.navigate().to(Routers.ORDER);
        driver.findElement(By.xpath("//input[@id='input-document']")).sendKeys("Analysis Paper");
        driver.findElement(By.xpath("//input[@id='input-discipline']")).sendKeys("Agriculture");
        driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
        driver.findElement(By.tagName("textarea")).sendKeys("Agriculture");
        driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
        Thread.sleep(5000);
        WebElement test = driver.findElement(By.cssSelector("div.__className_6d1a03.__variable_6d1a03.__variable_641c3b section.sc-cc7171c9-1.eAiKSo div.sc-cc7171c9-2.iLVFJx div.sc-cc7171c9-0.fnzPPy div.sc-675139e1-0.gwrJgo div.sc-f95d0e3c-0.kYfrXu div.p-order-form-layout div.p-order-form div.wrap-workload div.workload-item div.step-mb:nth-child(2) div.step-row > div.sc-825cf7f7-0.jAvDvz"));
        System.out.println(test.isSelected());
        if (test.isSelected() == false){
            System.out.println("OK");
        }else {
            System.out.println("false");
        }

//        WebElement statusEnable = driver.findElement(By.tagName("label"));
//        if (statusEnable.isSelected() == true){
//            System.out.println("OK");
//        }else {
//            System.out.println("false");
//        }
    }
}
