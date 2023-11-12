package TestNG;

import org.openqa.selenium.interactions.Actions;
import Initialization.Init;
import Support.Constants;
import Support.Routers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

public class TestURL extends Init {
    Support.Routers Routers = new Routers();
    Constants Constants = new Constants();

    @Test
    public void Production() {
        String url = "https://live10.cakhia22.live/truc-tiep/654c7b81b72944618d1e2b24.html?link=11";
        driver.navigate().to(url);
//        WebElement nhaDai = driver.findElement(By.xpath("//body/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/a[8]"));
        boolean foundElement = false;
        while (!foundElement) {
            try {
                Actions action = new Actions(driver);
//                WebElement nhaDai = driver.findElement(By.xpath("//*[contains(text(),'Nhà Đài')]"));
                WebElement nhaDai = Constants.getText("Nhà Đài");
                WebElement closeBTN = driver.findElement(By.xpath("//button[@class='close-modal']"));
                closeBTN.click();
//                WebElement nhaDai = driver.findElement(By.xpath("//body/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/a[8]"));
//                WebElement nhaDai = driver.findElement(By.linkText(" Nhà Đài"));
                // Nếu phần tử được tìm thấy, thực hiện các hành động tương ứng ở đây
//                WebElement nhaDai  = Constants.getText(" Nhà Đài");
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nhaDai);

                nhaDai.click(); // Ví dụ: Click vào nút "Next"
                Thread.sleep(5000);
//                WebElement closeBTN = driver.findElement(By.xpath("//button[@class='close-modal']"));
                closeBTN.click();
                Thread.sleep(3000);
                foundElement = true; // Đánh dấu rằng phần tử đã được tìm thấy
                WebElement playBTN = driver.findElement(By.tagName("video"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", playBTN);

                action.click(playBTN);
            } catch (org.openqa.selenium.NoSuchElementException e) {
                // Nếu không tìm thấy phần tử, tiến hành reload trang
                driver.navigate().refresh();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
