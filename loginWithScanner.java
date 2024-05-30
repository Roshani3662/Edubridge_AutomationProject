package MainFunctionalities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class loginWithScanner 
{
  @Test
  public void f() throws Exception
  {
	  Scanner s=new Scanner(System.in);
		System.out.println("Enter your username and password");
		String usn=s.next();
		String pwd=s.next();
		//Launch Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Automation Testing\\BrowserExtension\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		//URL
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		
		
		//UserName
		driver.findElement(By.id("input-email")).sendKeys(usn);
		Thread.sleep(2000);
	  //password
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		Thread.sleep(2000);
		//button
      driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		//homepage
      driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();
		Thread.sleep(2000);
		
		 //close browser
		//driver.close();


	}

}
