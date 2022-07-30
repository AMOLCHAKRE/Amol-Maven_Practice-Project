package rahulshetty;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Amol Data\\Selenium Automation\\Drivers\\ChromeDriver\\Updated version\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.get("https://demo.guru99.com/");
		driver.get("http://demo.guru99.com/V1/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("uid")).sendKeys("mngr390338");
		driver.findElement(By.name("password")).sendKeys("jazEsEg");
		driver.findElement(By.name("btnLogin")).click();
		
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("//*[@id=\"ad_position_box\"]")).click();
		driver.findElement(By.name("name")).sendKeys("Selenium Demo");
		
		// for getting error message text code
		//System.out.println(driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(1) > td > h2")).getText());		
		driver.close();
	}

}