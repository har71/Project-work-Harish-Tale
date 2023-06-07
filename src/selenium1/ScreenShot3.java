package selenium1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot3 
{
	static WebDriver driver;
	
public static void ScreenshotMethod(String name) throws IOException 
{

	TakesScreenshot ts = (TakesScreenshot)driver;
	
	File sourceFile1= ts.getScreenshotAs(OutputType.FILE);
	
	File destFile1 = new File("C:\\ScreenShotFile\\saucedemologinpage"+ name +".jpg"); 
	
	FileHandler.copy(sourceFile1, destFile1);
	System.out.println("login page ss taken");
	
}
	public static void main(String[] args) throws IOException
	{
	System.setProperty("webdriver.chrome.driver","E:\\Selenium2\\chromedriver_win32\\chromedriver.exe");
    
	//WebDriver driver= new ChromeDriver();
	//already converted WebDriver into global variable
	//hence
	
	driver= new ChromeDriver();
	System.out.println("browser is opened");
	driver.manage().window().maximize();
	System.out.println("browser is maximized");
	driver.get("https://www.saucedemo.com/");
	 System.out.println("url is opened");
     
	 //screenshot1
	 ScreenshotMethod("loginPage");
	 System.out.println("login page screenshot is taken");
	 
	 //login Activity
		WebElement userName= driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys("standard_user");
		
		WebElement passWord= driver.findElement(By.xpath("//input[@id='password']"));
		passWord.sendKeys("secret_sauce");
		
		WebElement loginBtn= driver.findElement(By.xpath("//input[@id='login-button']"));
		loginBtn.click();
		
		
		System.out.println("home page is open");
		
		//screenshotMethod2
		ScreenshotMethod("HomePage");
		System.out.println("home page screenshot is taken");
		
		
	 
	}
}
