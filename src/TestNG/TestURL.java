package TestNG;

import Initialization.Init;
import Support.Constants;
import Support.Routers;
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
        String url = "https://live10.cakhia22.live/truc-tiep/653c87db7c18e529f9cb52f7.html";
        driver.navigate().to(url);
//        WebElement nhaDai = driver.findElement(By.xpath("//body/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/a[8]"));
        boolean foundElement = false;
        while (!foundElement) {
            try {
//                WebElement nhaDai = driver.findElement(By.xpath("//*[contains(text(),'Nhà Đài')]"));
                WebElement nhaDai = Constants.getText("Nhà Đài");
//                WebElement nhaDai = driver.findElement(By.xpath("//body/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/a[8]"));
//                WebElement nhaDai = driver.findElement(By.linkText(" Nhà Đài"));
                // Nếu phần tử được tìm thấy, thực hiện các hành động tương ứng ở đây
//                WebElement nhaDai  = Constants.getText(" Nhà Đài");
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nhaDai);

                nhaDai.click(); // Ví dụ: Click vào nút "Next"
                foundElement = true; // Đánh dấu rằng phần tử đã được tìm thấy
            } catch (org.openqa.selenium.NoSuchElementException e) {
                // Nếu không tìm thấy phần tử, tiến hành reload trang
                driver.navigate().refresh();
            }
        }
    }
}
