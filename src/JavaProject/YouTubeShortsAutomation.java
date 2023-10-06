package JavaProject;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class YouTubeShortsAutomation {
    public static void main(String[] args) throws InterruptedException {
        // Replace with the path to your Chrome driver executable


    	
    	ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajeswari.marripudi\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
        // Initialize the Chrome driver
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.youtube.com/@chillax4063");

        // Wait for the YouTube homepage to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tabsContent")));
//Thread.sleep(2000);
        // Click on the "Shorts" button in the navigation bar
        WebElement shortsButton = driver.findElement(By.xpath("//div[text()=\"Shorts\"]"));
        shortsButton.click();

        // Wait for the Shorts page to load
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("contents")));

        // Find all the shorts on the page
        java.util.List<WebElement> shorts = driver.findElements(By.xpath("//a[contains(@href,'/shorts/') and @id=\"thumbnail\"]"));
System.out.println(shorts);
int count =shorts.size();
System.out.println(count);
        // Loop through the shorts and view them one by one
        for (int i=1;i<=count;i++) {
        	driver.findElement(By.xpath("(//a[contains(@href,'shorts') and @id=\"thumbnail\"])["+i+"]")).click();

            // Wait for the short to load
          //  wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("video")));

            // Wait for a few seconds to view the short
           
                // Adjust the time delay as needed
        	Thread.sleep(20000);  
            // Go back to the Shorts page
            driver.navigate().back();

            // Wait for the Shorts page to load again
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tabsContent")));
        }

        // Close the browser
        driver.quit();
  
    }
}
