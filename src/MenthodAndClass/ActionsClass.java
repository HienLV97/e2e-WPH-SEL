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
        action.sendKeys(element, "Anh Tester")
                .build().perform();
        action.sendKeys(Keys.ENTER)
                .build().perform();
        driver.findElement(By.xpath("//a[@href='https://anhtester.com/']//h3[@class='LC20lb MBeuO DKV0Md'][normalize-space()='Anh Tester Automation Testing']"))
                .click();
        WebElement title = driver.findElement(By.xpath("//div[@class='col-lg-7']//h2[@class='section__title'][contains(text(),'Anh Tester')]"));
        action.doubleClick(title).build().perform();
    }
}
