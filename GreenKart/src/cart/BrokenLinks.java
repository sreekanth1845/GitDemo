package cart;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/broken");
		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {
			String url = link.getAttribute("href");
			verifyLink(url);
		}

		driver.quit();
	}

	private static void verifyLink(String url) {

		try {
			URL link = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) link.openConnection();
			connection.setConnectTimeout(3000);
			connection.connect();

			if (connection.getResponseCode() == 200)
				System.out.println(url + "-" + connection.getResponseMessage());
			else
				System.out.println(url + "-" + connection.getResponseMessage() + "-" + "is a broken link");
		} catch (Exception e) {
			System.out.println(url + "-" + "is a broken link");
		}
	}

}
