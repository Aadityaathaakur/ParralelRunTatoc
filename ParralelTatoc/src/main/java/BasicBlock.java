import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import UtilPackage.LocatorsCallBasic;
public class BasicBlock {
	 static WebDriver driver=BrowserDetails.driver;
	
	public static String basicCource() {
		LocatorsCallBasic lc= new LocatorsCallBasic(driver);
				//driver.findElement(By.linkText("Basic Course")).click();
				
				lc.getWebElementsTag("linkTextBasic").click();
				 return driver.getTitle();
  }
}
