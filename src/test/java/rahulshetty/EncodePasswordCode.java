package rahulshetty;

import org.bouncycastle.util.encoders.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EncodePasswordCode  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testyou.in/");
		driver.findElement(By.id("ctl00_headerTop_Signin")).click();
		driver.findElement(By.className("common_textbox")).sendKeys("Amolchakre");
		driver.findElement(By.id("ctl00_indexLogin2_txtPassword")).sendKeys(decodedpassword("UmFuaUAxMjM0NSQ="));
		driver.findElement(By.name("ctl00$indexLogin2$lnkbtnSiginIn")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}

	public static String decodedpassword (String password) 
	{
		byte[] decodedpassword = Base64.decode(password);
		return new String(decodedpassword);
		
		
	}
}
