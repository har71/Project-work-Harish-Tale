package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetwindowHandlesFlipkart
{
  public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement userName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		userName.sendKeys("7249753920");
		
		
		WebElement otp= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		otp.click();
		
		WebElement searchTab= driver.findElement(By.xpath("//input[@name='q']"));
		searchTab.sendKeys("printer");
		
		WebElement searchClick = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/button"));
		searchClick.click(); 
		
		
	
		

	}

}
