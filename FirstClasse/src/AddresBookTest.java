import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AddresBookTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ephron ketema\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        driver.get("http://a.testaddressbook.com/sign_in");
        
        driver.findElement(By.id("session_email")).sendKeys("ephrone@gmail.com");//Email addres
        Thread.sleep(4000);
        driver.findElement(By.id("session_password")).sendKeys("123456789");// pass word
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();//login
     
        driver.findElement(By.xpath("(//a[@class='nav-item nav-link'])[1]")).click();//
        driver.findElement(By.xpath("//a[@href='/addresses/new']")).click();//new addresse
        driver.findElement(By.id("address_first_name")).sendKeys("ephrone");
        driver.findElement(By.id("address_last_name")).sendKeys("keye");
        driver.findElement(By.id("address_street_address")).sendKeys("65 hommer Ave");
        driver.findElement(By.id("address_secondary_address")).sendKeys("402 Rindge Ave");
        driver.findElement(By.xpath("//input[@name='address[city]']")).sendKeys("Cambridge");
        
        Select sel = new Select(driver.findElement(By.xpath("//select[contains(@name,'address[state]')]")));//State
        sel.selectByIndex(21);
        //sel.selectByValue("MA");
        //sel.selectByVisibleText("Massachusets");
        
        driver.findElement(By.id("address_zip_code")).sendKeys("02140");//zip code
        driver.findElement(By.id("address_country_us")).click();// country
        //Date
      WebElement box = driver.findElement(By.id("address_birthday"));// ??
      box.sendKeys("06/28/1990");
      box.sendKeys(Keys.TAB);
       
        
//        JavascriptExecutor jss = (JavascriptExecutor)driver;
//        jss.executeScript("document.getElementById('address_birthday').value='06/28/1990'");
        
//       //String colure select = "FF0000"
       JavascriptExecutor j = (JavascriptExecutor)driver;
       j.executeScript("document.getElementById('address_color').value= '#FF0000'");
       
       driver.findElement(By.id("address_age")).sendKeys("31");
       driver.findElement(By.id("address_website")).sendKeys("https://www.ethiopian.com");//??
       driver.findElement(By.id("address_picture")).sendKeys("C:\\Users\\ephron ketema\\Downloads\\Telegram Desktop\\DiscussionDemo2.java");//??? Pictures
       
       driver.findElement(By.id("address_phone")).sendKeys("1234567");
       driver.findElement(By.id("address_interest_read")).click();
       driver.findElement(By.id("address_note")).sendKeys("Qa test is fun");
       driver.findElement(By.name("commit")).click();



       
      
	}

}
