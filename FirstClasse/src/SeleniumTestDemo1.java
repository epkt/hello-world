import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new  ChromeDriver();
		driver.get("https://www.facebook.com");
		//String url = ("https://www.facebook.com"); other way to call object
		
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource()); 
		
	}

}
