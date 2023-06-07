package selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VelocityApp {

	public static void main(String[] args) 
	{
     System.setProperty("webdriver.chrome.driver","E:\\Selenium2\\chromedriver_win32\\chromedriver.exe");
     
     WebDriver driver = new ChromeDriver();
     
     driver.manage().window().maximize();
     
     driver.get("https://vctcpune.com/selenium/practice.html");
     System.out.println("url is opened");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
     WebElement userName = driver.findElement(By.xpath("//input[@name='name']"));
     userName.sendKeys("Harish");
     
     //emailId
     WebElement mail= driver.findElement(By.xpath("//input[@name='email']"));
     mail.sendKeys("taleharish91@gmail.com");
     
     
     WebElement dropdown= driver.findElement(By.xpath("//select[@class='form-control']"));
     dropdown.click();
     Select s= new Select(dropdown);
     s.selectByValue("Software Testing");
     
     
     
     WebElement country = driver.findElement(By.xpath("(//div[@class='flag in'])[1]"));
     country.click();
     Select s1 = new Select(country);
     s1.selectByIndex(0);
     
   
     //contactNumber
     WebElement Contact= driver.findElement(By.xpath("//input[@type='tel']"));
     Contact.sendKeys("7249753920");
     
     
	}

}
