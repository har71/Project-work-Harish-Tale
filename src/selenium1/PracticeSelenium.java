package selenium1;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSelenium {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        
		//1Chrome browser open
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is opened");
		//Thread.sleep(3000);
		
		//maximize
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		//Thread.sleep(3000);
		
		//url open facebook 
		driver.get("https://www.facebook.com/");
		System.out.println("facebook url is opened");
		//Thread.sleep(3000);
		
		//2nd url
		driver.navigate().to("https://www.instagram.com/");
		System.out.println("2nd url insta is opened");
		
		//back
		driver.navigate().back();     //facebook
		System.out.println("reach on fb");
		
		//forward
		driver.navigate().forward();    //insta
		System.out.println("reach on insta");
		//Thread.sleep(3000);
		
		//refresh
		driver.navigate().refresh();
		System.out.println("browser is refresh");
		
		//minimize
		driver.manage().window().minimize();
		System.out.println("browser is minimized");
		//Thread.sleep(3000);
		
		//maximize
         driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		//getCurrentUrl-----> insta
		String url = driver.getCurrentUrl(); //instagram.com
		System.out.println("url is  " + url);
		
		
		//for setSize we need to create an object of dimension.
	     Dimension D = new Dimension(300,500);
	    driver.manage().window().setSize(D);
	    System.out.println("size is changed");
	    //Thread.sleep(2000);
	    
	    
	    //setPosition
	    Point p = new Point(200,300);
	    driver.manage().window().setPosition(p);
	    System.out.println("Position is changed");
	    
	    String title= driver.getTitle();
	    System.out.println("title is  " + title); //instagram
	    //Thread.sleep(7000);
	    
	    //close
	    driver.close(); //first running window get closed
	    System.out.println("current window closed");
	    
	    //quit
	    driver.quit(); //browser get closed
	    System.out.println(" browser  get closed");
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
	}

}
