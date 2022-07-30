package rahulshetty;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentChildWindowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();

		Set<String> handle = driver.getWindowHandles();
		Iterator<String> IT = handle.iterator(); // navigate from parentid & childid
		String parentid = IT.next();
		String childid = IT.next();

		driver.switchTo().window(childid);
		// driver.close();

		String emailid = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim()
				.split(" ")[0];
		driver.switchTo().window(parentid);
		driver.findElement(By.id("username")).sendKeys(emailid);
		System.out.println(driver.findElement(By.id("username")).getTagName());
		// driver.close();

	}

}
