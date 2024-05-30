package BasicFunctionalities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class MultipleTestExecution 
{ 
	Select s;
	WebDriver driver;
 
  @BeforeClass
  public void beforeClass() 
  {
		 
			  WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
		      driver.manage().window().maximize();
		      driver.manage().deleteAllCookies();
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  }
  
  @Test(priority = 3, description = "")
  public void AddToCart_ProductDescription() throws Exception 
  {
	  //URL
      driver.get("https://demo.opencart.com/");
      Thread.sleep(2000);
      //AddToCart=tablet
      JavascriptExecutor js= (JavascriptExecutor)driver;
	  WebElement element=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/form/div/div[2]/div[1]/h4/a"));
	  js.executeScript("arguments[0].scrollIntoView()", element);
	  Thread.sleep(2000);
	  //IPhone
      driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/form/div/div[2]/div[1]/h4/a")).click();
      Thread.sleep(2000);
      WebElement element1=driver.findElement(By.xpath("//*[@id=\"button-cart\"]"));
	  js.executeScript("arguments[0].scrollIntoView()", element1);
	  Thread.sleep(2000);
	  //Addtocart
      driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).sendKeys(Keys.ENTER);
      Thread.sleep(2000);
      //Goto on AddToCart
      WebElement element2=driver.findElement(By.xpath("//*[@id=\"header-cart\"]/div/button"));
	  js.executeScript("arguments[0].scrollIntoView()", element2);
      driver.findElement(By.xpath("//*[@id=\"header-cart\"]/div/button")).sendKeys(Keys.ENTER);
      Thread.sleep(2000);
  }
  
  @Test(priority = 2, description = "")
  public void m2() throws InterruptedException
  {    //URL
      driver.get("https://demo.opencart.com/");
      Thread.sleep(2000);
	  //component
	  driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[3]/a")).click();
      Thread.sleep(2000);
      //monitor
      driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[3]/div/div/ul/li[2]/a")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"button-list\"]")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"button-list\"]")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//Select[@id='input-sort']")).click();
      Thread.sleep(2000);
		//Dropdown>>TagName must be <select>
		//Step1:Create object Select Class
	 s=new Select(driver.findElement(By.xpath("//Select[@id='input-sort']")));
		s.selectByIndex(3);
		Thread.sleep(2000);
		 s=new Select(driver.findElement(By.xpath("//select[@id='input-limit']")));
			s.selectByIndex(3);
			Thread.sleep(2000);
			//AddToCart
			  //Add to Caert
			JavascriptExecutor js= (JavascriptExecutor)driver;
			WebElement element1=driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[3]/div/div/ul/li[2]/a"));
		      Thread.sleep(2000);
			  js.executeScript("arguments[0].scrollIntoView()", element1);
			  Thread.sleep(4000);
		      driver.findElement(By.xpath("//*[@id=\"product-list\"]/div[2]/form/div/div[2]/div[2]/button[1]")).sendKeys(Keys.ENTER);
		      Thread.sleep(4000);
    
    
  }
 


@Test(priority = 1, description = "")
  public void m3() throws Exception
  {
	//URL
    driver.get("https://demo.opencart.com/");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[1]/a/i")).click();
    Thread.sleep(4000);
    JavascriptExecutor js= (JavascriptExecutor)driver;
	WebElement element1=driver.findElement(By.xpath("//*[@id=\"information-contact\"]/ul/li[2]/a"));
      Thread.sleep(2000);
	  js.executeScript("arguments[0].scrollIntoView()", element1);
	  Thread.sleep(4000);
	  //name
	  driver.findElement(By.id("input-name")).sendKeys("Roshani");
      Thread.sleep(2000);
      //email
	  driver.findElement(By.id("input-email")).sendKeys("patilroshania2104@gmail.com");;
	  Thread.sleep(2000);
	  //Enquiry text box
      driver.findElement(By.id("input-enquiry")).sendKeys("Getting payment issue want the help for successful online payment");;
      Thread.sleep(2000);
      //Submit button
      driver.findElement(By.xpath(" //button[@type='submit']")).sendKeys("Getting payment issue want the help for successful online payment");;
      Thread.sleep(2000);
   
      TakesScreenshot ts =((TakesScreenshot)driver);
	     
	     File src=ts.getScreenshotAs(OutputType.FILE);
	     
	     File des=new File("./src/test/resources/Screenshots/multipleTest.png");
	     
	     FileUtils.copyFile(src, des);

  }
  
  @AfterClass
  public void afterClass()
  {
	  driver.close();
  }

}
