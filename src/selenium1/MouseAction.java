package selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	     
	    WebDriver driver= new ChromeDriver();
	    System.out.println("browser is opened");
	     
	    driver.manage().window().maximize();
	    System.out.println("browser is maximized");
	    
	    driver.get("https://demoqa.com/buttons");
	    System.out.println("url is opened");
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    WebElement doubleclick= driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
	    //use actions class for double click
	    Actions act= new Actions(driver);
	    act.doubleClick(doubleclick).perform();
	    System.out.println("end of program");
	    
	    WebElement M1 = driver.findElement(By.xpath("//p[@id='doubleClickMessage']"));
	   
	    //BA-dev-->userstory
	    String expectedMessage1 ="You have done a double click";
	    
	    String actualMessage= M1.getText();

	   if(expectedMessage1.equals(actualMessage))
	   {
		   System.out.println("test case is pass");
	   }
	   else
		   {
			   System.out.println("test case is fail");
		   }
	  
	//------------------------------------------------------------------------	   
	   //rightclick
	   
	   WebElement element= driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
	   Actions rightact= new Actions(driver);
	   rightact.contextClick(element).perform();
	   
	   WebElement M2= driver.findElement(By.xpath("//p[@id='rightClickMessage']"));
	   
	   String expectedMessage2="You have done a right click";
	   
	   String actualMessage2= M2.getText();
	  
	   if(expectedMessage2.equals(actualMessage2))
	   {
		   System.out.println("test cases is pass");
	   }
	   else
	   {
		   System.out.println("test case is fail");
	   }
	   
	   
	 //---------------------------------------------------------------------------------  
	   //dynamic click
	   WebElement dynamicClick= driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));
	   Actions act2= new Actions(driver);
	   act2.click(dynamicClick).perform();
	   
	   WebElement M3= driver.findElement(By.xpath("//p[@id='dynamicClickMessage']"));
	   
	   String expectedMessage3="You have done a dynamic click";
	   
	   String actualMessage3= M3.getText();
	   
	   if (expectedMessage3.equals(actualMessage3))
	   {
		   System.out.println("test cases is pass");
	   }
	   else
	   {
		   System.out.println("test case is fail");
	   }
	   System.out.println("browser closed");
	   System.out.println("end of program");
	}
}
