package rahulshetty;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductAddingFromEcommerceSites {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int j=0;
	WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","D:\\Amol Data\\Selenium Automation\\Drivers\\ChromeDriver\\Updated version\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		String [] itemneeded = {"Cucumber", "Brocolli", "Beetroot"};
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(4000);
		
		addItems(driver,itemneeded);
	}
	
	public static void addItems (WebDriver driver, String[] itemneeded) {
		
		int j=0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i = 0; i < products.size();i++) {
			
			//Brocolli - 1 Kg

			//Brocolli,    1 kg
				
			String[] name = products.get(i).getText().split("_");
			String formattedname = name[0].trim();
			
			//format it to get actual vegetable name

			//convert array into array list for easy search

			//  check whether name you extracted is present in arrayList or not-
			
			List itemsneededlist = Arrays.asList(itemneeded);

			if (itemsneededlist.contains(formattedname)) {
				// clicking on add to cart button
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==4)
				{
					break;
				}
				//driver.close();
				
			}

		}

	}

}
