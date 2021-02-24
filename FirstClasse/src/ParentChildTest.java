import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParentChildTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.gecko.driver","C:\\Users\\ephron ketema\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		       WebDriver web= new FirefoxDriver();
		      // String url= ("https://www.spicejet.com/");
		      // web.get("url");
		       web.get("https://www.spicejet.com/");
		       
		       web.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		       
		       web.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GWL']")).click();
		       
		       Thread.sleep(300);
		       web.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click();
              
		   // CHEACK OR UNCHEACK BOXES
		   System.out.println(web.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());//senior box
		   
		   web.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		    System.out.println(web.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		    
		    System.out.println(web.findElements(By.xpath("(//input[@type='checkbox'])")).size());//the string checkbox is common type attribute for all box
		                                                                                         //even if there is some hidden box
		    Thread.sleep(3000);
		    //Calendar current day
		    System.out.println(web.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")));
		       
		       
		       
		       
		       
		       
		       
		       
	}

}
