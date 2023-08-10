package selenium.assignment1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunchTest {
    public static void main(String[] args) throws InterruptedException {
        // Browser launch by webDriverManager
        WebDriverManager.firefoxdriver().setup();
        // The browser will get the object
        WebDriver driver=new FirefoxDriver();
        // Open parabank website
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        // Threads can be used to perform complicated tasks in the background without interrupting the main program
        Thread.sleep(1000);
        // Maximize the current window
        driver.manage().window().maximize();
        Thread.sleep(1000);
        // Close all current windows
        driver.quit();
    }
}
