import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver3 = new ChromeDriver();
		
		//String url = ("https://www.ethiotelecom.et"); or
		driver3.get("https://www.ethiotelecom.et");
		
		System.out.println(driver3.getTitle());
		System.out.println(driver3.getCurrentUrl());
		System.out.println(driver3.getPageSource());
	}

}
