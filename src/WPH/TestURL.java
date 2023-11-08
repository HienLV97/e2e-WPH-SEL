package WPH;

import Initialization.Init;
import Support.Routers;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import org.testng.asserts.SoftAssert;


public class TestURL extends Init {
    Routers Routers = new Routers();

    @Test
    public void servicePages() {
        for (int i = 0; i < Routers.serviceLink.length; i++) {
            String url = Support.Routers.BaseURL + Routers.serviceLink[i];
            driver.get(url);
            String pageSource = driver.getPageSource();
            System.out.println(url);
            String containsURL = "url\":\"" + url;
            assertTrue(pageSource.contains(containsURL));
            String canonical = "rel=\"canonical\" href=\"" + url;
            assertTrue(pageSource.contains(canonical));
        }
    }

    @Test
    public void Author() {
        for (int i = 0; i < Routers.blogAuthor.length; i++) {
            String url = Support.Routers.BLOG_AUTHOR + Routers.blogAuthor[i];
            driver.get(url);
            String pageSource = driver.getPageSource();
            System.out.println(url);
            String containsURL = "url\":\"" + url;
            assertTrue(pageSource.contains(containsURL));
            String canonical = "rel=\"canonical\" href=\"" + url;
            assertTrue(pageSource.contains(canonical));
        }
    }

    @Test
    public void catelogy() {
        for (int i = 0; i < Routers.catelogy.length; i++) {
            String url = Support.Routers.BLOG_CATEGORY + Routers.catelogy[i];
            driver.get(url);
            String pageSource = driver.getPageSource();
            System.out.println(url);
            String containsURL = "url\":\"" + url;
            assertTrue(pageSource.contains(containsURL));
            String canonical = "rel=\"canonical\" href=\"" + url;
            assertTrue(pageSource.contains(canonical));
        }
    }

    @Test
    public void BlogPost() {
        for (int i = 0; i < Routers.blogPost.length; i++) {
            String url = Support.Routers.BLOG + Routers.blogPost[i];
            driver.get(url);
            String pageSource = driver.getPageSource();
            System.out.println(url);
            String containsURL = "url\":\"" + url;
            assertTrue(pageSource.contains(containsURL));
            String canonical = "rel=\"canonical\" href=\"" + url;
            assertTrue(pageSource.contains(canonical));
        }
    }
}
