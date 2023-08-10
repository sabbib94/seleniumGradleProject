package selenium.assignment2.com.printlinks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * List of web element
 * FindElements method is used to find all web element in the page
 * A tagName method to find elements by their HTML tag name
 */

public class PrintAllLinks {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        Thread.sleep(1000);
        driver.manage().window().maximize();


        List<WebElement> webElements=driver.findElements(By.tagName("a"));
        int size=webElements.size();
        System.out.println("Tag name size: "+size);
        System.out.println("Print all links: ");
        for(WebElement webElement:webElements){
            System.out.println(webElement.getAttribute("href"));
        }
        driver.quit();
    }
}
