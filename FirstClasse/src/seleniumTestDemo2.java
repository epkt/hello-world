import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumTestDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\ephron ketema\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		    WebDriver driver2 = new FirefoxDriver();
            String mywabe = "https://www.facebook.com";
            driver2.get(mywabe);
            
           System.out.println(driver2.getTitle());
           System.out.println(driver2.getCurrentUrl());
           System.out.println(driver2.getPageSource());
                 
           driver2.findElement(By.id("email")).sendKeys("ephrone");
           driver2.findElement(By.id("pass")).sendKeys("1206peas");
           driver2.findElement(By.id("login")).click();
//            driver2.findElement(By.linkText("Forgot account?")).click();
//            driver2.findElement(By.partialLinkText("Forgot")).click();
            
             
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
	}
	
}
