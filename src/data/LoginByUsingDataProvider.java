package data;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class LoginByUsingDataProvider {

	@Test(dataProvider = "dp")
	public void loginMethod(String user, String pass) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		System.out.println("Browser launced");
		
		WebElement userName_TextBox = driver.findElement(By.id("username"));
		userName_TextBox.sendKeys(user);

		WebElement password_TextBox = driver.findElement(By.name("password"));
		password_TextBox.sendKeys(pass);

		WebElement submit_Button = driver.findElement(By.className("btn"));
		submit_Button.click();
		System.out.println("Login Done");
		
	}

	@DataProvider
	public Object[][] dp() {
		Object[][] data = new Object[3][2];

		data[0][0] = "student";
		data[0][1] = "Password123";

		data[1][0] = "student";
		data[1][1] = "WrongPAss";
		
		data[2][0] = "WrongUser";
		data[2][1] = "Password123";

		return data;

	}
}
