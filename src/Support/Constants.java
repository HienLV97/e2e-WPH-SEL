package Support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static Initialization.Init.driver;
public class Constants {
//     WebDriver driver = null;

//    public Constants(WebDriver driver) {
//        this.driver = driver;
//    }

    public String emailAccount = "kamoratest1@g.c";
    public String passAccount = "iamafriend";

    public WebElement getPlaceholder(String value) {
        return driver.findElement(By.xpath("//input[contains(@placeholder, '" + value + "')]"));
    }

    public WebElement getBtn(String value) {
        return driver.findElement(By.xpath("//*/button[contains(text(), '" + value + "')]"));
//                                                          button[contains(text(),'Login')]
    }
    public WebElement getText(String value) {
//        return driver.findElement(By.xpath("//*[contains(text(), '" + value + "')]"));
        return driver.findElement(By.xpath("//*[contains(text(), '"+value+"')]"));
    }

}