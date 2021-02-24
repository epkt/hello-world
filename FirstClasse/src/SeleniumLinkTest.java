import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.southwest.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	 
		 driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		 
		 List<WebElement> AllTags = driver.findElements(By.tagName("div"));
		 System.out.println("The total number of tag:"+ AllTags.size());
		 
		 // CHEACK OR UNCHEACK BOXES
		 
		 System.out.println(driver.findElement(By.xpath("(//input[@type='radio'])[3]")).isSelected()); //Dollar Box
		 driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();                          //Dollar Box
		// System.out.println(driver.findElement(By.xpath("(//input[@type='radio'])[3]")).isSelected()); //Dollar Box
		 
		 System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());
			
			for(int i=0;i< AllTags.size();i++)
				{
			System.out.println("The number of link are:"+ AllTags.get(i).getAttribute("href"));
			System.out.println(AllTags.get(i).getText());
			

			}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
