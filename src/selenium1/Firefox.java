package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.geko.driver","E:\\Selenium2\\geckodriver.exe");	

		WebDriver driver = new FirefoxDriver();

	    driver.get("https://www.facebook.com/");;
		

	}

}
