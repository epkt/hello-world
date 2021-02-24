



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLinkTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ephron ketema\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https:www.southwest.com");
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		List<WebElement> AllTags = driver.findElements(By.tagName("div"));
		System.out.println("the number of tages are:" +AllTags.size());
		
		for(int i=0;i< AllTags.size();i++)
			{
		System.out.println("The number of link are:"+ AllTags.get(i).getAttribute("href"));
		System.out.println(AllTags.get(i).getText());
		

		}
		
		
		
	}

}
