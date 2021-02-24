import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDainamicStaticTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ephron ketema\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");

       
        //CURRENCY
//		  s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
//        s.selectByIndex(4);
//        
//		s.selectByValue("BDT");
//		s.selectByVisibleText("USD"); // visibleText and value may  different from values 
		
		//PASSENGERS
		
//		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click(); //to click passenger button
//		
//		Select A = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
//		A.selectByIndex(4);
//		
//		Thread.sleep(2000);
//		
//		Select c = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
//		c.selectByValue("2");
//		
//		Thread.sleep(2000);
//		
//		Select i = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
//		i.selectByVisibleText("1");
		
		
		// Dynamic From Departure
		
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();//click on departure box
//		
//		driver.findElement(By.xpath("//a[@value='KQH']")).click(); //click on selected city
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		
		//Departure by PARENT & CHILD
		
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		//driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BHO']")).click(); //departure
		Thread.sleep(4000);
		
		//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOP']")).click(); //Arrival
		 
		//Thread.sleep(3000);
		
        // TO Check each box
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());//false

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected()); //true
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());//To check number of box(size)
		


		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		//Round Trip Button(RadioButton)
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		//Departure Button
		//driver.findElement(By.xpath("//input[contains(@id,'ctl00_mainContent_ddl_originStation1_CTXT')]")).click();
		//driver.findElement(By.xpath("//a[@value=GAY")).click();
		
		//Thread.sleep(4000);
		
		//Arrival Button
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		
//		//Callander
       // driver.findElement(By.id("ctl00_mainContent_view_date1")).click();//Depart date
		//driver.findElement(By.id("//a[@class='ui-state-default ui-state-highlight'][contains(.,'23')]")).click();//Arrival date.
		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		
		//driver.findElement(By.xpath("//*[@id='Div1']/button")).click();
		
		//Passenger
		//driver.findElement(By.id("divpaxinfo")).click();
		
//		Select sel= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
//		sel.selectByValue("3");
//		
//		Thread.sleep(4000);
//		 Select sel1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
//		 sel1.selectByIndex(1);
//		 
//		 Thread.sleep(4000);
//		 
//		 Select sle2 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
//		 sle2.selectByVisibleText("3");
//		 
//		 Thread.sleep(20000);
//			
//		Select ss = new Select (driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
//        ss.selectByVisibleText("USD");
//		
//		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
        
	}
}
