package amolselfpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iTime_Automation {
	
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://itime.lntinfotech.com/#/Timesheet");
	Thread.sleep(30);
	System.out.println(driver.findElement(By.xpath("//input[@name='loginfmt']")).isDisplayed());//sendKeys("amol.chakre@lntinfotech.com");
	driver.findElement(By.id("idSIButton9")).click();
		
		
			  }
			}

