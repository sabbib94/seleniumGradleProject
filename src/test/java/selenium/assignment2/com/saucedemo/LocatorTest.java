package selenium.assignment2.com.saucedemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 FindElement method is used to find web element in the page
 ID attribute matches the search value
 SendKey is use for send value
 */

public class LocatorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(500);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(500);
        // An element within a form, then this will be submitted to the remote server
        driver.findElement(By.className("submit-button")).click();
        Thread.sleep(500);
        driver.quit();
    }
}
