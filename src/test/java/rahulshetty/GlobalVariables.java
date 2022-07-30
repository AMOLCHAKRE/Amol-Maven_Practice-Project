package rahulshetty;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalVariables {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\maven_practice_projects\\src\\main\\java\\resources\\Data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "Firefox");
		System.out.println(prop.getProperty("browser"));

	}

}
