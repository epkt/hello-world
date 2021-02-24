import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EndToEndBus {
	
	  static WebDriver web;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.gecko.driver","C:\\Users\\ephron ketema\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
       WebDriver web = new FirefoxDriver();
       String url = "https://www.busbud.com/";
       web.get(url);
		
       //departure 
//		web.findElement(By.xpath("//select[@id='roundtrip-toggler']")).click(); //round trip button
		Thread.sleep(3000);
		web.findElement(By.id("origin-c1ty-input")).sendKeys("newy");// depart box
		Thread.sleep(2000);
		web.findElement(By.id("origin-c1ty-input")).sendKeys(Keys.ENTER);
		//web.findElement(By.id("origin-c1ty-input")).sendKeys(Keys.ARROW_DOWN);
		// Arraival
		web.findElement(By.id("destination-c1ty-input")).sendKeys("lond");
		Thread.sleep(2000);
		web.findElement(By.id("destination-c1ty-input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		web.findElement(By.id("destination-c1ty-input")).sendKeys(Keys.ARROW_DOWN);
       
       	//Depart Dat
//       EndToEndBus dat = new EndToEndBus();
//       dat.calenderscripthandling();
//       
//       
		
    	
    	JavascriptExecutor j =(JavascriptExecutor)web; 	
    	j.executeScript("document.getElementById('outbound-date-input').value = 'Sa,Feb 20'"); //departure date
    	j.executeAsyncScript("document.getElementById('return-date-input').value = ' fri,Aug 13'");//Returne date	
		
		
		
//	}
//	public void calenderscripthandling() throws InterruptedException {
//		
//		web.findElement(By.xpath("//select[@id='roundtrip-toggler']")).click(); //round trip button
//		JavascriptExecutor js = (JavascriptExecutor)web;
//	js.executeScript("document.getElementById('outbound-date-input').value='Sun, Apr 18'");
//		Thread.sleep(3000);
//	js.executeScript("document.getElementById('return-date-input').value='Tue, May 4'");
		
		//passenger
	    web.findElement(By.xpath("//button[@data-cy='search-submit-inline']")).click(); //serch buton
		web.findElement(By.id("passenger-input")).click(); //passenger box
		
		int i = 1;
		while(i<4) {
			web.findElement(By.xpath("//button[@aria-label='+ Adults']")).click();  //Adult + button(2Adult)
		i++;
		}
		
		int c = 1;
		while(c<1) {
			web.findElement(By.xpath("//button[@aria-label='+ Children']")).click(); //Child + button
		c++;
		}
		int k = 1;
		while(k<2) {
			web.findElement(By.xpath("//button[contains(@aria-label,'+ Seniors')]")).click(); //Senior + button
		k++;
		web.findElement(By.xpath("(//a[@class='js-dropdown-close'])[3]")).click(); //The close button
		
	}
	
	
	}

}












