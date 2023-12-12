package Test.AssertLibrary;


import Initialization.Init;
import Support.Constants;
import Support.Routers;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AssertMenthod extends Init {
	@Test
	public void Start() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Constants Constants = new Constants();
		driver.navigate().to(Routers.SIGN_IN);
		WebElement emailTextbox = Constants.getPlaceholder("Email");
		emailTextbox.sendKeys(Constants.emailAccount);
		WebElement passTextbox = Constants.getPlaceholder("Password");
		passTextbox.sendKeys(Constants.passAccount);

		Thread.sleep(1000);
		WebElement SubmitInBTN = Constants.getBtn("Yes, I understood");
		SubmitInBTN.click();
		Thread.sleep(1000);

		WebElement SignInBTN = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
//		WebElement SignInBTN = Constants.getBtn("Sign in");

		SignInBTN.click();
		sleep(4);
//        WebElement h1Tag = driver.findElement(By.className("hero__anchor"));

//        assertEquals(h1Tag.getText(),"IB WRITING SERVICE");
//        assertTrue(h1Tag.getText().contains("IB"));

	}

}
