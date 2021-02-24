import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.get("https://www.instagram.com");
         
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Ephro@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123457");
        driver.findElement(By.xpath("(//div[contains(.,'Log In')])[6]")).click();
        
        //driver.close();
       // driver.getPageSource();
        
        Thread.sleep(3000);
        
        String exptitle= "instagram";
        String acctitle = driver.getTitle(); //return the title of the page
        if(exptitle.equals(acctitle)) {
        	System.out.println("test is passed");
        }
        else {
        	System.out.println("test is failed");
        }
	}

}
