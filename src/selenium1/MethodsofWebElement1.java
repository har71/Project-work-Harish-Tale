package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsofWebElement1 {

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is opened");
	
	driver.get("https://www.saucedemo.com/");
	System.out.println("url is opened");
	
	//userName
	WebElement userName= driver.findElement(By.xpath("//input[@id='user-name']"));
	userName.sendKeys("standard_user");
	
	//tagName
	String tagName =userName.getTagName();
	System.out.println("tagaName is-->"+tagName);
	
	//Attribute
	String Attribute= userName.getAttribute("id");
    System.out.println("Attribute value is-->"+Attribute);
    
    //HTML text
    String HTMLtext = userName.getText();
    System.out.println("HTML text is-->"+HTMLtext);
    
    
	}

}
