import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTestDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("craft@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("password123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Forgot Account")).click();
		//driver.findElement(By.partialLinkText("Forgote")).click();
		//driver.close();
		


	}

}
