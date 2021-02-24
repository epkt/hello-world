import org.openqa.selenium.By;
 
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderHandlingTest {

    static WebDriver driver; //crat this mathod to js driver

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();   //?
		driver.get("http:www.spicejet.com");
		
		
		CalanderHandlingTest cal = new CalanderHandlingTest();//creat object by class name to call js method
		cal.calenderscripthandling();
		
		
	}
	public void calenderscripthandling() {

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();// round trip radio button
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('ctl00_mainContent_view_date1').value ='06/02'");// Depart date
		js.executeScript("document.getElementById('ctl00_mainContent_view_date2').value = '10/03'");//Arrival date
	
}
}
