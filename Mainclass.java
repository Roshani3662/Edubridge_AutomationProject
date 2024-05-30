package KeywordDrivenFramework;

import KeywordDrivenFramework.ReadExcelClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Mainclass 
{
    public static void main(String[] args) throws Exception
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Automation Testing\\BrowserExtension\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        ReadExcelClass r= new ReadExcelClass();    
     r.readExcel(driver);
    }

}

