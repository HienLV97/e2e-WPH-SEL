package WPH;

import Initialization.Init;
import Support.Routers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static Support.Routers.BaseURL;

public class TestURL extends Init {
    @Test
    public void servicePages(){
        Routers Routers = new Routers();
        for (int i = 0; i < Routers.serviceLink.length; i++) {
            String url = BaseURL + Routers.serviceLink[i];
            driver.get(url);
            String pageSource = driver.getPageSource();
            assertTrue(pageSource.contains("url\":\""+url));
            System.out.println("url\":\"" + url);
            System.out.println("Chuỗi đã được tìm thấy trong mã nguồn HTML.");
            System.out.println("========================================.");
        }
    }
    @Test
    public void  Author(){
        Routers Routers = new Routers();
        for (int i = 0; i < Routers.blogAuthor.length; i++) {
            String urlAuthor = Routers.BLOG_AUTHOR + Routers.blogAuthor[i];
            driver.get(urlAuthor);
            String pageSource = driver.getPageSource();
            assertTrue(pageSource.contains("url\":\""+urlAuthor));
            System.out.println("url\":\"" +urlAuthor);
            System.out.println("Chuỗi đã được tìm thấy trong mã nguồn HTML.");
            System.out.println("========================================.");
        }
    }
    @Test
    public void  catelogy(){
        Routers Routers = new Routers();
        for (int i = 0; i < Routers.catelogy.length; i++) {
            String urlcatelogy = Routers.BLOG_CATEGORY + Routers.catelogy[i];
            driver.get(urlcatelogy);
            String pageSource = driver.getPageSource();
            assertTrue(pageSource.contains("url\":\""+urlcatelogy));
            System.out.println("url\":\"" + urlcatelogy);
            System.out.println("Chuỗi đã được tìm thấy trong mã nguồn HTML.");
            System.out.println("========================================.");
        }
    }
    @Test
    public void  BlogPost(){
        Routers Routers = new Routers();
        for (int i = 0; i < Routers.blogPost.length; i++) {
            String urlBlogPost = Routers.BLOG + Routers.blogPost[i];
            System.out.println("url\":\"" +urlBlogPost);
            driver.get(urlBlogPost);
            String pageSource = driver.getPageSource();
            assertTrue(pageSource.contains("url\":\""+urlBlogPost));
            System.out.println("Chuỗi đã được tìm thấy trong mã nguồn HTML.");
            System.out.println("========================================.");
        }
    }
}
