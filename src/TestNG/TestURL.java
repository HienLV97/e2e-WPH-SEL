package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Support.Constants;
import Support.Routers;

import static Support.Routers.BaseURL;

public class TestURL {
    public static void main(String[] args) {
        // Thiết lập đường dẫn đến ChromeDriver (phải tải về và cài đặt trước)
//        System.setProperty("webdriver.chrome.driver", "đường_dẫn_đến_chromedriver.exe");

        // Khởi tạo trình duyệt (ở đây sử dụng Chrome)
        WebDriver driver = new ChromeDriver();
        Routers Routers = new Routers();
        for (int i = 0; i < Routers.serviceLink.length; i++) {
            String url = BaseURL + Routers.serviceLink[i];
            driver.get(url);
            String pageSource = driver.getPageSource();
            if (pageSource.contains("url\":\""+url)) {

                System.out.println("url\":\"" + BaseURL + Routers.serviceLink[i]);
                System.out.println("Chuỗi đã được tìm thấy trong mã nguồn HTML.");
            } else {
                System.out.println("url\":\"" + BaseURL + Routers.serviceLink[i]);
                System.out.println("Chuỗi không tồn tại trong mã nguồn HTML.");
            }
        }


        // Đóng trình duyệt sau khi kiểm tra
        driver.quit();
    }
}
