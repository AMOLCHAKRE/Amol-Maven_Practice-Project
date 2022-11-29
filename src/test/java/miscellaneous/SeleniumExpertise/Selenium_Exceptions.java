package miscellaneous.SeleniumExpertise;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Exceptions {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client/");
		driver.findElement(By.id("userEmail")).sendKeys("chakreamol720@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Google@1774$");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath
				("//div[@class='container']//div[1]//div[1]//div[1]//button[2]")).click();
		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		
		

	}

}*/
	
		    static public void main(String[] args) {
		      WebDriverManager.chromedriver().setup();
		      WebDriver driver = new ChromeDriver();
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		      driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
		      // identify element
		      WebElement l = driver.findElement(By.id("search-strings"));
		      l.sendKeys("Selenium");
		      //refresh page
		      driver.navigate().refresh();
		      l.sendKeys("Selenium");
		      driver.quit();
		   }
		}
		
