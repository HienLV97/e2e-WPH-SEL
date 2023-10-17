package Buoi9WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import  java.util.concurrent.TimeUnit;
import Initialization.*;

import static Initialization.Init.*;

public class Handle_Checkbox {
//     Init  init = new Init();
    public static void main(String[] args) throws Exception {
        Setup();
        driver.navigate().to("https://www.seleniumeasy.com/tags/checkboxes");
        TearDown();
    }
}
