import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndToEndDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    driver.get("http://automationpractice.com/index.php");
	    driver.findElement(By.id("search_query_top")).sendKeys("dresses");
	    driver.findElement(By.xpath("//button[@name='submit_search']")).click();//search
	    driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[1]")).click();//printed chiffon
	    
	    int i=1;
	    while(i<3)
	    {
	    	driver.findElement(By.xpath("(//a[@data-field-qty='qty'])[2]")).click();//quantity
	    	i++;
	    }
	    Select s=new Select(driver.findElement(By.xpath("//select[contains(@id,'group_1')]")));//size
	    //s.selectByVisibleText("L");
	    s.selectByValue("1");
	   // s.selectByIndex(2);
	    driver.findElement(By.xpath("//a[contains(@name,'Green')]")).click();//color
	    driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();//add to cart
	    driver.findElement(By.xpath("//a[contains(@title,'Proceed to checkout')]")).click();//proceed to checkout1
	    driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();//ptco2
	    driver.findElement(By.id("email_create")).sendKeys("ephron@gmail.com");
	   // driver.findElement(By.id("Password")).sendKeys("123456");
	    driver.findElement(By.xpath("//button[@name='SubmitCreate']")).click();
	    driver.findElement(By.id("id_gender2")).click();
	    driver.findElement(By.id("customer_firstname")).sendKeys("Misraki");
	    driver.findElement(By.id("customer_lastname")).sendKeys("Abebe");
	    driver.findElement(By.id("passwd")).sendKeys("12345");
	    
	    Select x=new Select(driver.findElement(By.xpath("//select[contains(@name,'days')]")));
	    x.selectByValue("10");
	    
	    Select y=new Select(driver.findElement(By.id("months")));
	    y.selectByValue("9");
	    
	    Select z=new Select(driver.findElement(By.id("years")));
	    z.selectByValue("1990");
       driver.findElement(By.id("newsletter")).click();
       driver.findElement(By.id("company")).sendKeys("craft");
       driver.findElement(By.id("address1")).sendKeys("addis ababa");
       driver.findElement(By.id("city")).sendKeys("addis ababa");
      
       Select w=new Select(driver.findElement(By.id("id_state")));
	    w.selectByValue("6");
	    driver.findElement(By.id("postcode")).sendKeys("77892");
	    driver.findElement(By.id("phone")).sendKeys("124445678");
	    driver.findElement(By.id("submitAccount")).click();
	    driver.findElement(By.xpath("(//button[contains(@type,'submit')])[2]")).click();
	    driver.findElement(By.id("cgv")).click();
	    driver.findElement(By.xpath("(//button[contains(@type,'submit')])[2]")).click();
	    driver.findElement(By.xpath("//a[@class='bankwire']")).click();
	    driver.findElement(By.xpath("(//button[contains(@type,'submit')])[2]")).click();
	    
	    
	

	}

	}


