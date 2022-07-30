package amolselfpractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Dataproperty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties Prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\maven_practice_projects\\src\\main\\java\\resources\\Data.properties");
		Prop.load(fis);
		 	//Need to give on in browser you want to run code with help of mvn command use 2 lines of code
		// command is mvn test -Dbrowser=chrome
		
		String browserName = System.getProperty("browser");
		System.out.println(browserName);
		
		//System.out.println(Prop.get("browser"));
		System.out.println(Prop.get("url"));
		Prop.setProperty("browser", "Firefox");
		System.out.println(Prop.getProperty("browser"));
		FileOutputStream fos = new FileOutputStream("C:\\Users\\lenovo\\eclipse-workspace\\maven_practice_projects\\src\\main\\java\\resources\\Data.properties");
		Prop.store(fos, null);
		System.out.println(fos);
		
		

	}

}
