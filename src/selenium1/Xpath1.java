package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium2\\chromedriver_win32\\chromedriver.exe");	

		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");

		//maximize
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");

		
	    driver.get("https://www.saucedemo.com/");
	    System.out.println("url is opened");

	    
	    //loginActivity
	    WebElement userName =  driver.findElement(By.xpath("//input[@id='user-name']"));
	    userName.sendKeys("standard_user");     //action perform
	    System.out.println("Username is entered");
	  
	    
	    
	    //password enter
	    WebElement password =  driver.findElement(By.xpath("//input[@name='password']"));
	    password.sendKeys("secret_sauce");
	    System.out.println("Password is entered");

	    
	    //click on login
	    WebElement loginBtn =  driver.findElement(By.xpath("//input[@id='login-button']"));
	   loginBtn.click();
	   System.out.println("clicked on login button");

	    
	    //home page should open
	   System.out.println("went on home page");
	   
	   System.out.println("Apply verification");
	    
	   
	   //BA//PO//DEV--->acceptance criteria
	   String expectedTitle = "Swag Labs";  //given
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



