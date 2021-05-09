package SeleniumConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownValidation {

	/* Select class -Used to handle the dropdown element in the webpage */

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();

		// Reference variable is created for select class
		Select sc = new Select(driver.findElement(By.id("searchDropdownBox")));

		// To fetch and print the list of options in the dropdown
		List<WebElement> el = sc.getOptions();
		for (WebElement w : el) {
			System.out.println(w.getText());
		}

		// sc.selectByVisibleText("Automotive");
		 
		// driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bike");
		// driver.findElement(By.id("nav-search-submit-button")).click();
		// sc.selectByIndex(2);
		//sc.selectByValue("search-alias=arts-crafts-intl-ship");

	}	

}
