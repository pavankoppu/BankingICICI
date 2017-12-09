package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Google {
  @Test
  public void Title() {
	  
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://www.icicibank.com");
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  System.out.println(driver.getTitle());
	  
  }
}
