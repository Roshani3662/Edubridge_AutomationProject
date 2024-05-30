package BasicFunctionalities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_Main_OpenCart {

	
		
		public static void main(String[] args) throws Exception
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Automation Testing\\BrowserExtension\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
					
			//Create object of POM class
			POM_OpenCart p=new POM_OpenCart();
			
			//Calling Methods
			p.maximizeBrowser(driver);
			p.deleteAllCookies(driver);
			p.implicitWait(driver);
			p.url(driver);
			p.menubar1(driver);
			p.Login_menubar1(driver);
			p.username(driver,"patilroshania2104@gmail.com");
			p.password(driver,"Bajaj@123");
			
			
		}


	}


