package rahulshetty;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Amol Data\\Selenium Automation\\Drivers\\ChromeDriver\\Updated version\\chromedriver.exe");
		
		String UN = "amolchakre";
		String PW = "Rani@12345$";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.testyou.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_headerTop_Signin")).click();
		driver.findElement(By.name("ctl00$indexLogin2$txtUserLogin")).sendKeys(UN);
		driver.findElement(By.name("ctl00$indexLogin2$txtPassword")).sendKeys(PW);
		driver.findElement(By.name("ctl00$indexLogin2$lnkbtnSiginIn")).click();
		driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/div[5]/div[1]/div/div/div/div[2]/div[1]/span")).getText();
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/div[5]/div[1]/div/div/div/div[2]/div[1]/span")).getText(), "Welcome to TestYou - Attempt Unlimited Online Tests");
		System.out.println(driver.findElement(By.id("ctl00_CPHContainer_spDOB")).getText());
		//Assert.assertEquals(driver.findElement(By.id("ctl00_CPHContainer_spDOB")).getText(), 01/01/1900);
		driver.findElement(By.className("signout")).click();
		driver.close();
		
	}

}
