package MainFunctionalities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;

import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LginWithJoptionPane {
  @Test
  public void f() throws Exception 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Automation Testing\\BrowserExtension\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//URL
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		Thread.sleep(2000);
		//usn
		
		String usn=JOptionPane.showInputDialog("Enter Username: ");
		driver.findElement(By.id("input-email")).sendKeys("patilroshaniabhijit@gmail.com");
	
		//pwd
		String pwd=JOptionPane.showInputDialog("Enter Password: ");
		driver.findElement(By.id("input-password")).sendKeys("Bajaj@123");
		
		//button
      driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		TakesScreenshot ts =((TakesScreenshot)driver);
	     
	     File src=ts.getScreenshotAs(OutputType.FILE);
	     
	     File des=new File("./src/test/resources/Screenshots/Login.png");
	     
	     FileUtils.copyFile(src, des);
		//close browser
		driver.close();


  }
  

}
