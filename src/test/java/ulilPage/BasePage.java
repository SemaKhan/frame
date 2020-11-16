package ulilPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	public static WebDriver driver;
	public static Properties prop;
	//make a constructor for get file path
	 public BasePage() {
		 try {
			FileInputStream input = new  FileInputStream(System.getProperty("user.dir")+ "./src/test/java/semademo/sema.properties");
			 prop.load(input);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 // write a method for giving access to the driver path
	 
	 public void Initial() {
		 String browserName = prop.getProperty("browser");
		 
		 if(browserName.equals("Chrome")) {
			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"C:\\Users\\user\\eclipse-workspace\\semademo\\src\\test\\java\\driver\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().pageLoadTimeout(UtilPage.pageLoadTimeout, TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(UtilPage.implicitlyWait, TimeUnit.SECONDS);
			 
		 }
		 else if (browserName.equals("browser2"));
	 }
//method for get access for url
	 public static void geturl(String url) {
		 driver.get(prop.getProperty("urlQA"));
	 }
}
