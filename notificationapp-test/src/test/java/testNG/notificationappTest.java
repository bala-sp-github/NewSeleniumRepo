package testNG;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
public class notificationappTest {
	WebDriver driver;
	
	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8090/notificationapp-1/devices");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
  @Test
  public void verifylogin() {
	  driver.manage().window().maximize();
	  //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//div[@class='button-container']")).click();
  }
  
@AfterTest
  public void logout() {
	  driver.close();
  }
}
