import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindoSwitchHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		 // driver.get("https://www.salesforce.com");
		  driver.get("https://www.greyhound.com/en/ecommerce/schedule");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("(//span[contains(.,'Start my free trial')])[1]")).click();
		
		 
//	 Set<String>windowhandles= driver.getWindowHandles();
//		System.out.println(windowhandles);
//		
//		Iterator<String> iterator =windowhandles.iterator();
//		
//		String Parentwindow =iterator.next();
//		System.out.println(Parentwindow);
//		String childwindow =iterator.next();
//		System.out.println(childwindow);
//		driver.switchTo().window(childwindow);
		
	driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Ephron");//child id first name (username)
	driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Keye"); // 2nd name
	//driver.switchTo().window(Parentwindow);

				  
		}

	}

	


