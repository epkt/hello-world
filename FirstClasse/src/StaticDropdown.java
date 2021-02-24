import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
 		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

		
		driver.findElement(By.id("divpaxinfo")).click();
		Select A = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		A.selectByIndex(3);
		
		Thread.sleep(3000);
		
	    Select c = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
	    c.selectByValue("2");
	    
	    Thread.sleep(2000);
	    Select i = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
	    i.selectByVisibleText("2");

	}

}
