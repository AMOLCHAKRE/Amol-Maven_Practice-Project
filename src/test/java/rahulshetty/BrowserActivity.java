package rahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Amol Data\\Selenium Automation\\Drivers\\ChromeDriver\\Updated version\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		driver.navigate().to("http://www.testyou.in/");
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println(driver.findElement(By.className("float_left")).getText());
		driver.navigate().to("http://demo.guru99.com/V1/index.php");
		driver.close();
	}

}
