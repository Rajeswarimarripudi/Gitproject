package Demo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

public static void main(String[] args) throws InterruptedException {

	ChromeOptions options = new ChromeOptions();
    options.addArguments("--remote-allow-origins=*");
    
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajeswari.marripudi\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
    // Initialize the Chrome driver
    WebDriver driver = new ChromeDriver(options);
    driver.manage().window().maximize();

driver.manage().window().maximize();

driver.get("https://www.browserstack.com/");

Actions a = new Actions(driver);


//Double click on element

WebElement trialaction = driver.findElement(By.xpath("//a[@id='signupModalButton']"));

a.doubleClick(trialaction).perform();
driver.close();
   }

}