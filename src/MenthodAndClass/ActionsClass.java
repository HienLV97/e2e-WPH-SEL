package MenthodAndClass;

import Initialization.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ActionsClass extends Init {

    @Test//(enabled = false)
    public void TestAction() {

        driver.get("https://www.google.com/");
        Actions action = new Actions(driver);

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

        WebElement allCourseBTN = driver.findElement(By.xpath("//a[contains(text(),'Tất Cả Khóa Học')]"));
        action.moveToElement(allCourseBTN).build().perform();
    }

    @Test//(enabled = false)
    public void DrapAndDrop() throws AWTException {
        Actions action = new Actions(driver);
        Robot robot = new Robot();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement From = driver.findElement(By.xpath("//div[@id='box3']"));
        WebElement To = driver.findElement(By.xpath("//div[@id='box103']"));
        action.dragAndDrop(From, To).build().perform();
    }

    @Test(enabled = true)
    public void Robot() throws AWTException, InterruptedException {

        driver.get("https://anhtester.com");

        Thread.sleep(5000);
        WebElement inputCourseElement = driver.findElement(By.name("key"));
        inputCourseElement.click();
        inputCourseElement.sendKeys("a");

        Robot robot = new Robot();
        Thread.sleep(5000);
//        Robot robot = new Robot();
////        robot.keyPress(KeyEvent.VK_TAB);
//        Thread.sleep(1000);
//        robot.keyPress(KeyEvent.VK_TAB);
//        Thread.sleep(1000);
//        robot.keyPress(KeyEvent.VK_TAB);
//        Thread.sleep(1000);
//        robot.keyPress(KeyEvent.VK_TAB);
//        Thread.sleep(1000);
//        robot.keyPress(KeyEvent.VK_TAB);
////        robot.keyPress(KeyEvent.VK_TAB);
//        Thread.sleep(1000);
//        robot.keyPress(KeyEvent.VK_A);

        // Nhập từ khóa selenium
        inputCourseElement.click();
        robot.keyPress(KeyEvent.VK_S);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_M);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);

        Thread.sleep(2000);
    }
}
