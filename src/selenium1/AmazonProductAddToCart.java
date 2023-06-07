package selenium1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AmazonProductAddToCart 
{

	public static void main(String[] args)  
	{

		System.setProperty("webdriver.chrome.driver","E:\\Selenium2\\chromedriver_win32\\chromedriver.exe");	

		ChromeOptions co=new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
	   ChromeDriver driver = new ChromeDriver(co);	

		//maximize
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
				
		//url open
		driver.get("https://www.amazon.in/");
		System.out.println("url is opened");
		
		
      WebElement login= driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
      login.click();
      
      //mobnumber
      WebElement userName= driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
      userName.sendKeys("7249753920");
      System.out.println("username is entered");
      
      WebElement ContnClick= driver.findElement(By.xpath("//input[@id='continue']"));
      ContnClick.click();
      System.out.println("Clicked on continue button");
      
      WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
      password.sendKeys("Harish@7143");
      System.out.println("password is entered");
      
      WebElement SigninClick = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
      SigninClick.click();
      System.out.println("Clicked on signin Button=");
      
      WebElement searchBtn= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
      searchBtn.sendKeys("smart watch");
      System.out.println("product searched");
      
      //driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
      
      
      WebElement ClicksearchBtn= driver.findElement(By.xpath("//input[@type='submit']"));
      ClicksearchBtn.click();
      System.out.println("Clicked on search button");
      
      WebElement product = driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
      product.click();
      
      //to switch from one page to another page
      List<String > x= new ArrayList<String>(driver.getWindowHandles());
      driver.switchTo().window(x.get(1));
      
     WebElement AddToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
     // WebElement AddToCart = driver.findElement(By.xpath("(/html/body/div[2]/div[2]/div[5]/div[4]/div[1]/div[3]/div/div[1]/div/div/div/form/div/div/div/div/div[3]/div/div[32]/div[1]/span/span/span/input"));
      Actions act= new Actions(driver);
      act.click(AddToCart).perform();
     // AddToCart.click(); 
      
      WebElement Cart = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
      Actions act2= new Actions(driver);
      act2.click(Cart).perform();
      
      WebElement Qty= driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']"));
      Actions act3= new Actions(driver);
      act3.click(Qty);
      
      WebElement delete= driver.findElement(By.xpath("//input[@value='Delete']"));
      Actions act4= new Actions(driver);
      act4.click(delete);
      
      JavascriptExecutor js= (JavascriptExecutor)driver;
     
      js.executeScript("window.scrollBy (0,500)");
      
      js.executeScript("window.scrollBy (0,-500)");
      
      
	}     
}
