package MainFunctionalities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SearchForProduct_Description
{
  @Test
  public void f() throws Exception
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Automation Testing\\BrowserExtension\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//URL
		driver.get("https://demo.opencart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("MacBook");
		driver.findElement(By.xpath("//i[@class='fas fa-search']")).click();
		driver.close();
		
  }
  
}
