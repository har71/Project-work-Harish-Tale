package selenium1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPro
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");	

		WebDriver driver = new ChromeDriver();

	    driver.get("https://www.facebook.com/");
	    
		Dimension d= new Dimension(300,500);
		driver.manage().window().setSize(d);
		
	
		
	    //navigate().net()----->
	    //driver.navigate().to("https://www.google.com/");
	


	}

}
