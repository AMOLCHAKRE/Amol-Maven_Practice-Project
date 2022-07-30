package rahulshetty;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Guru99_All {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "D:\\Amol Data\\Selenium Automation\\Drivers\\ChromeDriver\\Updated version\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V1/index.php");
		
		driver.findElement(By.name("uid")).sendKeys("mngr390338");
		driver.findElement(By.name("password")).sendKeys("jazEsEg");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.cssSelector("#dismiss-button")).click();
		driver.findElement(By.name("name")).sendKeys("Test User");
		driver.findElement(By.name("rad1")).click();
		System.out.println(driver.findElement(By.className("heading3")).getText());

	}

}
