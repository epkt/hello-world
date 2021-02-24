import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBusBudTest {

	public static void main(String[] args) throws InterruptedException { 
		// TODO Auto-generated method stub
		String Month = "February 2021";
		String day =" 13";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.busbud.com/");
		
		driver.findElement(By.id("origin-c1ty-input")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("origin-c1ty-input")).sendKeys("ne");
		Thread.sleep(2000);
		driver.findElement(By.id("origin-c1ty-input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	    driver.findElement(By.id("destination-c1ty-input")).sendKeys("lo");
		Thread.sleep(2000);
		driver.findElement(By.id("destination-c1ty-input")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.id("destination-c1ty-input")).sendKeys(Keys.ENTER);


	
		driver.findElement(By.id("passenger-input")).click(); //passenger box
		driver.findElement(By.xpath("//button[@aria-label='+Adults]")).click();//  Adult + sign //2adult by defolt
		driver.findElement(By.xpath("//a[@class='js-dropdown-close'])[3]")).click();//close button //i took from thruepath
		
		
		int i = 1;
		while(i<3) {
			driver.findElement(By.xpath("//button[@aria-label='+Adults]")).click();//  Adult + sign //2adult by defolt
      i++;  
	}
	
		
		int j = 1;
		while(j<3) {
			driver.findElement(By.xpath("//button[@aria-label='- Children']")).click();//  children + sign 
      j++;  
	}	
		driver.findElement(By.xpath("//div[@class='passenger-dropdown-section text-right pa-2 m-0'] //a[@class='js-dropdown-close']")).click();//close button parent@chiled	
     }
	
	
}	
	
	
	
	
	
	
	