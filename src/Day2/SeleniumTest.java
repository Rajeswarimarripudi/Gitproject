package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest {
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rajeswari.marripudi\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		// Initialize the Chrome driver
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://the-internet.herokuapp.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"/dropdown\"]")).click();
		System.out.println("Clicked on dropdown link");
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("Option 2");
		System.out.println("Option selected in dropdown");
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("Navigated  back to home page");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"/upload\"]")).click();
		driver.findElement(By.id("file-upload"))
				.sendKeys("C:\\Users\\rajeswari.marripudi\\Downloads\\1684034092109.jpg");
		Thread.sleep(20000);
		driver.findElement(By.id("file-submit")).submit();
		if (driver.getPageSource().contains("File Uploaded!")) {
			System.out.println("file uploaded");
		} else {
			System.out.println("file not uploaded");
		}
		driver.switchTo().newWindow(WindowType.TAB);

		System.out.println("Opened new tab");

		driver.get("http://the-internet.herokuapp.com/frames");
		driver.findElement(By.xpath("//a[@href=\"/iframe\"]")).click();
		// Store the web element
		WebElement iframe = driver.findElement(By.id("mce_0_ifr"));

		// Switch to the frame
		driver.switchTo().frame(iframe);

		// Now we can click the button

		driver.findElement(By.tagName("p")).clear();
		driver.findElement(By.tagName("body")).sendKeys("Data entered into the text box");
		System.out.println("Data entered into iframe textbox");
		Thread.sleep(10000);

		driver.quit();

	}

}
