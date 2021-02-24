import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalHandBus {
	
    static WebDriver driver;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		  driver = new ChromeDriver();
		  String url="https:/www.busbud.com/";
		  driver.get(url);
		  
		  CalHandBus date = new CalHandBus();
		  date.calenderJs();

	}
    public void calenderJs() {
    	
    	//driver.findElement(By.id("roundtrip-toggler")).click();
    	
    	JavascriptExecutor j =(JavascriptExecutor)driver; 	
    	j.executeScript("document.getElementById('outbound-date-input').value = 'Sa,Feb 20'"); //departure date
    	j.executeAsyncScript("document.getElementById('return-date-input').value = ' fri,Aug 13'");//Returne date
    	
    }
}
