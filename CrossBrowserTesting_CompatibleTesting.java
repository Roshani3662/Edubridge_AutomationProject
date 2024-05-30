package BasicFunctionalities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.time.Duration;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class CrossBrowserTesting_CompatibleTesting {
	@Test
	public void crossBrowserTesting() throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1 for GoogleChrome.\nEnter2 for MozillaFirefox.\nEnter 3 forMSEdge.");
		int choice = s.nextInt();

		WebDriver driver = null;

		switch (choice) {

		case 1:
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DELL\\Desktop\\Automation Testing\\BrowserExtension\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("***Welcome To Google Chrome*****");
			break;
		case 2:
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\DELL\\Desktop\\Automation Testing\\BrowserExtension\\msedgedriver.exe");
			driver = new EdgeDriver();
			System.out.println("***Welcome To Microsoft Edge*****");
			break;
		default:
			System.out.println("Incorrect Input.");

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Navigation Command
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/login&language=en-gb");

		driver.findElement(By.id("input-email")).sendKeys("patilroshania2104@gmail.com");
		Thread.sleep(2000);
		// password
		driver.findElement(By.id("input-password")).sendKeys("Bajaj@123");
		Thread.sleep(2000);
		// button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		// home botton
		driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();
		Thread.sleep(2000);
		
		//Screenshot
	    
	     TakesScreenshot ts =((TakesScreenshot)driver);
	     
	     File src=ts.getScreenshotAs(OutputType.FILE);
	     
	     File des=new File("./src/test/resources/Screenshots/Crossbrowser.png");
	     
	     FileUtils.copyFile(src, des);

	}

}
