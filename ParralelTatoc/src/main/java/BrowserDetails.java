import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BrowserDetails {


	String mainWindow;
	
	static WebDriver driver;
	
	public static String launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Desktop/chromedriver");
		driver = (WebDriver) new ChromeDriver();
		driver.get("http://10.0.1.86//tatoc");
		driver.manage().window().maximize();
	 	return driver.getTitle();
	 	}
	
		public static void closebrowser(){
			driver.close();
			
		}
}
