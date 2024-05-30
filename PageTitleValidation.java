package BasicFunctionalities;

import java.util.Scanner;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PageTitleValidation
{
	WebDriver driver;// Globally Declaration

	@Test
	public void PageTitleValidation() 
	{
		//Validation using two ways
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 1 for validating URL Testing using conditional statements.\nEnter 2 for validating URL Testing using Assert Class.");
		int choice=s.nextInt();

		// Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Desktop\\Automation Testing\\BrowserExtension\\chromedriver.exe");

		// Initialize ChromeDriver
		driver = new ChromeDriver();

		String expectedTitle = "https://demo.opencart.com/";
		String actualTitle = driver.getTitle();
		
		// Navigate to the page you want to verify
		driver.get(expectedTitle);

		switch(choice)
		{
		case 1: 
			if(expectedTitle.equals(actualTitle))
			{
				System.out.println("URL Testing passed.");
			}
			else
			{
				System.out.println("URL Testing failed.");
			}
			break;
		case 2:
			
			Assert.assertEquals(expectedTitle, actualTitle, "PageTitleValidationPage");

			break;
		default: System.out.println("Invalid Selection");	
		}
		// Close the browser
		driver.close();
	}

}
