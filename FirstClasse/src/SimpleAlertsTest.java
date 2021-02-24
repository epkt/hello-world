import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver web = new ChromeDriver();
        String url = "https://www.rahulshettyacademy.com/AutomationPractice/";
        web.get(url);
        
        web.findElement(By.id("name")).sendKeys("Ephrone"); // Simple Alert
        web.findElement(By.id("alertbtn")).click(); // Click on Alert button to get a message on the screan
        System.out.println( web.switchTo().alert().getText()); //Get the text on console
        
        web.switchTo().alert().accept(); //(responce)Switch to alert to axept and to be continued the next test on sane window
       
        
        

	}

}
