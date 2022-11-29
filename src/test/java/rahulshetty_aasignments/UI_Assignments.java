package rahulshetty_aasignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UI_Assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Test");
		driver.findElement(By.name("email")).sendKeys("Test@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement UI = driver.findElement(By.id("exampleFormControlSelect1"));
		Select DP = new Select (UI);
		DP.selectByVisibleText("Female");
				
		driver.findElement(By.id("inlineRadio2")).click();
		System.out.println(driver.findElement(By.id("inlineRadio3")).isEnabled());
		driver.findElement(By.name("bday")).sendKeys("04/08/2022");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		driver.close();
	}

}
