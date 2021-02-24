import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateDatePickers {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		String Month="March 2021";
		String date= "20";
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();// Round trip radio
		
		Thread.sleep(3000);
		
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_2")).click();//Multiple city radio button
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); //departure box
		Thread.sleep(2000);
		
		   driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='IXB']")).click(); //departure city
		   Thread.sleep(3000);
		
		   driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='JSA']")).click();//Arrival city
		   
		 //input[@id='ctl00_mainContent_view_date1']"))//Depart date 
		   AutomateDatePickers date1 = new AutomateDatePickers() ;
		   date1.calander();
		   
	}
		   public void calander() {
			   
			   JavascriptExecutor jj = (JavascriptExecutor)driver;
			   jj.executeScript("document.getElementById('ctl00_mainContent_view_date1').value= '18/03/2021'");
			   jj.executeScript("document.getElementById('ctl00_mainContent_view_date2').value= '19/04/2021'");


			   
		      
//		   while (true)
//		   {
//			 String text= driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]")).getText();//January box
//			 
//			 System.out.println(text);
//			 
//			 if(text.equals(Month)) 
//			 {
//	           break;
//		    }
//	       else	 
//	       {
//		       driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//next month 
//	      }
//		   }
//	 List<WebElement> allDates = driver.findElements(By.xpath( "/html[1]/body[1]/div[2]/div[1]/table[1]/tbody[1]/tr/td/a[1]"));//buttons
//	   
//	 for(WebElement ele : allDates) {
//		 System.out.println(ele.getText());
//		 String dateexp = ele.getText();
//		  
//          if(dateexp.equals(date)){
//        	  ele.click();
//        	  break;
//          }
//        	            
//	 }	 
//		 
	} 
		   
}   
    		
	 	
	     
       

