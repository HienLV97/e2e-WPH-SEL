package Test.SignUP;

import Initialization.Init;
import Support.Constants;
import Support.Routers;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class firstClass extends Init {
    @Test
    public void firstMethod() throws InterruptedException {
        driver.navigate().to(Routers.SIGN_UP);
        Constants Constants = new Constants();
        WebElement emailTextbox = Constants.getPlaceholder("Email");
        emailTextbox.sendKeys(Constants.emailAccount);
        WebElement passTextbox = Constants.getPlaceholder("Password");
        passTextbox.sendKeys(Constants.passAccount);
        Thread.sleep(1000);
        WebElement SubmitInBTN = Constants.getBtn("Yes, I understood");
        SubmitInBTN.click();
        Thread.sleep(1000);
        WebElement SignInBTN = Constants.getBtn("Create account");
        SignInBTN.click();
        Thread.sleep(2000);
    }

}
