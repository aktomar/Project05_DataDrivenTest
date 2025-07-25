package DataDriven_Testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import DataDriven_UtilitiesFiles.Logs;

public class BaseClass {
	
	public WebDriver driver;
	
	
	
	@BeforeClass
	public void LunchBrowser() {
		
		System.setProperty("Webdriver.chrome.driver", ".//Driver/chromedriver.exe");
		driver = new ChromeDriver();
		Logs.info("Launched Browser....");
		driver.manage().window().maximize();
		Logs.info("Maximized Browser....");
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		Logs.info("Navigated to the Application URL....");
			
	}
	
	@AfterClass
	public void CloseBrowser() {
		
		driver.quit();
		Logs.info("Browser closed....");
		
	}

}
