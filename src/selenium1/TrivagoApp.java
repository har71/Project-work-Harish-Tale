package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TrivagoApp {

	public static void main(String[] args) throws java.lang.InterruptedException 
	{
		System.setProperty("webdriver.geko.driver","E:\\Selenium2\\geckodriver.exe");	

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		System.out.println("window is maximized");
		
		driver.get("https://www.trivago.in");
		System.out.println("url opened");
 		
		Thread.sleep(3000);
		WebElement dropDown= driver.findElement(By.xpath("(//select[@id=currency=selector])[1]"));
		dropDown.click();
		Select s= new Select(dropDown);
		s.selectByValue("currency-selector");
		
	}

}
