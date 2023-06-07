package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","E:\\Selenium2\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();	
	
	driver.manage().window().maximize();
	
	driver.get("https://demoqa.com/alerts");
	
	WebElement Click1= driver.findElement(By.xpath("//button[@id='alertButton']"));
	Click1.click();
	
	//switch driver to alert
	Alert alt=driver.switchTo().alert();
	Thread.sleep(3000);
	alt.accept();
	
	WebElement Click2 =driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
    Click2.click();
    Thread.sleep(7000);
    alt.accept();
	
    WebElement Click3 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
    Click3.click();
    Thread.sleep(3000);
    //alt.accept();
    Thread.sleep(3000);
    alt.dismiss();
    
    WebElement Click4=driver.findElement(By.xpath("//button[@id='promtButton']"));
    Click4.click();
    Thread.sleep(3000);
    alt.accept();
    Thread.sleep(3000);
  
    alt.sendKeys("my name is harish");
    alt.getText();
	}
}
