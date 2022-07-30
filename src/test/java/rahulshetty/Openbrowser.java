package rahulshetty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openbrowser {

	public static void main(String[] args) {
		// Chrome Browser opening
		
		//System.setProperty("webdriver.chrome.driver","D:\\Amol Data\\Selenium Automation\\Drivers\\ChromeDriver\\Updated version\\chromedriver.exe");
		/*WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
		driver.get("https://www.javatpoint.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();*/
		
		// Firefox Browser opening
		
		//System.setProperty("webdriver.gecko.driver", "D:\\Amol Data\\Selenium Automation\\Drivers\\Firefox\\Updated version\\geckodriver.exe"));
		//WebDriver driver = new FirefoxDriver();
		
		//driver.manage().window().maximize();
		//driver.get("https://www.javatpoint.com/");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//driver.close();
		//driver.quit();
		
		// Microsoft Edge Browser opening
	
		System.setProperty("webdriver.edge.driver", "D:\\Amol Data\\Selenium Automation\\Drivers\\Microsoft Edge\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.javatpoint.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.close();
//		driver.quit();
	}
}

