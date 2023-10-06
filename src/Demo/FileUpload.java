package Demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
class FileUpload{
	public static void main(String[] args) throws InterruptedException {

    	ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajeswari.marripudi\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
        // Initialize the Chrome driver
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/upload");
		//we want to import selenium-snapshot file. 
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\rajeswari.marripudi\\Downloads\\1684034092109.jpg");
	 Thread.sleep(20000);
		driver.findElement(By.id("file-submit")).submit();
		if(driver.getPageSource().contains("File Uploaded!")) {
			System.out.println("file uploaded");
		}
		else{
				System.out.println("file not uploaded");
			}
		//driver.quit();
	}
}

  