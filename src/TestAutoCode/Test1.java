package TestAutoCode;


//import ObjectLoginPage.Object;

import Initialization.Init;
import org.testng.annotations.Test;

import static Support.Routers.BaseURL;

//
public class Test1 extends Init {
    @Test
    public void justTest(){
        driver.navigate().to(BaseURL);
    }
}