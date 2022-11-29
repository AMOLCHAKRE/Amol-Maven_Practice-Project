package naveen_Automation_Stuff;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.contentstream.PDContentStream;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PDF_Reading_Demo {

	public static WebDriver driver;
	//public static String url = "https://www.adobe.com/support/products/enterprise/knowledgecenter/media/c4611_sample_explain.pdf";
	public static String url ="file:///D:/Amol%20Data/Chrome%20Downloads%20data/c4611_sample_explain.pdf";
	static String downloadpath = System.getProperty("user.dir");
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);	
		
		URL pdfurl = new URL (url);
		InputStream ip = pdfurl.openStream();
		BufferedInputStream bf = new BufferedInputStream(ip);
		PDDocument pddocuments=PDDocument.load(bf);
		
		//Page count logic
		int pagecount = pddocuments.getNumberOfPages();
		System.out.println(pagecount);
		
		//File file = new File(downloadpath + "/Sample.pdf");  //icon
		//pddocuments.save(file);
		System.out.println(pddocuments.getPage(3));
		pddocuments.close();
		System.out.println(pddocuments.isEncrypted());
		
		
		System.out.println("=====================PDF Text===============");
		//Page contents
		
		PDFTextStripper pdtext = new PDFTextStripper();
		//String text = pdtext.getText(pddocuments);
		//System.out.println(text);
		
		pdtext.setStartPage(2);
		String text = pdtext.getText(pddocuments);
		System.out.println(text);
		
		
		
		
		

	}

}
