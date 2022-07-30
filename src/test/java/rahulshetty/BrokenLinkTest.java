package rahulshetty;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String url = driver.findElement(By.cssSelector("a[href*=\'soapui\']")).getAttribute("href");

		List<WebElement> allurls = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

		SoftAssert soft = new SoftAssert();

		for (WebElement URL : allurls) {
			String finalurls = URL.getAttribute("href");

			HttpURLConnection connection = (HttpURLConnection) new URL(finalurls).openConnection();
			connection.setRequestMethod("HEAD");
			connection.connect();
			int responsecode = connection.getResponseCode();
			System.out.println(responsecode);

			soft.assertTrue(responsecode < 400, URL.getText() + "with code" + responsecode);

		}

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\lenovo\\eclipse-workspace\\SeleniumScreenshots\\screenshot.png"));

		soft.assertAll();

	}

}
