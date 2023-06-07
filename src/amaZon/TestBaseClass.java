package amaZon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestBaseClass
{
WebDriver driver;

@BeforeClass
public void setUp()
{
    System.setProperty("webdriver.chrome.driver","E:\\Selenium2\\chromedriver_win32\\chromedriver.exe");
	
    driver=new ChromeDriver();
    System.out.println("Browser is open");
    
    driver.manage().window().maximize();
    System.out.println("Browser is maximized");
    
    driver.get("https://www.amazon.in");
    System.out.println("Url is opened");
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
@BeforeMethod
public void setUp2()
{
	AmazonPOMClass ap= new AmazonPOMClass();
	ap.sendUserName();
    System.out.println("UserName is entered");
    
    ap.continueBtn();
    System.out.println("Clicked on continue button");
    
    ap.sendPassWord();
    System.out.println("passWord is entered");
    
}

}


    
    
    



