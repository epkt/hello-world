import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); //X sighn 
		driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]")).sendKeys("iphone 12 pro max 256GB");//Serch Box
		driver.findElement(By.id("//button[contains(@class,'L0Z3Pu')]")).click(); // Surch button
		driver.findElement(By.xpath("//div[@class='_4rR01T'][contains(.,'Apple iPhone 12 Pro Max (Pacific Blue, 128 GB)')]")).click();

	}

}
