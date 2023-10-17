package TestAutoCode;


//import ObjectLoginPage.Object;

import Support.Routers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

//
public class Test extends Object {
//    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String URL = "https://writersperhour.dev/order";
        driver.navigate().to(URL);

//        driver.findElement(By.id("input-document")).click();
        driver.findElement(By.xpath("//input[@id='input-document']")).click();
        driver.findElement(By.xpath("//input[@id='input-document']")).sendKeys("x");
//        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]")).click();
        Thread.sleep(3000);
//        List<WebElement> listTh = driver.findElements(By.xpath("//span"));
        List<WebElement> listTh = driver.findElements(By.xpath("//*[@class='item-js ']/span"));
        for (int i = 0; i < listTh.size() ; i++){
            System.out.println(listTh.get(i).getText());
            if(listTh.get(i).getText() !="bab"){
                System.out.println(listTh.get(i).getText().contains("a"));
                System.out.println(listTh.get(i).getText());
            }
        }
        System.out.println("Xong");
    }
}