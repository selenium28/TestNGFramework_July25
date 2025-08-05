package link;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchLinkCount {
	String url;
	
	@Test
	public void links() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
		System.out.println("Browser launced");
		
		List<WebElement> allUrls = driver.findElements(By.tagName("a"));
		System.out.println("Total links are present on Home Page: " +allUrls.size());
		
		Iterator<WebElement> iterator = allUrls.iterator();
		while (iterator.hasNext()) {
			url = iterator.next().getText();
			System.out.println(url);
		}
		
	}

}
