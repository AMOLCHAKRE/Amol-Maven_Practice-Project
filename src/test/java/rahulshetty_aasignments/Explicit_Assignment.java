package rahulshetty_aasignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicit_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='admin']")).click();
		driver.findElement(By.xpath("//option[@value='consult']")).click();
		driver.findElement(By.id("signInBtn")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(8000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-info']")));
		List<WebElement> phone=driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		
		for (int i=0;i<phone.size();i++)
		{
			phone.get(i).click();
		}
		
		driver.close();
		
		System.out.println("Code success");
		System.out.println("Browser closed successfully");
		

	}

}
