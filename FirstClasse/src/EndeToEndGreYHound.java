import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndeToEndGreYHound {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.get("https://www.greyhound.com/");
		web.manage().window().maximize();
		//From departure
		web.findElement(By.id("fromLocation")).sendKeys("chicago,IL");
		web.findElement(By.id("fromLocation")).sendKeys(Keys.ARROW_DOWN);
		web.findElement(By.id("fromLocation")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//Arriveal City
		web.findElement(By.id("toLocation")).sendKeys("Boston, MA");
		web.findElement(By.id("toLocation")).sendKeys(Keys.ARROW_DOWN);
		web.findElement(By.id("toLocation")).sendKeys(Keys.ENTER);
		//calander 
//		WebElement dateBox1 = web.findElement(By.xpath("//input[contains(@id,'datepicker-from')]"));//depart date box
//		dateBox1.sendKeys("06/18/2021");
//		dateBox1.sendKeys(Keys.TAB);
//		
//		WebElement dateBox2 = web.findElement(By.xpath("//input[@class='form-control dp hasDatepicker']"));//arrival date box
//		dateBox2.sendKeys("07/24/2021");
//		dateBox2.sendKeys(Keys.TAB);
		
		web.findElement(By.xpath("//a[@aria-controls='passenger-panel']")).click();//Passengers box
		int i=1;
		while(i<3) {		
		web.findElement(By.xpath("(//button[@type='button'])[11]")).click(); //Adult 
		i++;
		}
		Thread.sleep(3000);
		int j=0;
		while(j<2) {		
		web.findElement(By.xpath("(//span[@class='icon icn-020pluswhite-lrg'])[3]")).click();//Children
		j++;
		
		}	
		
		Thread.sleep(3000);
		int k=0;
		while(k<2) {		
		web.findElement(By.xpath("(//button[@class='btn-ctrl plus'])[5]")).click();// sinear 
		k++;		
		}
		Thread.sleep(3000);
		web.findElement(By.id("ff-travel-discountoptions-button")).click();// Discount option Box
		//web.findElement(By.id("ff-travel-discountoptions-button")).sendKeys("Student Advantage");
	   web.findElement(By.id("ff-travel-discountoptions-button")).sendKeys(Keys.ARROW_DOWN);
	//web.findElement(By.id("ff-travel-discountoptions-button")).sendKeys(Keys.ARROW_DOWN);
		web.findElement(By.id("ff-travel-discountoptions-button")).sendKeys(Keys.ENTER);
		//web.findElement(By.id("ff-travel-promocode")).sendKeys("1234");//Promo code
		web.findElement(By.id("fare-search-btn")).click();//search
			
}	

}
