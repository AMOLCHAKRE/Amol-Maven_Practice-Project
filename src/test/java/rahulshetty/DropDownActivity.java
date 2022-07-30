package rahulshetty;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDownActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Amol Data\\Selenium Automation\\Drivers\\ChromeDriver\\Updated version\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		//driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		//Code for static Dropdown
		
		WebElement staticdropdown = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[4]/div/div[1]/div[5]/div/select"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByVisibleText("1");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.close();

	}

}
