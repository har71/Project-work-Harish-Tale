package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementmethod1 {

	public static void main(String[] args) 
	{
	 System.setProperty("webdriver.chrome.driver","E:\\Selenium2\\chromedriver_win32\\chromedriver.exe");

	 WebDriver driver= new ChromeDriver();
	 System.out.println("browser is opened");
	 
	 driver.manage().window().maximize();
	 System.out.println("browser is maximized");
	 
	 driver.get("https://www.facebook.com");
	 System.out.println("url is opened");
	 
	    WebElement newAcc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		newAcc.click();
	 
	 WebElement Fname= driver.findElement(By.xpath("//input[@name='firstname']"));
	 Fname.sendKeys("Harish");
	 
	 WebElement Lname= driver.findElement(By.xpath("//input[@name='lastname']"));
	 Lname.sendKeys("Tale");
	 
	 WebElement Mobno = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]"));
	 Mobno.sendKeys("7249753920");
	}

}
