package amolselfpractice;

import java.util.List;
import org.openqa.selenium.support.Color;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MonkeyTesting_Automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement color = driver.findElement(By.id("glow-ingress-line2"));	
		String S = color.getCssValue("color");
		//String C = S.formatted(color).
		
				
		List<WebElement> footerList = driver.findElements(By.id("navFooter"));
		//driver.findElement(By.id("navFooter1"));
		int count = footerList.size();
		System.out.println("Total footer links" +count);
		
		for (int i=0;i<count;i++)
		{
		 int randomindex =	(int) Math.floor(Math.random()*count);
		 System.out.println(randomindex);
		 
		 WebElement e = footerList.get(randomindex);
		 System.out.println(e.getText());
		 e.click();
		 driver.navigate().back();
		 Thread.sleep(1500);
		  footerList = driver.findElements(By.id("navFooter"));
		}
		

	}

}
