package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotPractice
{
  static WebDriver driver;
  public static void screenShotMethod(String name) throws IOException
  {
	  TakesScreenshot ts= (TakesScreenshot)driver;
	  File sourceFile= ts.getScreenshotAs(OutputType.FILE);
	  File destFile=new File("C:\\ScreenShotFile\\" + name +" .jpg");
	  FileHandler.copy(sourceFile, destFile);
  }
public static void main(String[]args) throws IOException
{
	System.setProperty("webdriver.chrome.driver","E:\\Selenium2\\chromedriver_win32\\chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.saucedemo.com");
	System.out.println("URl is opened");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	screenShotMethod ("LoginPage");
	System.out.println("login Page ScreenShottaken");
	
	//LoginActivity
	WebElement userName=driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]"));
	userName.sendKeys("performance_glitch_user");
	System.out.println("UserName is entered");
	
	WebElement passWord=driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]"));
	passWord.sendKeys("secret_sauce");
	System.out.println("PassWord is entered");
	
	WebElement loginBtn=driver.findElement(By.xpath("//input[@id='login-button']"));
	loginBtn.click();
	System.out.println("Clicked on login button");
	
	System.out.println("Went on homePage");
	
	screenShotMethod("HomepageScreenShot");
	System.out.println("Home page screenShot taken");
	
	driver.close();
	System.out.println("browser is closed");
	System.out.println("End of Program");
}
}

	


