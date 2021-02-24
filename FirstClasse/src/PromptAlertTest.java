import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver web = new ChromeDriver();
        String url = "https://www.rahulshettyacademy.com/AutomationPractice/";
        web.get(url);
        
        //For posetive responce
        
        web.findElement(By.id("name")).sendKeys("Ephrone"); 
        web.findElement(By.id("confirmbtn")).click(); // conferme or accept responce
        System.out.println( web.switchTo().alert().getText()); 
        
       Thread.sleep(3000);
         web.switchTo().alert().dismiss();// negative responce
        // web.switchTo().alert().accept(); //posetive responce

	}

}
