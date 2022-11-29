package amolselfpractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid {
	
	@Test
	public void Googlehomepage() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.37:4444"), caps);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
	}
	
	@Test
	public void SeleniumDevhomepage() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("edge");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.37:4444"), caps);
		driver.get("https://www.selenium.dev/downloads/");
		System.out.println(driver.getTitle());
	}

}
