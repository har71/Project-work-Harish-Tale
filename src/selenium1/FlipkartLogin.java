package selenium1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartLogin {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium2\\chromedriver_win32\\chromedriver.exe");	

		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");

		//maximize
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		
		//url open
		driver.get("https://www.flipkart.com/");
		System.out.println("url is opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//login Activity
		WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
        login.sendKeys("7249753920");
        System.out.println("Clicked on login button");
        //Thread.sleep(3000);
        
        //entermobnumber
        WebElement mobno = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	    mobno.sendKeys("7249753920");
	    System.out.println("Mobile number is entered");
	    //Thread.sleep(3000);
	    
	    Alert alt = driver.switchTo().alert();
	    alt.dismiss();
	     
	    //request OTP
	    WebElement Otp = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	    Otp.click();
	    System.out.println("Clicked on request otp button ");
	    
	    
	     //click on verify button
	    WebElement VBtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _14EHzR _3dESVI']"));
	    VBtn.click();
	    
		//Fashion button
		WebElement FashionBtn= driver.findElement(By.xpath("//img[@alt='Fashion']"));
		//Actions Class
		Actions act= new Actions(driver);
		act.moveToElement(FashionBtn).perform();
		//FashionBtn.click();
		
	    //WebElement Mfashion = driver.findElement(By.partialLinkText("Men's T-Shirts"));
		// Mfashion.click();
		 
	    driver.getTitle();
	    
	   driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Tshirts");
	   //searchBtn.sendKeys("");
	    
    String title= driver.getTitle();
	    System.out.println("title is"+title);
	    
	    String Url = driver.getCurrentUrl();
	    System.out.println("current url is" + Url);
	    

		System.out.println("went on home page");
		 System.out.println("Apply verification");
		    
		
		 
		   //BA//PO//DEV--->acceptance criteria
		   String expectedTitle = "//www.flipkart.com/";  //given
		   //for URL
		   String actualTitle = driver.getTitle();
		   
		  if(expectedTitle.equals(actualTitle))
		  {
			  System.out.println("login test cases pass");
		  }
		  else
		  {
			  System.out.println("login test cases fail");
		  }
		  driver.close();
		  System.out.println("Browser is closed");
		  System.out.println("End of program");
				
}

}
