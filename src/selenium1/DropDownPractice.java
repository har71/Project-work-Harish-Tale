package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {

	public static void main(String[] args) throws java.lang.InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","E:\\Selenium2\\chromedriver_win32\\chromedriver (2).exe");
		
		//browser open
      WebDriver driver= new ChromeDriver();	
		
		//maximize
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		Thread.sleep(2000);
		
		//url open
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("URL is opened");
		Thread.sleep(3000);
        
		//drop down handle 
		//drop ele find + click
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		dropdown.click();
		
		//select any option from the list
		//1)webDriver
		//2)webElement
		//above options don't have any method
		//to select the element
		
		Select s = new Select(dropdown);
		//s.selectByIndex(2);  //option2
		
		s.selectByValue("option3"); //option3
		
		//s.selectByVisibleText("Option1"); //htmltext //option1
		
		System.out.println("Option3 selected");
		
		System.out.println("End of Program");
		 
		
		  
	}

}
