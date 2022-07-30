package rahulshetty;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyWhatsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Amol Data\\Selenium Automation\\Drivers\\ChromeDriver\\Updated version\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://web.whatsapp.com/");

	}

}
