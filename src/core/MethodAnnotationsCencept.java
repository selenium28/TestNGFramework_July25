package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class MethodAnnotationsCencept {
	
//	5 - TestCases -> 1.Login -> 2.Landing Dashboard -> 3. product -> 4. Address -> 5.Payment 
	
	WebDriver driver = new ChromeDriver();
	
	@Test
	public void loginOne() {
		WebElement userName_TextBox = driver.findElement(By.id("username"));
		userName_TextBox.sendKeys("student");

		WebElement password_TextBox = driver.findElement(By.name("password"));
		password_TextBox.sendKeys("Password123");

		WebElement submit_Button = driver.findElement(By.className("btn"));
		submit_Button.click();
		System.out.println("Login Done");
	}
	
	@Test
	public void loginTwo() {
		WebElement userName_TextBox = driver.findElement(By.id("username"));
		userName_TextBox.sendKeys("stuent");

		WebElement password_TextBox = driver.findElement(By.name("password"));
		password_TextBox.sendKeys("Password");

		WebElement submit_Button = driver.findElement(By.className("btn"));
		submit_Button.click();
		System.out.println("Login Done");
	}

	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		System.out.println("Before method executed");
	}

	@AfterMethod
	public void afterMethod() {
//		driver.close();
		System.out.println("After method executed");
	}

}
