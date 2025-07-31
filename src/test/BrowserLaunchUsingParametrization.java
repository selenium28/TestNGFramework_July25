package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserLaunchUsingParametrization {
	
	WebDriver driver;
	
//	Hard Code
//	String browser = "firefox";
	
//	Parameterization - 1. By using parameter 2. By using Data Provider
	
	@Parameters("browser")
	@Test
	public void launchBrowserChromeAndFirefox(String browser) {
		
		if (browser.equals("chrome")) {
			driver =new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		System.out.println("Before Class executed");
		
	}

}
