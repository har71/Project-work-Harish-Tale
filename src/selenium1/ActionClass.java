package selenium1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args)
	{
    System.setProperty("webdriver.chrome.driver","E:\\Selenium2\\chromedriver_win32\\chromedriver.exe");
     
    WebDriver driver= new ChromeDriver();
    System.out.println("browser is opened");
     
    driver.manage().window().maximize();
    System.out.println("browser is maximized");
    
    driver.get("https://www.saucedemo.com");
    System.out.println("url is opened");
    
    WebElement userName= driver.findElement(By.xpath("//input[@name='user-name']"));
    userName.sendKeys("standard_user");
    System.out.println("userName is entered");
    
    WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
    password.sendKeys("secret_sauce");
    
     WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login-button']"));                         //input[@id='login-button']
    //loginBtn.click(); or below ActionClassmethod
   
     //login button
    //we can click with mouseAction as well
    //Actions class
     
     Actions act= new Actions(driver); //driver refVar
    act.click(loginBtn).perform();    //put element //perform for proper run
    System.out.println("clicked on login button");
    
    
    
	}

}
