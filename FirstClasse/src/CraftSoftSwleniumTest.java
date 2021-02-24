import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CraftSoftSwleniumTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("http://shop.icraftsoft.net:8095/?");
		
//		driver.findElement(By.xpath("//input[@value='Register']")).click();
//		Thread.sleep(30000);
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Ephrone");
//		Thread.sleep(30000);
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("epkt12@gmail.com");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@value='Register']")).click();// registore button
//		
//		driver.findElement(By.xpath("//input[@value='Login']")).click();//login button
//		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1981");//login Id
//		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("dell pc");
//		driver.findElement(By.xpath("//input[@type='search']")).click();//serch
//		driver.findElement(By.xpath("(//button[contains(.,'Add to cart')])[3]")).click();//add cart
//		driver.findElement(By.xpath("//a[@href='/cart'][contains(.,'Cart (1)')]")).click();//clik on cart to shopp
//		driver.findElement(By.xpath("//input[@id='btn2']")).click();//buy now
	
	

	}

}
