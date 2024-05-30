package BasicFunctionalities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SmokeTesting_MouseHover {
  @Test
  public static void main(String[] args) throws InterruptedException
	{ 
		//Launch Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Automation Testing\\BrowserExtension\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//url
		driver.get("https://demo.opencart.com/");
		Thread.sleep(2000);
		//**********MouseHover***************
				//Step1:Create object Actions class
				Actions a=new Actions(driver);
				//step2Create List for webelements
				List<WebElement>ls=driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li"));
				//step3:store list size in variable
				int size=ls.size();
				System.out.println("No Of Modules:"+size);
				Thread.sleep(2000);
				//Step4:loop
				for(int i=1;i<=11;i++)
				{
					//wait
					Thread.sleep(2000);
					//Display all modules name
					System.out.println(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li["+i+"]")).getText());
					Thread.sleep(2000);
					//perform Mouse Hover
					a.moveToElement(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li["+i+"]"))).click().perform();
					Thread.sleep(2000);
				}
						
				
	}
			}
