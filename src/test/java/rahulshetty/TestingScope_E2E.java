package rahulshetty;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingScope_E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Requirements:-
		// 1. Get a count of link present on the entire page
		// 2. Get a count of link present on the footer section
		// 3. Get a count of link present on the footer section and first column

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement footerlinkcounts = driver.findElement(By.id("gf-BIG")); // Limiting Webdriver scope
		System.out.println(footerlinkcounts.findElements(By.tagName("a")).size());

		WebElement discountslinkcounts = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(discountslinkcounts.findElements(By.tagName("a")).size());

		// 4. Click on all link getting count from third requirement

		for (int i = 0; i < discountslinkcounts.findElements(By.tagName("a")).size(); i++) {

			String openalllinkstab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			discountslinkcounts.findElements(By.tagName("a")).get(i).sendKeys(openalllinkstab);
		}

		Thread.sleep(5000);
		Set<String> window = driver.getWindowHandles();
		Iterator<String> winmove = window.iterator();

		while (winmove.hasNext()) { // This will check next tab is present
			driver.switchTo().window(winmove.next()); // This will open next tab
			System.out.println(driver.getTitle()); // This will print title of each tab
		}

	}

}
