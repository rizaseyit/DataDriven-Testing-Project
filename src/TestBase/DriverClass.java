package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import utility.UtilityClass;


public class DriverClass {

	public WebDriver driver ;

	@BeforeMethod
	public void startDriver() throws Exception {
		
	//	if(UtilityClass.fetchConfigProp("browserName").toString().equalsIgnoreCase("chrome"));
	//	{
			System.setProperty("webdriver.chrome.driver", "./DriverFile/chromedriver.exe");
			driver = new ChromeDriver();

			driver.get(UtilityClass.fetchConfigProp("url").toString());

	}
	
	@AfterMethod
	public void closeDriver() {
		driver.quit();
	}
}

