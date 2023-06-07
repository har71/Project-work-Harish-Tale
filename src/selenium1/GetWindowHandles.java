package selenium1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium2\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/jsref/obj_console.asp");
		
		WebElement TryIt= driver.findElement(By.xpath("(//a[@class='w3-btn w3-margin-bottom'])[1]"));
		TryIt.click();
		
        //allpageAddress
	     List<String> allPageAddress = new ArrayList<String>(driver.getWindowHandles());
	     //switchTo
	     driver.switchTo().window(allPageAddress.get(1));
		
		
		WebElement websitebtn= driver.findElement(By.xpath("//a[@id='getwebsitebtn']"));
		websitebtn.click();
		
	
		
		
		
	}

}
