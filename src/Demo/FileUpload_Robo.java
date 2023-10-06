package Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload_Robo {
	public static void main(String[] args) throws InterruptedException, AWTException {

    	ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajeswari.marripudi\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
        // Initialize the Chrome driver
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize(); // maximizing window
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);// for page load
        driver.get("https://www.grammarly.com/plagiarism-checker");// open testing website
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// for Implicit wait

		JavascriptExecutor js = (JavascriptExecutor) driver; // Scroll operation using Js Executor
		js.executeScript("window.scrollBy(0,200)"); // Scroll Down(+ve) upto browse option
		Thread.sleep(2000); // suspending execution for specified time period

		WebElement browse = driver.findElement(By.linkText("Upload a file"));
		// using linkText, to click on browse element
		browse.click(); // Click on browse option on the webpage
		Thread.sleep(2000); // suspending execution for specified time period

		// creating object of Robot class
		Robot rb = new Robot();

		// copying File path to Clipboard
		StringSelection str = new StringSelection("\"C:\\Users\\rajeswari.marripudi\\Downloads\\1684034092109.jpg\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		// press Contol+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}
}