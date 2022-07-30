package rahulshetty;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import org.testng.Assert;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFiles {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		String downloadpath = System.getProperty("user.dir");

		WebDriverManager.chromedriver().setup();

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("profile.default_content_settings.popups", 0);

		chromePrefs.put("download.default_directory", downloadpath);

		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("prefs", chromePrefs);

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\Amol Data\\Selenium Automation\\FileUpload\\uploadfile.exe");

		// Download converted file

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120, 1));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("processTaskTextBtn")));

		driver.findElement(By.id("processTaskTextBtn")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("pickfiles")));
		driver.findElement(By.id("pickfiles")).click();

		File file = new File(downloadpath + "/Hi Tester.pdf");
		if (file.exists()) {
			Assert.assertTrue(file.exists());
			if (file.delete())

				System.out.println("File is deleted");

		}

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\lenovo\\eclipse-workspace\\SeleniumScreenshots\\screenshot.png"));
	}

}
