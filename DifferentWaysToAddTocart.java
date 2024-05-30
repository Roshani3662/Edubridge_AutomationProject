package MainFunctionalities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentWaysToAddTocart 
{
	WebDriver driver;
	@BeforeTest
	  public void beforeTest() 
	  {
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  }
	 
  @Test
  public void AddToCart_ProductDescription() throws InterruptedException 
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
  @Test
  public void AddToCart_search() throws InterruptedException //Defect
  {
      //URL
      driver.get("https://demo.opencart.com/");
      Thread.sleep(2000);
      //Search-box
      driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("phone");
      //Search-Button
      driver.findElement(By.xpath("//*[@id=\"search\"]/button")).sendKeys(Keys.ENTER);
      Thread.sleep(5000);
  }
  @Test
  public void AddToCart_Symbol() throws InterruptedException, IOException 
  {
      //URL
      driver.get("https://demo.opencart.com/");
      Thread.sleep(2000);
      //Scroll to Addtocart symbol
      JavascriptExecutor js= (JavascriptExecutor)driver;
	  WebElement element=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/form/div/div[2]/div[2]/button[1]"));
	  js.executeScript("arguments[0].scrollIntoView()", element);
	  Thread.sleep(2000);
	  
      //AddToCart_Symbol
      driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/form/div/div[2]/div[2]/button[1]")).click();
      
      //Scroll to Addtocart symbol
	  WebElement element1=driver.findElement(By.xpath("//*[@id=\"header-cart\"]/div/button"));
	  js.executeScript("arguments[0].scrollIntoView()", element1);
	  Thread.sleep(2000);
	  
      //Goto on AddToCart
      driver.findElement(By.xpath("//*[@id=\"header-cart\"]/div/button")).sendKeys(Keys.ENTER);
      Thread.sleep(2000);
      
      TakesScreenshot ts =((TakesScreenshot)driver);
	     
	     File src=ts.getScreenshotAs(OutputType.FILE);
	     
	     File des=new File("./src/test/resources/Screenshots//AddToCart.png");
	     
	     FileUtils.copyFile(src, des);
      
  }
 

  @AfterTest
  public void afterTest() 
  {
	 driver.close();
  }
}