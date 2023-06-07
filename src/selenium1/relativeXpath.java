package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativeXpath {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");	

		WebDriver driver = new ChromeDriver();

	    driver.get("https://www.saucedemo.com/");
	    System.out.println("url is opened");
		Thread.sleep(3000);
		
	    
		
		//loginActivity
	    //username ele +_action
	   WebElement userName =  driver.findElement(By.xpath("//form//div[1]//input"));
	   userName.sendKeys("standard_user");
	   System.out.println("userName is entered");
	  
	   
	 
	   //password ele + action
	   WebElement password =  driver.findElement(By.xpath("//form//div[2]//input"));
	   password.sendKeys("secret_sauce");
	   Thread.sleep(3000);
	   System.out.println("password is entered");
	 
	   
	    //loginbtn ele + action
	   WebElement loginBtn =  driver.findElement(By.xpath("(//form//input)[3]"));
	   loginBtn.click();
       System.out.println("you should go on homepage");
	   Thread.sleep(3000);
	}

}
