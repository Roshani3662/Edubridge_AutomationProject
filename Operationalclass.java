package KeywordDrivenFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Operationalclass {

	public void maximizeBrowser(WebDriver driver) throws Exception
	{
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void deleteAllCookies(WebDriver driver) throws Exception
	{
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
	}
	public void implicitWait(WebDriver driver) throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
	}
	public void url(WebDriver driver) throws Exception
	{
		driver.get("https://demo.opencart.com/");
		Thread.sleep(2000);
	}
	public void menubar1(WebDriver driver) throws InterruptedException
	{
	driver.findElement(By.xpath("//i[@class='fas fa-user']")).click();
	Thread.sleep(2000);
	}
	public void Login_menubar1(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		}
	
	public void username(WebDriver driver,String Email) throws InterruptedException
	{
		//UserName
		driver.findElement(By.id("input-email")).sendKeys(Email);
		Thread.sleep(2000);
	}
	public void password(WebDriver driver,String Password) throws InterruptedException
	{
		driver.findElement(By.id("input-password")).sendKeys(Password);
		Thread.sleep(2000);
	}
	public void loginButton(WebDriver driver) throws Exception
	{
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(2000);
		 
	}
	public void home(WebDriver driver) throws InterruptedException
	{
		  driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();
		  Thread.sleep(2000);
	}
	public void menubar(WebDriver driver) throws InterruptedException
	{
	driver.findElement(By.xpath("//i[@class='fas fa-user']")).click();
	Thread.sleep(2000);
	}
	public void logout(WebDriver driver) throws InterruptedException
	{
		 driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/ul/li[5]/a")).click();
			Thread.sleep(2000);

	}



}
