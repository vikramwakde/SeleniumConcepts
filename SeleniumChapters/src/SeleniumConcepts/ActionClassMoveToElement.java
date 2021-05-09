package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMoveToElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		// System.setProperty("Propertyname", "propertyvalue");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);

		WebElement el = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
		a.moveToElement(el).build().perform();

		driver.findElement(By.xpath("//span[contains(text(),'Account')]")).click();

		WebElement el1 = driver.findElement(By.id("ap_email"));

		el1.sendKeys("subasri");

		driver.close();

	}

}
