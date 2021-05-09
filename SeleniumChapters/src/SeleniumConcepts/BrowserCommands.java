package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		// Setting up chrome driver path
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");

		// Initiating the driver
		WebDriver driver = new ChromeDriver();

		// Setting up wait
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com");

		// get the current page title
		
		String title = driver.getTitle();
		// print the title in the eclipse console
		System.out.println("title of the current page is " + title);

		// get the current page URL
		String Url = driver.getCurrentUrl();
		// printing the URL in the console
		System.out.println( "current url of the page " +Url);

		if (Url.equals("https://www.facebook.com/")) {
			System.out.println("The correct Url is opened");
		} else {
			System.out.println(" An incorrect Url is opened");
		}

		//get the current page source code
		//String Sourcecode = driver.getPageSource();
		//System.out.println("Source code" +Sourcecode);

		// getting the Source code length in int variable
		//int SourcecodeLength = Sourcecode.length();

		// Printing the length of the Page Source
	//	System.out.println("Total length of the page" + SourcecodeLength);
		// Closing the browser
		 driver.close();
	}

}
