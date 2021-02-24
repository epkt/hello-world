import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssAndXpathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ephron ketema\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
      String url= ("https://www.facebook.com");
       driver.get(url); 
       
//       System.out.println(driver.getTitle());
//       System.out.println(driver.getCurrentUrl());
//       System.out.println(driver.getPageSource());
//       
//       driver.findElement(By.id("email")).sendKeys("ephrone");
//       driver.findElement(By.name("pass")).sendKeys("12345e");
//       driver.findElement(By.name("login")).click();
//       driver.findElement(By.linkText("Forgot account?")).click();
//       driver.findElement(By.partialLinkText("forgot")).click();
       
                //1)css= tagname[attribute = 'values']
    		   // Ex.   input[type = email] 
    		 //2)css= tagname#id
    		 //input[name= 'username]
    		 //Ex. input#username
    		 //3)   Tag.class
       
       
//       driver.findElement(By.cssSelector("input[name='email']")).sendKeys("craft@gmail.com");
//       driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("12345kt");                                                                                       // ---------------------
//       driver.findElement(By.cssSelector("button[name='login']")).click(); 
             
//       driver.findElement(By.cssSelector("input#email")).sendKeys("craft@gmail.com");
//       driver.findElement(By.cssSelector("input#pass")).sendKeys("12345kt");
//       driver.findElement(By.cssSelector("button#login")).click(); //?
       //driver.findElement(By.cssSelector("button#_42ft_4jy0_52e0_4jy6_4jy1 selected_51sy")).click();
       
                                 // xpath Format
                                 // --------------
                                  //xpath = //tagname[@atribute= 'value']
                                  //= //input[@id='usernam']
       
                                                                                    
         driver.findElement(By.xpath("//input[@name='email']")).sendKeys("keyetade");  
         driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234kt");
         driver.findElement(By.xpath("//button[@name='login']")).click();
                                                                                               
                                                                                               
                                                                                               
       
       
        
	}

}
