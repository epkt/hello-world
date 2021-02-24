import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		
		web.get("http://automationpractice.com/index.php");
		//web.findElement(By.id("search_query_top")).click();
		web.findElement(By.name("search_query")).sendKeys("T-shirt");
		web.findElement(By.name("submit_search")).click();

	}

}
