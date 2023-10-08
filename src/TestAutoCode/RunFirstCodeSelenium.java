package TestAutoCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Support.Constants;
public class RunFirstCodeSelenium {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", Constants.pathChromeDriver);

        WebDriver driver = new ChromeDriver();
        //1 - Maximize browser của mình
        driver.manage().window().maximize();

        //2 - Đi đến 1 url

        driver.navigate().to("https://anhtester.com");

        //3 - Lấy Title và in ra console

        System.out.println(driver.getTitle());

        // Thoát hẳn Browser

//        driver.quit();

    }

}