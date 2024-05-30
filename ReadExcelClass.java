package KeywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;



public class ReadExcelClass {

	public void readExcel(WebDriver driver) throws Exception {
		 FileInputStream file= new FileInputStream("C:\\Users\\DELL\\Desktop\\Automation Testing\\POI\\POI1.xlsx");
		    XSSFWorkbook w= new  XSSFWorkbook(file);
		    XSSFSheet s=w.getSheet("KDT");
		    
		    int size=s.getLastRowNum();
		    System.out.println("No of keywords: "+size);
		    
		    Operationalclass o=new  Operationalclass();
		    
		    for(int i=1; i<=size; i++)
		    {
		        //Store keywords in variables
		        String key=s.getRow(i).getCell(0).getStringCellValue();
		        System.out.println(key);
		        
		        //Execute process as per the Excel Sheet keywords with Operational Class methods: Conditional Statements
		        if(key.equals("Maximize Browser"))
		        {
		            o.maximizeBrowser(driver);
		        }
		        else if(key.equals("Delete All Cookies"))
		        {
		            o.deleteAllCookies(driver);
		        }
		        else if(key.equals("wait"))
		        {
		            o.implicitWait(driver);
		        }
		    
		        else if(key.equals("Enter URL"))
		        {
		            o.url(driver);
		            Thread.sleep(2000); 
		        }
		        else if(key.equals("Login_menubar1"))
		        {
		           o.Login_menubar1(driver);
		        }
		        
		        else if(key.equals("Enter Username"))
		        {
		            o.username(driver, "patilroshania2104@gmail.com");
		            Thread.sleep(2000);
		        }
		        else if(key.equals("Enter Password"))
		        {
		            o.password(driver, "Bajaj@123");
		            Thread.sleep(2000);
		        }
		        else if(key.equals("Click On Login Button"))
		        {
		            o.loginButton(driver);
		            Thread.sleep(2000);
		        }
		     
		        else if(key.equals("Close Browser"))
		        {
		        	FileOutputStream out=new FileOutputStream("C:\\Users\\DELL\\Desktop\\Automation Testing\\POI\\POI1.xlsx");
		        	  w.write(out);
		        	
		        }        
		    }
		}
		
		
	}



