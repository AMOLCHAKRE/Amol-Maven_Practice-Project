package rahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		Actions action = new Actions(driver);
		WebElement sign = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		action.moveToElement(sign).build().perform();

		WebElement srch = driver.findElement(By.id("nav-search-bar-form"));
		action.moveToElement(srch).click().keyDown(Keys.SHIFT).sendKeys("shirts").build().perform();

		WebElement rghtclick = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		action.moveToElement(rghtclick).contextClick().build().perform();

		WebElement mobile = driver.findElement(By.xpath("//*[@id='nav-logo-sprites']"));
		action.moveToElement(mobile).click().build().perform();
		System.out.println(driver.findElement(By.xpath("//*[@id='nav-logo-sprites']")).getText());

		driver.close();

	}

}
