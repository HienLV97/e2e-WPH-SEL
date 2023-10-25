package Test.fisrtPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        // Thiết lập đường dẫn đến ChromeDriver (phải tải về và cài đặt trước)
//        System.setProperty("webdriver.chrome.driver", "đường_dẫn_đến_chromedriver.exe");

        // Khởi tạo trình duyệt (ở đây sử dụng Chrome)
        WebDriver driver = new ChromeDriver();

        // Mở trang web bạn muốn kiểm tra
        String url = "https://writersperhour.dev/buy-persuasive-essay";
        driver.get(url);

        // Lấy mã nguồn HTML của trang
        String pageSource = driver.getPageSource();

        // Kiểm tra xem chuỗi "url\":\"https://writersperhour.dev/buy-persuasive-essay" có tồn tại trong mã nguồn HTML hay không
        if (pageSource.contains("url\":\""+url)) {
            System.out.println("url\":\"https://writersperhour.dev/buy-persuasive-essay");
            System.out.println("Chuỗi đã được tìm thấy trong mã nguồn HTML.");
        } else {
            System.out.println("url\":\"https://writersperhour.dev/buy-persuasive-essay");
            System.out.println("Chuỗi không tồn tại trong mã nguồn HTML.");
        }

        // Đóng trình duyệt sau khi kiểm tra
        driver.quit();
    }
}
