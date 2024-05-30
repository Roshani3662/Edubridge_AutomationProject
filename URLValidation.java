package BasicFunctionalities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Scanner;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class URLValidation
{
  WebDriver driver;
  @Test
  public void URL_Validation() throws InterruptedException 
  {
	  Scanner s= new Scanner(System.in);
	  System.out.println("Enter 1 to Validate URL Testing using Conditional Statement.\nEnter 2 to Validate URL Testing using Assert Class.");
	  int choice=s.nextInt();
	  		//Launch Browser
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Automation Testing\\BrowserExtension\\chromedriver.exe");
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
			Thread.sleep(2000);
			
			switch(choice)
			{
			case 1: 
				//URL Validation
				String expectedURL=("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
				String actualURL=driver.getCurrentUrl();
				if(expectedURL.equals(actualURL))
				{
					System.out.println("URL Validation is passed");
				}
				else
				{
					System.out.println("failed");
				}
				break; 
			case 2:
				String expectedURL1=("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
				System.out.println("Expected URL:"+ expectedURL1);

				String actualURL1=driver.getCurrentUrl();
				System.out.println("Actual URL:"+ actualURL1);
				
				Assert.assertEquals(expectedURL1, actualURL1,"URL Validation Failed.");
				break;
				
				default: System.out.println("Invalid Selection");
			}	
	 }
}
