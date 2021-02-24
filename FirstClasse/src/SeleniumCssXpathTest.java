import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCssXpathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();
			driver.get("https://www.facebook.com");
//			driver.findElement(By.cssSelector("input[name= 'email']")).sendKeys("craftkeye@gmail.com");
//			driver.findElement(By.cssSelector("input[id= 'pass']")).sendKeys("pass2323");
//			driver.findElement(By.cssSelector("button[name= login]")).click();
		
//		driver.get("https://www.facebook.com");
//		driver.findElement(By.cssSelector("input#email")).sendKeys("craftkeye@gmail.com");
//		driver.findElement(By.cssSelector("input#pass")).sendKeys("pass2323");
//		driver.findElement(By.cssSelector("button#loginbutton")).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("craftkeye@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234m");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
