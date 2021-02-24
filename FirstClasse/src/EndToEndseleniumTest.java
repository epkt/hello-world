import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEndseleniumTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String month = "March 2021";
		String days = "13";
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.southwest.com/");
		
		driver.manage().window().maximize();
		//Radio button
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();//
			
		//Departure
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(.,'Depart')])[3]")).click();//Depart string
		driver.findElement(By.xpath("//input[@id='LandingAirBookingSearchForm_originationAirportCode']")).sendKeys("boston logan");//Deparcher box
		
		driver.findElement(By.xpath("//input[@id='LandingAirBookingSearchForm_originationAirportCode']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='LandingAirBookingSearchForm_originationAirportCode']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//Arrival
		
		driver.findElement(By.xpath("(//span[@class='form-control--label'])[2]")).click();//Arraival string
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("MDW");//Arrival box
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(Keys.ARROW_DOWN);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(Keys.ENTER);
		
	    driver.findElement(By.xpath("(//span[@class='form-control--label'])[3]")).click();//Depart String
	    while(true)
	    {
	    String text = driver.findElement(By.xpath("(//div[@class='calendar-month--title'])[1]")).getText();	//String month 2021
	    //System.out.println(text);
	    if(text.equals(month)) {
	    	break;
	    }
	    else {
	    	driver.findElement(By.xpath("(//span[@role='presentation'])[85]")).click();// next button
	    }
	    	    
	    }
	   List<WebElement>allDates= driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[10]/button"));
	   for(WebElement e:allDates) {
		   System.out.println(e.getText());
		   String dateexp = e.getText();
		   if(dateexp.equals(days)) {
			   e.click();
			   break;
		   }
	  }
	   Thread.sleep(3000);
	   String returnmonth = "June 2021"; 
	   String returnday = "13";
	   while(true) {
		   String text = driver.findElement(By.xpath("(//div[@class='calendar-month--title'])[1]")).getText();
		   System.out.println(text);
		   if(text.equals(returnmonth)) {
			   break;
		   }
		   else {
			   driver.findElement(By.xpath("(//span[@role='presentation'])[85]")).click();  
		   }
		   
		  }
	   List<WebElement>Dates= driver.findElements(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[10]/button"));
	   for(WebElement w:Dates) {
		   System.out.println(w.getText());
		   String dateexp = w.getText();
		   if(dateexp.equals(returnday)) {
			   w.click();
			   break;
	}
	
	
	   }
		driver.findElement(By.xpath("(//span[contains(.,'Points')])[3]")).click(); // radio point button
		driver.findElement(By.xpath("(//span[contains(.,'Passengers')])[3]")).click(); //passenger string
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("2"); // Box passenger
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("12345");   //promo code
		driver.findElement(By.xpath("(//button[@type='button'])[15]")).click(); // Search button
		System.out.println("very great job");
	}

}



