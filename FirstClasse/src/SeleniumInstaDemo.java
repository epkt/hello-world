

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumInstaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver web1 = new ChromeDriver();
        //String url = ("https://www.instagram.com"); Or
		web1.get("https://www.instagram.com");
		
		web1.findElement(By.xpath("//input[@name='username']")).sendKeys("ephronek");

//		web1.findElement(By.name("password")).sendKeys("epkt12");
		
		//web1.findElement(By.cssSelector("input[@name='username']")).sendKeys("ephrone");
		//web1.findElement(By.cssSelector("input[@name='password']")).sendKeys("1206ep");
		//web1.findElement(By.xpath("//div[contains(.,'Log In')])[6]")).click();
		
		//web1.close();
		//Thread.sleep(4000);
		
		//String newtitle = "instagram";
		// String aewtitel = web1.getTitle(); // returns the title of the page
		 
//		 if(newtitle.equals(aewtitel)) {		 
//		 }
//         System.out.println("test is passed");
//	    }
//	else
//	   { 
//		System.out.println("test is failed");
	   }   
}
	


