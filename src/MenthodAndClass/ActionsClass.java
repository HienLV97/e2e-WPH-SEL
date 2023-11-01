package MenthodAndClass;

import Initialization.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass extends Init {
    @Test
    public void TestAction() {
        Actions action = new Actions(driver);
        driver.get("https://www.google.com/");

        // specify the locator of the search box
        WebElement element = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));


        // pass the product name that has to be searched in the website
        action.sendKeys(element, "Anh Tester");
//                .build().perform();
        action.sendKeys(Keys.ENTER);
//        .build().perform();

    }
}
