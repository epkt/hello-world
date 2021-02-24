import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.get("https://www.makemytrip.com/");
		web.manage().window().maximize();
//		web.findElement(By.xpath("//span[text()='From']")).click();//String From
//		web.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("sydney"); //Box
//		web.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
//		web.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);

		//Minimize codes
		
		web.findElement(By.xpath("//span[text()='From']")).click();
		WebElement from = web.findElement(By.xpath("//input[@placeholder='From']"));
		from.sendKeys("Sydney");
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);


	}
	
}
