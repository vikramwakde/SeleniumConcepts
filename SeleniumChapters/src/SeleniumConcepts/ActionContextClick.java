package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionContextClick {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		driver.get("http://google.com"); 
		 driver.manage().window().maximize();
		 driver.findElement(By.name("q")).sendKeys("London");
		 
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 
		 WebElement ele= driver.findElement(By.xpath("//a[text()='Sign in']"));
		 
		 Actions action = new Actions(driver);
		 
		 action.moveToElement(ele);
		 action.contextClick(ele).build().perform();;
	}

}
