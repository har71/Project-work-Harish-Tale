package selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExplicit {

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	
	WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
	userName.sendKeys("standard_user");
	
	WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("secret_sauce");
	
	//explicit wait
   
   WebDriverWait expWait= new WebDriverWait(driver,Duration.ofSeconds(30));
   WebElement loginBtn = expWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='login-button']"))));
   loginBtn.click();
   

	 
	}

	}


