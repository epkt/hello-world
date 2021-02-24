import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrayHondeTest1 {
	
	static WebDriver web; 

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
		
		GrayHondeTest1 date = new GrayHondeTest1();
		date.calander();
		

	}
	public  void calander() throws InterruptedException {
		
		Thread.sleep(5000);
		
		JavascriptExecutor jj =(JavascriptExecutor)web;
		jj.executeScript("document.getElementById('datepicker-form').value ='02/19/2021'");
		Thread.sleep(3000);
		jj.executeScript("document.getElementById('datepicker-to').value ='02/25/2021'");
	}

}













