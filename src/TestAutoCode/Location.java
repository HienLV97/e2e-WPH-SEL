package TestAutoCode;


import Support.Constants;
import Support.Routers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location {
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {
        Constants Constants = new Constants(driver);
        driver.navigate().to(Routers.SIGN_IN);
        WebElement textboxEmail = Constants.getPlaceholder("Email");
        textboxEmail.sendKeys(Constants.emailAccount);

        WebElement textboxPassword = Constants.getPlaceholder("Password");
        textboxPassword.sendKeys(Constants.passAccount);
        WebElement btnSignin = Constants.getBtn("Continue with email");
        btnSignin.click();
        Thread.sleep(1000);
//        boolean textBalance = Constants.getText("Balance").isDisplayed();
//        boolean textBalance = driver.findElement(By.xpath("//*[contains(text(), 'Balance')]")).isDisplayed();
//        if(textBalance == true){
//            System.out.println("Success");
//        }else {
//            System.out.println("Fail");
//        }
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//header/div[@id='p-header__content']/div[@id='js-navbar']/div[1]/div[3]/div[1]/div[2]"));
        // Lấy văn bản từ phần tử
        String textOnPage = element.getText();

        // Kiểm tra xem văn bản cần kiểm tra có tồn tại trên trang hay không
        if (textOnPage.contains("Balance")) {
            System.out.println("Văn bản đã được tìm thấy trên trang.");
        } else {
            System.out.println("Văn bản không tồn tại trên trang.");
        }
//        boolean textSignUp = driver.findElement(By.xpath("//*[contains(text(), 'Create A Free Account')]")).isDisplayed();
        boolean textSignUp = driver.findElement(By.xpath("//a[contains(text(),'Create A Free Account')]")).isDisplayed();
        if(textSignUp == true){
            System.out.println("Success");
        }else {
            System.out.println("Fail");
        }
    }
}