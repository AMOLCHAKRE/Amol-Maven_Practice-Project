package rahulshetty;

import java.net.MalformedURLException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlePopUp {
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Amol Data\\Selenium Automation\\Drivers\\ChromeDriver\\Updated version\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-notifications");
			
			//options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		 
		 
			ChromeDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://www.spicejet.com/");
			

	}

}
