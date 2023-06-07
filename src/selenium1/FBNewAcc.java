package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBNewAcc
{

	public static void main(String[] args) 
	{
     System.setProperty("webdriver.chrome.driver","E:\\Selenium2\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
   System.out.println("Url is opened");
     
     driver.manage().window().maximize();
     System.out.println("browser is maximized");
     
     driver.get("https://www.facebook.com");
     
 
     
//    //create new account button click
//     WebElement newAcc = driver.findElement(By.xpath("//form//input[14]"));
//	newAcc.sendKeys("789456123");
	

	
	
//	WebElement Fname= driver.findElement(By.xpath("//input[@name='firstname']"));
//	Fname.sendKeys("Harish");
//	
//	WebElement Lname= driver.findElement(By.xpath("//input[@name='lastname']"));
//	Lname.sendKeys("Tale");
//
//	//date of birth
//	WebElement DOB= driver.findElement(By.xpath("//select[@id='day']"));
//	DOB.click();
//	
//   Select s= new Select(DOB);
//	s.selectByIndex(0);
//		
//-------------------------------------------------------
		WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
		   firstName.sendKeys("Harish");
		   
		   WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
		   lastName.sendKeys("Tale");
		   
		   WebElement mobileNumber=driver.findElement(By.xpath("//input[@name=\'reg_email__\']"));
		   mobileNumber.sendKeys("7249753920");
		   
		   WebElement password=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		   password.sendKeys("absc");
		   
		   WebElement day=driver.findElement(By.id("day"));
		   Select d=new Select(day);
		   d.selectByIndex(28);//-1
		   
		   WebElement month=driver.findElement(By.id("month"));
		   Select m=new Select(month);
		   m.selectByIndex(6); //-1
		   
		   WebElement year=driver.findElement(By.id("year"));
		   Select y=new Select(year);
		   y.selectByValue("1997"); //original
		   
		   WebElement gender=driver.findElement(By.xpath("//label[text()='Male']"));
     	   gender.click();
	}
}
