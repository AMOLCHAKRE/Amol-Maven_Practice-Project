package amolselfpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Demo {
	
	String baseurl = "https://www.browserstack.com/guide/testng-annotations-in-selenium";
	WebDriver driver;

	
	
	/*@BeforeMethod
	
	public void test() {
		
		System.out.println("Before Methods");
	}
	
@BeforeMethod
	
	public void test1() {
		
		System.out.println("Before Methods1");
	}*/

	@BeforeTest
	public void launchbrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
	}
	
	@Test
	
	public void visiturl() {
		
		System.out.println("Visited");
	}
@Test
	
	public void visiturl0() {
		
		System.out.println("Visited0");
	}

@Test

public void visiturl1() {
	
	System.out.println("Visited1");
}

@Test

public void visiturl2() {
	
	System.out.println("Visited2");
}
	
@AfterTest

public void broserterminate() {
	
	driver.close();
}

	}


