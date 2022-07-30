package amolselfpractice;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CloudTest {
	
	public static final String USERNAME = "amol.chakre015@gmail.com";

	  public static final String ACCESS_KEY = "99a66e7e-e4ea-4faa-acb4-ffb7ff072193";

	  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com:443/wd/hub";



	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 11");
		browserOptions.setBrowserVersion("100");
		Map<String, Object> sauceOptions = new HashMap<>();
		browserOptions.setCapability("sauce:options", sauceOptions);
		
		DesiredCapabilities caps = new DesiredCapabilities();
		WebDriver driver = new RemoteWebDriver(new URL(URL),caps);
		
		/*driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(ACCESS_KEY);*/
		
		driver.get("http://google.com");

		System.out.println(driver.getTitle());
	}

}
