package Flipkart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartElement {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium2\\chromedriver_win32\\chromedriver.exe");	
		
		WebDriver driver= new ChromeDriver();
		System.out.println("browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		driver.get("https://www.flipkart.com/");
		System.out.println("url is open");
		
		//https://7249753920:harish@123@www.flipkart.com
		
		//Fashion button
				WebElement FashionBtn= driver.findElement(By.xpath("//img[@alt='Fashion']"));
				//Actions Class
				Actions act= new Actions(driver);
				act.moveToElement(FashionBtn).perform();
				//FashionBtn.click();
				
			    WebElement Mfashion = driver.findElement(By.partialLinkText("Men's T-Shirts"));
				Actions act2= new Actions(driver);
				act2.click(Mfashion).perform();
						
				 

	}

}
