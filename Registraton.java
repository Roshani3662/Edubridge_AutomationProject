package MainFunctionalities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Registraton {
  @Test
  public void f() throws Exception 
  {
	//Launch Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Automation Testing\\BrowserExtension\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		//URL
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		Thread.sleep(2000);
		//register-Name
	       driver.findElement(By.id("input-firstname")).sendKeys("Roshnsi");
	       Thread.sleep(2000);
	       
	       
	       //Lastname
	       driver.findElement(By.id("input-lastname")).sendKeys("patil");
	       Thread.sleep(2000);
	     //Email
	       driver.findElement(By.id("input-email")).sendKeys("patilroshania2104@gmail.com");
	       Thread.sleep(2000);
	       //Password
	    
	       driver.findElement(By.id("input-password")).sendKeys("patil@123");
	       Thread.sleep(2000);
	       //RadioButton
	       driver.findElement(By.id("input-newsletter-yes")).click();
	       Thread.sleep(2000);
	       //checkbox
	       driver.findElement(By.xpath("//input[@name='agree']")).click();
	       Thread.sleep(2000);
	       //button
	       driver.findElement(By.xpath("//button[@type='submit']")).click();
	       Thread.sleep(2000);
	     
  }
}
