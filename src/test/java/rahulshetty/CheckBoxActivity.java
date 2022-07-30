package rahulshetty;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Amol Data\\Selenium Automation\\Drivers\\ChromeDriver\\Updated version\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/");
		driver.findElement(By.className("waves-effect")).click();
		driver.findElement(By.className("ladda-label")).click();
		driver.findElement(By.id("flights-search"));
		driver.switchTo().alert().accept();
		System.out.println(driver.switchTo().alert().getText());
		
		driver.close();
	}

}
