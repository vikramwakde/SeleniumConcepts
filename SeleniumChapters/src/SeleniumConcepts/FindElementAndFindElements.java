package SeleniumConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementAndFindElements {

	public static void main(String[] args) {
		
		/*Find Element command is used to uniquely identify a (one) web element within the web page
		 * Find Elements command is used to uniquely identify the list of web elements within the web page
		 * FindElements takes in By object as the parameter and returns a list of web elements*/

		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("btnK")).click();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for(WebElement a:links)
		{
			System.out.println(a.getText());
		}
		System.out.println("****************************");
		
		System.out.println("Number of elements:" +links.size());
		
		driver.close();
	}

}
