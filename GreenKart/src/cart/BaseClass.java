package cart;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot"};

		addItems(driver, itemsNeeded);
	}

	private static void addItems(WebDriver driver, String[] itemsNeeded) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		int count = 0;
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");

			String formattedName = name[0].trim();

			List<String> itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName)) {
				driver.findElements(By.xpath("//div[@class=\"product-action\"]/button")).get(i).click();

				if (count == itemsNeeded.length) {
					break;
				}
			}
			
			driver.findElement(By.xpath("//img[@alt=\"Cart\"]")).click();
			
			driver.findElement(By.xpath("//button[text()=\"PROCEED TO CHECKOUT\"]")).click();
			
			driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
			
			driver.findElement(By.cssSelector(".promoBtn")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
			String locator = driver.findElement(By.className("promoInfo")).getText();
			
			System.out.println(locator);
			
			driver.findElement(By.xpath("//button[text()='Place Order']")).click();
			
			WebElement country = driver.findElement(By.xpath("//div[@class='wrapperTwo']//div//select"));
			country.click();
			Select select = new Select(country);
			select.selectByVisibleText("India");
			
			driver.findElement(By.className("chkAgree")).click();
			
			driver.findElement(By.xpath("//button[text()='Proceed']")).click();
			
			System.out.println(driver.findElement(By.xpath("//span[contains(text(),\"Thank you\")]")).getText());
			
		}
	}

}
