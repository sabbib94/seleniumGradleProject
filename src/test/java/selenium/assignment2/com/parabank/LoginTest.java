package selenium.assignment2.com.parabank;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        Thread.sleep(1000);
        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys("sqa");
        Thread.sleep(500);
        // The CSS Selector combines an element selector and a selector value that can identify particular elements on a web page.
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("sqa");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        Thread.sleep(500);
        driver.quit();
    }
}
