package WPH;

import Initialization.Init;
import Support.Routers;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.commons.text.StringEscapeUtils;

import static org.testng.Assert.assertTrue;

import org.testng.asserts.SoftAssert;

import java.io.FileReader;


public class TestURL extends Init {
    Routers Routers = new Routers();

    @Test
    public void servicePages() {
        for (int i = 0; i < Routers.serviceLink.length; i++) {
            String urlAuthor = Support.Routers.BaseURLAuthor + Routers.serviceLink[i];
            ;
            String url = Support.Routers.BaseURL + Routers.serviceLink[i];
            driver.get(urlAuthor);
            String pageSource = driver.getPageSource();

            String containsURL = "url\":\"" + url;
//            assertTrue(pageSource.contains(containsURL));
            System.out.println("url:  " + url);

            String canonical = "rel=\"canonical\" href=\"" + url;
            assertTrue(pageSource.contains(canonical));
            System.out.println("canonical:   " + canonical);

            String desiredUrl = Routers.serviceLink[i]; // URL mà bạn  muốn tìm kiếm
            System.out.println("desiredUrl:   " + desiredUrl);

            String filePath = "Test-output/FileJson/Articles.json";
            try (FileReader fileReader = new FileReader(filePath)) {
                JSONTokener jsonTokener = new JSONTokener(fileReader);
                JSONObject jsonObject1 = new JSONObject(jsonTokener);
                JSONObject articlesData = jsonObject1.getJSONObject("data").getJSONObject("articles");
                JSONArray dataArray = articlesData.getJSONArray("data");
//                System.out.println(dataArray.length());

                for (int i1 = 0; i1 < dataArray.length(); i1++) {
                    JSONObject item = dataArray.getJSONObject(i1);
                    String urlJsonFix = item.getString("url");
                    String urlJson = "/" + urlJsonFix;

                    if (urlJson.equals(desiredUrl)) {
                        // Tìm thấy URL mà bạn muốn
                        JSONObject data = item.getJSONObject("data");
                        String anchor = data.getString("anchor");
                        String h1 = "h1 class=\"ttl\">" + anchor;

                        System.out.println("h1:" + h1);
                        assertTrue(pageSource.contains(h1));

                        String metaData = item.getString("meta_title");
//                        String decodedMetaData = StringEscapeUtils.unescapeHtml4(metaData);
                        String escapedString = StringEscapeUtils.escapeHtml4(metaData);


                        System.out.println("Meta_title:  " + escapedString);
                        assertTrue(pageSource.contains(escapedString));
                        System.out.println("Successfully");
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("done");
        }
    }

    @Test
    public void Author() {
        for (int i = 0; i < Routers.blogAuthor.length; i++) {
            String url = Support.Routers.BLOG_AUTHOR + Routers.blogAuthor[i];
            driver.get(url);
            String pageSource = driver.getPageSource();

            String containsURL = "url\":\"" + url;
            System.out.println("url:  " + url);
            assertTrue(pageSource.contains(containsURL));

            String canonical = "rel=\"canonical\" href=\"" + url;
            System.out.println("canonical:   " + canonical);
            assertTrue(pageSource.contains(canonical));

            String filePath = "test-output/FileJson/Authors.json";
            try (FileReader fileReader = new FileReader(filePath)) {
                JSONTokener jsonTokener = new JSONTokener(fileReader);
                JSONObject jsonObject1 = new JSONObject(jsonTokener);
                JSONObject articlesData = jsonObject1.getJSONObject("data").getJSONObject("authors");
                JSONArray dataArray = articlesData.getJSONArray("data");

                String desiredUrl = Routers.blogAuthor[i];

                for (int i1 = 0; i < dataArray.length(); i1++) {
                    JSONObject item = dataArray.getJSONObject(i);
                    String urlJson = item.getString("url");
                    if (urlJson.equals(desiredUrl)) {

                        String metaData = item.getString("meta_title");
                        String actualMetaTitle = driver.getTitle();

                        System.out.println("Meta_title:  " + metaData);
                        System.out.println("actualMetaTitle:  " + actualMetaTitle);
                        //titleTag
                        assertTrue(actualMetaTitle.equals(metaData));

                        System.out.println("Successfully");
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void Catelogy() {
        for (int i = 0; i < Routers.catelogy.length; i++) {
            String url = Support.Routers.BLOG_CATEGORY + Routers.catelogy[i];
            driver.get(url);
            String pageSource = driver.getPageSource();
            System.out.println(url);
            String containsURL = "url\":\"" + url;
            //Canonical
            assertTrue(pageSource.contains(containsURL));

            String canonical = "rel=\"canonical\" href=\"" + url;
            System.out.println("Pages: " + i + "/" + Routers.catelogy.length);
            System.out.println("canonical:   " + canonical);

            String desiredUrl = Routers.catelogy[i]; // URL mà bạn  muốn tìm kiếm
            System.out.println("desiredUrl:   " + desiredUrl);

            String filePath = "Test-output/FileJson/Categories.json";
            try (FileReader fileReader = new FileReader(filePath)) {
                JSONTokener jsonTokener = new JSONTokener(fileReader);
                JSONObject jsonObject1 = new JSONObject(jsonTokener);
                JSONObject articlesData = jsonObject1.getJSONObject("data").getJSONObject("categories");
                JSONArray dataArray = articlesData.getJSONArray("data");

                for (int i1 = 0; i1 < dataArray.length(); i1++) {
                    JSONObject item = dataArray.getJSONObject(i1);
                    String urlJsonFix = item.getString("url");
                    String urlJson = "/" + urlJsonFix;
                    System.out.println(urlJson);
                    System.out.println(desiredUrl);
                    if (urlJson.equals(desiredUrl)) {
                        // Tìm thấy URL mà bạn muốn

//                        String title = item.getString("title");
//                        String unescapedString = StringEscapeUtils.unescapeJava(title).trim();
//
//                        WebElement h1Tag = driver.findElement(By.xpath("//h1"));
//                        String h1Text = h1Tag.getText();
//                        System.out.println("escapedString:  " + unescapedString);
//
//                        //h1 tag
//                        assertTrue(h1Text.contains(unescapedString));

                        String metaData = item.getString("meta_title");
                        String actualMetaTitle = driver.getTitle();

                        System.out.println("Meta_title:  " + metaData);
                        System.out.println("actualMetaTitle:  " + actualMetaTitle);
                        //titleTag
                        assertTrue(actualMetaTitle.equals(metaData));

                        System.out.println("Successfully");
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("done");
        }
    }

    @Test
    public void BlogPost() {
        for (int i = 0; i < Routers.blogPost.length; i++) {

            String urlAuthor = Support.Routers.BaseURLAuthor + "/blog" + Routers.blogPost[i];
            String url = Support.Routers.BLOG + Routers.blogPost[i];
            driver.get(urlAuthor);

            String pageSource = driver.getPageSource();
            System.out.println(url);
            String containsURL = "url\":\"" + url;
            assertTrue(pageSource.contains(containsURL));

            String canonical = "rel=\"canonical\" href=\"" + url;
            assertTrue(pageSource.contains(canonical));
            System.out.println("Pages: " + i + "/" + Routers.blogPost.length);
            System.out.println("canonical:   " + canonical);

            String desiredUrl = Routers.blogPost[i]; // URL mà bạn  muốn tìm kiếm
            System.out.println("desiredUrl:   " + desiredUrl);

            String filePath = "Test-output/FileJson/Posts.json";
            try (FileReader fileReader = new FileReader(filePath)) {
                JSONTokener jsonTokener = new JSONTokener(fileReader);
                JSONObject jsonObject1 = new JSONObject(jsonTokener);
                JSONObject articlesData = jsonObject1.getJSONObject("data").getJSONObject("posts");
                JSONArray dataArray = articlesData.getJSONArray("data");
//                JSONObject postsData = jsonObject1.getJSONObject("data").getJSONObject("posts");
//                JSONArray dataArray = postsData.getJSONArray("data");
//                System.out.println(dataArray.length());

                for (int i1 = 0; i1 < dataArray.length(); i1++) {
                    JSONObject item = dataArray.getJSONObject(i1);
                    String urlJsonFix = item.getString("url");
                    String urlJson = "/" + urlJsonFix;
                    if (urlJson.equals(desiredUrl)) {
                        // Tìm thấy URL mà bạn muốn
                        String title = item.getString("title");
                        String unescapedString = StringEscapeUtils.unescapeJava(title);

                        WebElement h1Tag = driver.findElement(By.xpath("//h1"));
                        String h1Text = h1Tag.getText();
                        System.out.println("escapedString:  " + unescapedString);
                        assertTrue(h1Text.contains(unescapedString));

                        String metaData = item.getString("meta_title");
                        String actualMetaTitle = driver.getTitle();

                        System.out.println("Meta_title:  " + metaData);
                        System.out.println("actualMetaTitle:  " + actualMetaTitle);

                        assertTrue(actualMetaTitle.equals(metaData));
                        System.out.println("Successfully");
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("done");
        }
    }
}
