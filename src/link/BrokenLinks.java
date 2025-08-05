package link;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks {

	@Test
	public void links() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
		System.out.println("Browser launced");

		List<WebElement> allUrls = driver.findElements(By.tagName("a"));
		System.out.println("Total links are present on Home Page: " +allUrls.size());

		for (int i = 0; i < allUrls.size(); i++) {
			WebElement e1 = allUrls.get(i);
			String url = e1.getAttribute("href");
			verifylinks(url);
		}
	}

	public static void verifylinks(String linkURL) throws Exception {
		try {
			URL url = new URL(linkURL);
			HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
			httpURLConnection.setConnectTimeout(5000);
			httpURLConnection.connect();

			if (httpURLConnection.getResponseCode()>=400) {
				System.out.println(linkURL+" - " +httpURLConnection.getResponseMessage()+ "is a broken link");
			} else {
				System.out.println(linkURL+" - " +httpURLConnection.getResponseMessage());
			}

		} catch (Exception e) {

		}

	}

}
