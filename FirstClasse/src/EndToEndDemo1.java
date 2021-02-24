import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndToEndDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("search_query_top")).sendKeys("T-Shirts");//Surch Box
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		//driver.findElement(By.id("selectProductSort")).sendKeys("higesst first");// Sort by box
		driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]")).click();// immage
		driver.findElement(By.id("quantity_wanted")).clear();//quantity box
	     driver.findElement(By.id("quantity_wanted")).sendKeys("3");// send numbers to the quantity box
				
//        int t= 1;
//        while(t<3);
//        {
//        driver.findElement(By.id("//a[@class='btn btn-default button-plus product_quantity_up']")).click();	//
//          ++t;        
//        } 
	 
       Select ss = new Select(driver.findElement(By.xpath("//select[@name='group_1']"))) ; //size
	     
//       ss.selectByIndex(2);
         ss.selectByValue("3");
//       //ss.selectByVisibleText("M");
//       driver.findElement(By.id("color_13")).click();//orange color by ID
        // driver.findElement(By.xpath("//a[contains(@name,'Blue')]")).click(); //blue color 
        driver.findElement(By.xpath("//a[@name='Orange']")).click(); // orange color
        driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click(); // Cart 
        driver.findElement(By.xpath("//a[contains(@title,'Proceed to checkout')]")).click();//procide to checkeout
        driver.findElement(By.xpath("(//a[contains(@title,'Proceed to checkout')])[2]")).click();// 2nd procide checkout 
        driver.findElement(By.id("email_create")).sendKeys("epkeye@gmail.com");
        driver.findElement(By.xpath("//button[@name='SubmitCreate']")).click();//create an account
       driver.findElement(By.id("id_gender1")).click();// gender M
       driver.findElement(By.id("customer_firstname")).sendKeys("Netsy");
       driver.findElement(By.id("customer_lastname")).sendKeys("Tade");
       driver.findElement(By.id("passwd")).sendKeys("12345");
       
       Select s =  new Select(driver.findElement(By.id("days")));
         s.selectByValue("8");
       Select sl = new Select(driver.findElement(By.id("months")));
       sl.selectByValue("6");
      
        Select sle = new Select(driver.findElement(By.id("years")));
          sle.selectByValue("2018");
      driver.findElement(By.id("newsletter")).click();      driver.findElement(By.id("optin")).click();
      driver.findElement(By.id("company")).sendKeys("salceforce");// company
      driver.findElement(By.id("address1")).sendKeys("13 cory st "); //address
      driver.findElement(By.id("city")).sendKeys(" cambridge");// city
      Select sse = new Select(driver.findElement(By.id("_state")));
      sse.selectByVisibleText("Massachusets");
      driver.findElement(By.id("postcode")).sendKeys("124799");
      driver.findElement(By.id("phone_mobile")).sendKeys("3264139898");
      driver.findElement(By.id("submitAccount")).click();
      
      
        }
       
}
	
