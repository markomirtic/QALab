package testCases;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.nio.channels.NotYetBoundException;

public class LoginTest {
    @Test
    public void firsTest() {
        WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();

    }

}
