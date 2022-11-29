package rahulshetty_aasignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox_Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
		System.out.println(driver.findElement(By.id("checkbox-example")).getSize());
		System.out.println(driver.findElements(By.cssSelector("input[value='checkbox']")).size());
	}

}
