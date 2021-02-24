import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AALinesEndtoendTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://www.aa.com/homePage.do");
       // driver.findElement(By.xpath("//span[@aria-hidden='true'][contains(.,'Vacation packages')]")).click(); //vacation packages
      //label[@for='flightSearchForm.tripType.roundTrip']
        driver.findElement(By.xpath("label[@for='flightSearchForm.tripType.roundTrip']")).click();//Round trip
        //driver.findElement(By.xpath("(//div[@class='row-form'])[3]")).click(); //String from
   
        //From/Deparchure
        driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys("New");// Box
        driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        
        //To/Arrival
        driver.findElement(By.xpath("//label[@for='reservationFlightSearchForm.destinationAirport']")).click();//String To
       driver.findElement(By.xpath("(//span[@class='icon icon-search'])[2]")).click();//serch button
        driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']")).sendKeys("Chicago"); //Box
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']")).sendKeys(Keys.ARROW_DOWN);
       Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']")).sendKeys(Keys.ENTER);
       

	}

}
