package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {

		// Setting up chrome driver path because drivers are needed for communicating
		// selenium code with the browsers
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");

		// Initiating the driver
		WebDriver driver = new ChromeDriver();

		// Setting up wait
		// ElementNotVisibleException resolved
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Thread.sleep(1000);

		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");// doesnot wait but stores the history
																					// or cookies to navigate
		// driver.get("https://www.testandquiz.com/selenium/testing.html");//wait till
		// the page loads

		driver.manage().window().maximize();
		driver.findElement(By.linkText("This is a link")).click();

		// Go back to Home Page
		driver.navigate().back();

		// Go forward to Registration page
		driver.navigate().forward();

		// Refresh browser
		driver.navigate().refresh();

		// closing the browser
		driver.close();

	}
}
