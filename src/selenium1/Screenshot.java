package selenium1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","E:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
	   ChromeDriver driver = new ChromeDriver(co);	
		
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("url is opened");
		
		//ScreenShot
		//step1--> use TakesScreenshot interface
		//casting of driver  into TakesScreenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
	    //ts.getScreenshotAs(null);  //screenshot save at byte (010101format)
		
		
		//we convert this screenshot in file format  
		//OutputType.FILE class use to convert byte to file format
		//1) screenshot in sourceFile  location?
		
		//location?
		File sourceFile= ts.getScreenshotAs(OutputType.FILE);
		
		//2)destination file create to copy ss. file at particular place
		//use for location
		//but dest file is empty
		File destFile=new File("C:\\ScreenShotFile\\saucedemologinpage.jpg");
		
		//3)FileHandlerClass   copy method-->source file to destFile
		FileHandler.copy(sourceFile, destFile);
		System.out.println("login page ss. taken");
		
		
		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));	   
		  userName.sendKeys("standard_user");
		   
		  WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		  password.sendKeys("secret_sauce");
		  
		  WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login-button']"));    
		  loginBtn.click();
		  
		  System.out.println("Went to homePage");
		  
			
		}

	}

