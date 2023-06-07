package selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium2\\chromedriver_win32\\chromedriver.exe");	

		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");

		//maximize
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
	
		
		driver.get("https://www.instagram.com/");
		System.out.println("url is opened");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       
		WebElement userName= driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("_harish_tale_");
		

		WebElement passWord= driver.findElement(By.xpath("//input[@name='password']"));
	    passWord.sendKeys("368921");
	    
		WebElement loginBtn = driver.findElement(By.xpath("(//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abak _abb8 _abbq _abb- _abcm'])[1]"));
	    loginBtn.click();
	
	   //WebElement ProfileClick = driver.findElement(By.xpath("(//img[@draggable='false'])[1]"));
	   //ProfileClick.click();
	    
	   //WebElement Piclike =driver.findElement(By.partialLinkText("Like"));
	   
	   WebElement ProfileClick = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div/div[1]/div[1]/div[2]/section/main/div[1]/section/div/div[3]/div[1]/div/article[4]/div/div[3]/div/div/section[1]/span[1]/button/div[2]/span/svg"));
	    ProfileClick.click();
	    
	}

}
