import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver4 = new ChromeDriver();
		 
		driver4.get("https://login.salesforce.com/");
		
       driver4.findElement(By.id("username")).sendKeys("craft@gmail.com");
       driver4.findElement(By.id("password")).sendKeys("password123");
       driver4.findElement(By.id("login")).click();

        
    	

//       driver4.findElement(By.name("username")).sendKeys("craft@gmail.com");
//       driver4.findElement(By.name("pw")).sendKeys("password123");
//       driver4.findElement(By.name("login")).click();
        
        
        
//        driver4.findElement(By.className("input r4 wide mb16 mt8 username")).sendKeys("craftsoft");
//        driver4.findElement(By.className("input r4 wide mb16 mt8 password")).sendKeys("123456");
//        driver4.findElement(By.className("button r4 wide primary")).click();
       
//       driver4.findElement(By.linkText("Forgot Your Password?")).click();
//       driver4.findElement(By.partialLinkText("password?")).click();
        
        
        
        

	}
	

}
