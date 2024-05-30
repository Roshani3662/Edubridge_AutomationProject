package BasicFunctionalities;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ParallelTesting_CheckingDDT_UsingGoogleChrome 
{ 
  WebDriver driver;
  @BeforeTest
  public void beforeTest() 
  {//"Checking Login Functionality of SwagLab with Multiple Credentials"
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Automation Testing\\BrowserExtension\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
  }
	
  @Test(priority = 1,dataProvider = "dp",description = "Checking Login functionality of SwagLab with multiple credentails.")
  public void opencart(String username, String password) throws Exception
  {  
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  	 POM_OpenCart p=new  POM_OpenCart();
	  	    //p.implicitWait(driver);
	  	  	p.url(driver);
	  		p.menubar1(driver);
	  		p.Login_menubar1(driver);
	  		p.username(driver, username);
	  		p.password(driver,password);
	  		p.loginButton(driver);			
	  		p.home(driver);
	  		
  }


  @DataProvider//Test Management which is 2D array stores username and password.
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] { "patilroshania2104@gmail.com", "Bajaj@1234" },
      new Object[] { "patilroshania2104@yahoo.com", "Bajaj@12345" },
      new Object[] { "patilroshania2104@gmail.com", "Bajaj@1234" }, 
    };
  }


  @AfterTest
  public void afterTest() 
  {
  	  driver.close();
  }

  }