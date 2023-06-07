package selenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AleartPopUp {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium2\\chromedriver_win32\\chromedriver (2).exe");

		ChromeOptions co=new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
	   ChromeDriver driver = new ChromeDriver(co);	
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		//Thread.sleep(3000);
		
	    driver.get("https://demoqa.com/alerts");
	    System.out.println("url is opened");
	    //Thread.sleep(3000);
	    
	    //loginActivity
	   WebElement ClickMe1= driver.findElement(By.xpath("//button[@id='alertButton']"));
	   ClickMe1.click();
	   
	   //will get alert
	   //selenium-->switch-->webpage to alert
	   //we can switch selenium from webpage to alert
	   //alert interface
	   
	   
	   Alert alt = driver.switchTo().alert();
	   
	   //alert interface has the methods to handle alerts
	   
	   alt.accept();  //accept method will help you to click on OK.
	   
	   
	   //click me2
	   WebElement ClickMe2= driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
	   ClickMe2.click();
	
	   //will get alert after 5 sec.
	  // Thread.sleep(7000);
	   
	   alt.accept();
	  System.out.println("click2 accepted");
	 //---------------------------------------------------------------------------------- 
	   //ClickMe3
	   WebElement ClickMe3= driver.findElement(By.xpath("//button[@id='confirmButton']"));
	   ClickMe3.click();
	   
	   alt.accept();
	   System.out.println("click3 accepted");
	   System.out.println("Apply verification");
	   String expected3= "You selected Ok";
	   WebElement actual3=driver.findElement(By.xpath("//span[@id='confirmResult']"));
	   if(expected3.equals(actual3))
	   {
		   System.out.println("test case is pass");
	   }
	   else
	   {
		   System.out.println("test case is fail");
	   }
	   
	//clickMe4
	   WebElement ClickMe4= driver.findElement(By.xpath("//button[@id='promtButton']"));
	   ClickMe4.click();
	   System.out.println("clicked on fourth click");
	  // Thread.sleep(3000);
	   //type any text in the text box
	   alt.sendKeys("harish");
	   System.out.println("Name entered in the text box");
	   alt.accept();
	   System.out.println("acceptance4");
	   
	   
	 
	   
	   
	   
	   
	   alt.accept();
	   
	}

}
