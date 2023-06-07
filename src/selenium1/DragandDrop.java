package selenium1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) 
	{
  System.setProperty("webdriver.chrome.driver","E:\\Selenium2\\chromedriver_win32\\chromedriver.exe");
  
  WebDriver driver= new ChromeDriver();
  System.out.println("browser is opned");
  
  driver.manage().window().maximize();
  System.out.println("browser is maximized");
  
  driver.get(" http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
  System.out.println("url is opened");
  
  WebElement cityElement =driver.findElement(By.xpath("//div[@id='box3']"));
 // Thread.sleep(3000);
  WebElement countryElement= driver.findElement(By.xpath("//div[@id='box103']"));
  Actions act = new Actions(driver);
  act.dragAndDrop(cityElement, countryElement).perform();
  System.out.println("elemend draged and droped");
  System.out.println("End of Program");
  
	}

}
