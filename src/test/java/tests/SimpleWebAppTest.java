package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleWebAppTest {

    @Test
    public void testWebApp() {
    	

    	WebDriverManager.chromedriver().setup();
  
        // ChromeDriver path
//        System.setProperty("webdriver.chrome.driver",
//                "C:\\chromedriver\\chromedriver.exe");

        // HEADLESS MODE (IMPORTANT for Jenkins)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);

        driver.get("http://localhost:9090/simple-webapp");

        System.out.println("Title: " + driver.getTitle());

        driver.quit();
    }
}