package amolselfpractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScope {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		// Requirements:-
		// 1. Count of links from entire home page
		// 2. Count of links from footer section of home page
		// 3. link count from Get to know us section from footer
		// 4. Click on all links from requirement 3 output

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement footerlinkcount = driver.findElement(By.id("navFooter"));
		System.out.println(footerlinkcount.findElements(By.tagName("a")).size());

		WebElement getToKnowlinkcount = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]"));
		System.out.println(getToKnowlinkcount.findElements(By.tagName("a")).size());

		for (int i = 0; i < getToKnowlinkcount.findElements(By.tagName("a")).size(); i++) {
			String linkperform = Keys.chord(Keys.CONTROL, Keys.ENTER);
			getToKnowlinkcount.findElements(By.tagName("a")).get(i).sendKeys(linkperform);
		}

		Set<String> tabmove = driver.getWindowHandles();
		Iterator<String> Amztabs = tabmove.iterator();

		while (Amztabs.hasNext()) {
			driver.switchTo().window(Amztabs.next());
			System.out.println(driver.getTitle());
		}
	}

}
