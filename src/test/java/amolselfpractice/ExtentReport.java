package amolselfpractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport {
	ExtentReports extent;
	ExtentTest test;
	WebDriver driver;
	String basepath = System.getProperty("user.dir");

	@BeforeTest
	public void basicConfig() {

		String path = basepath + "\\Reports\\index.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("Web Automate Report");
		report.config().setDocumentTitle("Test Results");

		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("QA Automation", "Amol Chakre");
	}

	@Test
	public void exportreportdemo() throws IOException {
		test = extent.createTest("Export Report Demo");

		test = extent.createTest("firsttestcase");

		test.log(Status.PASS, "First TC Passed");
		test.log(Status.FAIL, "Second TC Failed");
		test.log(Status.INFO, "All TCs looks Good");
		test.log(Status.WARNING, "Please check test scripts");
		test.addScreenCaptureFromPath(basepath, basepath + "\\Reports\\" + "screenshot.png");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.extentreports.com/docs/versions/5/java/index.html");
		System.out.println(driver.getTitle());

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(basepath + "\\Reports\\" + "screenshot.png"));

		driver.close();
		extent.flush();
	}

}
