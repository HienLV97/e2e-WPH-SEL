package TestAutoCode;


//import ObjectLoginPage.Object;

import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.GraphQLException;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


import Initialization.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;

import static Support.Routers.BaseURL;
import static org.testng.Assert.assertTrue;

//
//public class Test1 extends Init {
//    @Test
//    public void justTest() throws IOException {
//        String[] URL1 = {
//                "https://writersperhour.com/essay-writers",
//
//                "https://writersperhour.com/blog/steps-writing-rhetorical-analysis-essay-effectively"
//        };
//        for (int i = 0; i < URL1.length; i++) {
//            String url = URL1[i];
//            driver.get(url);
//            int responseCode = ((HttpURLConnection) new URL(url).openConnection()).getResponseCode();
////            System.out.println(url);
//            if (responseCode != 404) {
//                WebElement errorMes = null;
//                try {
//                    errorMes = driver.findElement(By.xpath("//p[contains(text(),\"Oops, the page you were looking for doesn't exist\")]"));
//                } catch (org.openqa.selenium.NoSuchElementException e) {
//                }
//                if (errorMes != null) {
//                    System.out.println("URL bị lỗi 404 mới");
//                    System.out.println(url);
//                }
//            }
//        }
//    }

//}
public class Test1 {
    public static void main(String[] args) {

    }
}